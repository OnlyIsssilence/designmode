package com.example.designchain.tomcatfilter;

/**
 * Copyright 2019 OnlySilence, Inc. All rights reserved.
 *
 * @Author: MuYa
 * @Date: 2020/1/16
 * @Time: 11:46
 * @Description:
 */
interface BaseCase {
    /**
     * 所有 case 处理逻辑的方法
     * @param input
     * @param baseCase
     */
    void doSomething(String input, BaseCase baseCase);
}
