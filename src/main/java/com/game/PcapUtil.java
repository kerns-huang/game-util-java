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
        InputStream is=PcapUtil.class.getResourceAsStream("/data_20170720.cap");
        byte[] buffer_4=new byte[4];
        byte[] buffer_2=new byte[2];
        int m=is.read(buffer_4);
        if(m!=4)//魔术字
        {
            return ;
        }
        m=is.read( buffer_2);//主要版本
        m=is.read(buffer_2);//次要版本
        m=is.read(buffer_4);//时间区域
        m=is.read(buffer_4);//sigflags
        m=is.read(buffer_4);//snaplen
        m=is.read(buffer_4);//linkType
        if(m >0)
        {

        }
    }
}
