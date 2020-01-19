package com.example.designchain.tomcatfilter;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright 2019 OnlySilence, Inc. All rights reserved.
 *
 * @Author: MuYa
 * @Date: 2020/1/16
 * @Time: 11:50
 * @Description:
 */
public class CaseChain implements BaseCase {
    /**
     * 所有 case 列表
     */
    private List<BaseCase> mCaseList = new ArrayList<>();

    /**
     * 索引，用于遍历所有 case 列表
     */
    private int index = 0;

    /**
     * 添加 case
     *
     * @param baseCase
     * @return
     */
    public CaseChain addBaseCase(BaseCase baseCase) {
        mCaseList.add(baseCase);
        return this;
    }

    @Override
    public void doSomething(String input, BaseCase baseCase) {
        // 所有遍历完了，直接返回
        if (index == mCaseList.size()) {
            return;
        }
        // 获取当前 case
        BaseCase currentCase = mCaseList.get(index);
        // 修改索引值，以便下次回调获取下个节点，达到遍历效果
        index++;
        // 调用 当前 case 处理方法
        currentCase.doSomething(input, this);
    }
}