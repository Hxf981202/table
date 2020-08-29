package com.xxxx.manager.service.impl;

import com.github.qcloudsms.SmsSingleSender;
import com.github.qcloudsms.SmsSingleSenderResult;
import com.github.qcloudsms.httpclient.HTTPException;
import com.xxxx.commer.result.BaseResult;
import com.xxxx.commer.util.CodeUtil;
import com.xxxx.manager.service.SendSmsService;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

@Service
public class SendMessageServiceImpl implements SendSmsService {

    /**
     *
     * 发送短信
     * @param phoneNum
     * @return
     * @throws HTTPException
     * @throws IOException
     */
    @Override
    public BaseResult sendSms(String phoneNum, HttpServletRequest request) {
        int appid = 1400418630;
        String appkey = "nKehW4KIbcMinb7U4LVN4T8Vcp1xe6Py";
        String[] phoneNumbers = {phoneNum}; //手机号可以添很多。
        int templateId = 309046;
        String smsSign = "好好学习";
    System.out.println("1");
        try {
            //第一个参数传递{1}位置想要的内容，第二个传递{2}的内容，以此类推。具体看步骤5
            String code = CodeUtil.getCode();
            String[] params = {code,"5"};
            SmsSingleSender ssender = new SmsSingleSender(appid, appkey);
            SmsSingleSenderResult result = ssender.sendWithParam("86", phoneNumbers[0],
                    templateId, params, smsSign, "", "");
            System.out.println("2");
      System.out.println(result);
            if(result.errMsg.equals("OK")){
                //将code值存储
                HttpSession session = request.getSession();
                session.setAttribute("code",code);
                //TimerTask实现5分钟后从session中删除checkCode
                final Timer timer=new Timer();
                System.out.println("3");
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        session.removeAttribute("code");
                        System.out.println("code");
                        timer.cancel();
                    }
                },5*60*1000);
                return BaseResult.success();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return BaseResult.error();
    }

}
