package com.study.pattern.observer;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author:yml
 * @Data:2022/4/13
 */
public class ClientTest {
    public static void main(String[] args) {
        new HashMap();
        GPer gPer = GPer.newInstance();
        Teacher tom = new Teacher("Tom");
        Teacher jerry = new Teacher("Jerry");

        gPer.addObserver(tom);
        gPer.addObserver(jerry);

        // 用户操作
        Question question = new Question();
        question.setUserName("汪翔森");
        question.setContent("如何学好JAVA？");

        gPer.notify(question);
    }
}