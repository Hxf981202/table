package com.xxxx.manager.service.impl;

import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.Region;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;
import com.xxxx.commer.result.FileResult;

import java.io.InputStream;

public class UploadService implements com.xxxx.manager.service.UploadService {
    @Override
    public FileResult upload(InputStream inputStream, String fileName) {
        FileResult result = new FileResult();
        //构造一个带指定 Region 对象的配置类
        Configuration cfg = new Configuration(Region.region0());
        //...其他参数参考类注释
        UploadManager uploadManager = new UploadManager(cfg);
        //...生成上传凭证，然后准备上传
        String accessKey = "gpWL7rHISpMzq7yWddEN_WRUk8UnubuupNthcC3Q";
        String secretKey = "jez1pZYt-5hO1QwRIb9E4VcwqG3GtJSIfgx4IoAr";
        String bucket = "bank-next";
        //默认不指定key的情况下，以文件内容的hash值作为文件名
        String key = fileName;
        try {
            Auth auth = Auth.create(accessKey, secretKey);
            String upToken = auth.uploadToken(bucket);
            try {
                Response response = uploadManager.put(inputStream,key,upToken,null, null);
                //解析上传成功的结果
                if (response.statusCode==200){
                    result.setSuccess("success");
                    result.setMessage("上传成功");
                    result.setFileUrl("http://qfru5q0g2.hd-bkt.clouddn.com/"+fileName);
                    return result;
                }else {
                    result.setError("error");
                    result.setMessage("上传失败");
                    return result;
                }
            } catch (QiniuException ex) {
                result.setError("error");
                result.setMessage("上传失败");
                Response r = ex.response;
                System.err.println(r.toString());
                try {
                    System.err.println(r.bodyString());
                } catch (QiniuException ex2) {
                    //ignore
                }
            }
        } catch (Exception ex) {
            //ignore
        }
        return result;
    }
}
