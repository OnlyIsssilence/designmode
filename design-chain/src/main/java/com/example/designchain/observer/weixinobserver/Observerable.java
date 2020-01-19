package com.example.designchain.observer.weixinobserver;

/**
 * Copyright 2019 OnlySilence, Inc. All rights reserved.
 *
 * @Author: MuYa
 * @Date: 2020/1/19
 * @Time: 15:28
 * @Description:抽象被观察者接口 * 声明了添加、删除、通知观察者方法
 */
public interface Observerable {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObserver();

}
