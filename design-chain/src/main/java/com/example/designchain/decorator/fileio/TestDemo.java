package com.example.designchain.decorator.fileio;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Copyright 2019 OnlySilence, Inc. All rights reserved.
 *
 * @Author: MuYa
 * @Date: 2020/1/20
 * @Time: 11:32
 * @Description:
 */
public class TestDemo {

    public static void main(String[] args) throws IOException {
        // 流式读取文件
        DataInputStream dis = null;
        try {
            dis = new DataInputStream(
                    new BufferedInputStream(
                            new FileInputStream("test.txt")
                    )
            );
            //读取文件内容
            byte[] bs = new byte[dis.available()];
            dis.read(bs);
            String content = new String(bs);
            System.out.println(content);
        } finally {
            dis.close();
        }
    }
}
