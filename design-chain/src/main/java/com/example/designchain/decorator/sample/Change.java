package com.example.designchain.decorator.sample;

/**
 * Copyright 2019 OnlySilence, Inc. All rights reserved.
 *
 * @Author: MuYa
 * @Date: 2020/1/20
 * @Time: 10:03
 * @Description: 抽象装饰角色“七十二变”
 */
public class Change implements TheGreatestSage {
    private TheGreatestSage sage;

    public Change(TheGreatestSage sage) {
        this.sage = sage;
    }

    @Override
    public void move() {
        // 代码
        sage.move();
    }

}
