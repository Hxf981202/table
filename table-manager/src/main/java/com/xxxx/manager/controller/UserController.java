package com.xxxx.manager.controller;

import com.xxxx.commer.result.BaseResult;
import com.xxxx.commer.result.FileResult;
import com.xxxx.manager.pojo.UserDemo;
import com.xxxx.manager.pojo.UserDemoExample;
import com.xxxx.manager.service.SendSmsService;
import com.xxxx.manager.service.UploadService;
import com.xxxx.manager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private SendSmsService sendSmsService;
    @Autowired
    private UploadService uploadService;
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }

    /**
     * 添加用户
     * @return
     */
    @RequestMapping("/list")
    public BaseResult userlist(@RequestBody Integer pageNum,Integer pageSize){

        return userService.selectUserList(pageNum,pageSize);
    }

    @RequestMapping("delete/{id}")
    public BaseResult userdelete(@PathVariable Integer id ){
        return userService.deleteUserById(id);

    }
    @PutMapping("update")
    public BaseResult userUpdate(@RequestBody UserDemo userDemo){

        return userService.updateUser(userDemo);
    }
    @PostMapping("save")
    public BaseResult userSave(@RequestBody UserDemo userDemo){
        System.out.println("User:"+userDemo);
        return userService.saveUser(userDemo);
    }
    @GetMapping("select/{id}")
    public BaseResult UserById(@PathVariable Integer id){
        System.out.println("id:"+id);
        return userService.selectUserById(id);
    }
    @RequestMapping("sms")
    public BaseResult sms(String phone, HttpServletRequest request, HttpServletResponse response) {
        //从session中获取验证码
        String capText = (String) request.getSession().getAttribute("pictureVerifyKey");
        //3分钟前发送了验证码
        if (capText != null) {
            return BaseResult.error();
        }

        return sendSmsService.sendSms(phone, request);
    }
        @RequestMapping("upload")
        private FileResult upload (String photo, MultipartFile file) throws IOException {
            FileResult fileResult = null;
            // System.out.println(file.getName());
            // System.out.println(file.getOriginalFilename());
            String filename = file.getOriginalFilename();
            System.out.println(filename);
            //格式化时间
            String date = DateTimeFormatter.ofPattern("yyyy/MM/dd/").format(LocalDateTime.now());
            filename = date + System.currentTimeMillis() + filename.substring(filename.lastIndexOf("."));
            fileResult = uploadService.upload(file.getInputStream(), filename);
            fileResult.setMessage(photo);
            return fileResult;
        }
    }