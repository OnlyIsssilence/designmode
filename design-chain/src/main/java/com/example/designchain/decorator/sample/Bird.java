package com.example.designchain.decorator.sample;

/**
 * Copyright 2019 OnlySilence, Inc. All rights reserved.
 *
 * @Author: MuYa
 * @Date: 2020/1/20
 * @Time: 10:04
 * @Description:
 */
public class Bird extends Change {

    public Bird(TheGreatestSage sage) {
        super(sage);
    }

    @Override
    public void move() {
        // 代码
        System.out.println("Bird Move");
    }
}
