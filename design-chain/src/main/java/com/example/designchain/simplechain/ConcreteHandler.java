package com.example.designchain.simplechain;

/**
 * Copyright 2019 OnlySilence, Inc. All rights reserved.
 *
 * @Author: MuYa
 * @Date: 2020/1/16
 * @Time: 9:38
 * @Description:
 */
public class ConcreteHandler extends Handler {
    /**
     * 处理方法，调用此方法处理请求
     */
    @Override
    public void handleRequest() {
        /**
         * 判断是否有后继的责任对象
         * 如果有，就转发请求给后继的责任对象
         * 如果没有，则处理请求
         */
        if (getSuccessor() != null) {
            System.out.println("放过请求");
            getSuccessor().handleRequest();
        } else {
            System.out.println("处理请求");
        }
    }

}