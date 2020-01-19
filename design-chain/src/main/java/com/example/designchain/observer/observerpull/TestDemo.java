package com.example.designchain.observer.observerpull;

/**
 * Copyright 2019 OnlySilence, Inc. All rights reserved.
 *
 * @Author: MuYa
 * @Date: 2020/1/16
 * @Time: 10:28
 * @Description: 两种模式的比较
 * 1.推模型是假定主题对象知道观察者需要的数据；而拉模型是主题对象不知道观察者具体需要什么数据，
 * 没有办法的情况下，干脆把自身传递给观察者，让观察者自己去按需要取值。
 * 2.推模型可能会使得观察者对象难以复用，因为观察者的update()方法是按需要定义的参数，可能无法
 * 兼顾没有考虑到的使用情况。这就意味着出现新情况的时候，就可能提供新的update()方法，或者是
 * 干脆重新实现观察者；而拉模型就不会造成这样的情况，因为拉模型下，update()方法的参数是主题
 * 对象本身，这基本上是主题对象能传递的最大数据集合了，基本上可以适应各种情况的需要。
 */
public class TestDemo {

    public static void main(String[] args) {
        //创建主题对象
        ConcreteSubject subject = new ConcreteSubject();
        //创建观察者对象
        Observer observer = new ConcreteObserver();
        //将观察者对象登记到主题对象上
        subject.attach(observer);
        //改变主题对象的状态
        subject.change("pull state change");
    }
}
