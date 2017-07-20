/*
 * huiguan.com Inc.
 * Copyright (c) 2017 All Rights Reserved.
 */
package com.game;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 * TODO desc
 *
 * @author huangchunbo
 * @since $$Revision:1.0.0, $$Date: 2017/7/20 19:16 $$
 */
public class PcapUtil {
    public static void main(String[] args) throws IOException {
        InputStream inputStream=PcapUtil.class.getResourceAsStream("/data_20170720.cap");
        BufferedInputStream bufferedInputStream=new BufferedInputStream(inputStream);
        int flag=0;
        while((flag=bufferedInputStream.read())!=-1)
        {
          System.out.println(bufferedInputStream.read());
        }
    }
}
