package com.example.designchain.tomcatfilter;

/**
 * Copyright 2019 OnlySilence, Inc. All rights reserved.
 *
 * @Author: MuYa
 * @Date: 2020/1/16
 * @Time: 9:38
 * @Description:
 */
public class TestChain {
    public static void main(String[] args) {
        String input = "2";
        CaseChain caseChain = new CaseChain();
        caseChain.addBaseCase(new OneCase())
                .addBaseCase(new TwoCase());
        caseChain.doSomething(input, caseChain);
    }
}
