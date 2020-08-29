package com.xxxx.manager.service;

import com.xxxx.commer.result.FileResult;

import java.io.InputStream;

public interface UploadService {
    /**
     * 文件上传
     * @param inputStream
     * @param fileName
     * @return
     */
    FileResult upload(InputStream inputStream, String fileName);
}