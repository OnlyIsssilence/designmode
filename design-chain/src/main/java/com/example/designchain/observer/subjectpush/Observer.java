package com.example.designchain.observer.subjectpush;

/**
 * Copyright 2019 OnlySilence, Inc. All rights reserved.
 *
 * @Author: MuYa
 * @Date: 2020/1/19
 * @Time: 14:37
 * @Description:
 */
public interface Observer {
    /**
     * 更新接口
     *
     * @param state 更新的状态
     */
    void update(String state);
}
