package com.example.designchain.decorator.sample;

/**
 * Copyright 2019 OnlySilence, Inc. All rights reserved.
 *
 * @Author: MuYa
 * @Date: 2020/1/20
 * @Time: 10:03
 * @Description: 具体装饰角色“鱼儿”
 */
public class Fish extends Change {

    public Fish(TheGreatestSage sage) {
        super(sage);
    }

    @Override
    public void move() {
        super.move();
        // 代码
        System.out.println("Fish Move");
    }
}
