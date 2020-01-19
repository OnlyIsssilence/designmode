package com.example.designchain.observer.jdkobserver;

import java.util.Observable;
import java.util.Observer;

/**
 * Copyright 2019 OnlySilence, Inc. All rights reserved.
 *
 * @Author: MuYa
 * @Date: 2020/1/19
 * @Time: 15:10
 * @Description:
 */
public class Watcher implements Observer {

    public Watcher(Observable o) {
        o.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {

        System.out.println("状态发生改变：" + ((Watched) o).getData());
    }

}
