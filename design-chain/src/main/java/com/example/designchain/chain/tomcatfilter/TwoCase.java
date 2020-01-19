package com.example.designchain.chain.tomcatfilter;

/**
 * Copyright 2019 OnlySilence, Inc. All rights reserved.
 *
 * @Author: MuYa
 * @Date: 2020/1/16
 * @Time: 11:51
 * @Description:
 */
public class TwoCase implements BaseCase {
    @Override
    public void doSomething(String input, BaseCase baseCase) {
        if ("2".equals(input)) {
            // TODO do something
            System.out.println(getClass().getName());
            return;
        }
        //当前没法处理，回调回去，让下一个去处理
        baseCase.doSomething(input, baseCase);
    }
}
