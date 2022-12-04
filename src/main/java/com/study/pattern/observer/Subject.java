package com.study.pattern.observer;

public interface Subject<T> {
    boolean addObserver(Observer<T> observer);

    boolean delObserver(Observer<T> observer);

    void notify(T event);
}
