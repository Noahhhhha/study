package com.study.pattern.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * 被观察者
 *
 * @author yml
 * @since 2022/4/13 15:48
 */
public class GPer<T> implements Subject<T> {
    private final List<Observer<T>> observers = new ArrayList<>();
    private static final String NAME = "GPer 平台";

    private static GPer gPer = null;

    private GPer(){}

    public static GPer newInstance(){
        if (null == gPer){
            gPer = new GPer();
        }
        return gPer;
    }

    public String getName() {
        return NAME;
    }

    @Override
    public boolean addObserver(Observer<T> observer) {
        return !this.observers.contains(observer) && this.observers.add(observer);
    }

    @Override
    public boolean delObserver(Observer<T> observer) {
        return this.observers.remove(observer);
    }

    @Override
    public void notify(T event) {
        for (Observer<T> observer:this.observers) {
            observer.update(gPer, event);
        }
    }
}