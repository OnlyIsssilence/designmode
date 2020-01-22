package com.example.designchain.decorator.base;

/**
 * Copyright 2019 OnlySilence, Inc. All rights reserved.
 *
 * @Author: MuYa
 * @Date: 2020/1/20
 * @Time: 9:55
 * @Description:
 */
public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void sampleOperation() {
        super.sampleOperation();
        // 写相关的业务代码
    }
}
