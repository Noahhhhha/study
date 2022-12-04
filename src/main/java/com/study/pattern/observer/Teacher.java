package com.study.pattern.observer;

import java.util.Observable;
import java.util.function.Function;

/**
 * @Author:yml
 * @Data:2022/4/13
 */
public class Teacher<T> implements Observer<T> {
    private String name;

    public Teacher(String name){
        this.name = name;
    }

    @Override
    public void update(Subject subject, T task) {
        GPer gPer = (GPer) subject;
        Question question = (Question) task;
        System.out.println("===========================================");
        System.out.println(this.name + "老师，你好 \n" + "您收到一条来自" + gPer.getName() + "\n" + "提问者：" + question.getUserName() +
                "\n" + "问题描述：" + question.getContent());
    }
}