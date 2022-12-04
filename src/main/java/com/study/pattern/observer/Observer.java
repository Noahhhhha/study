package com.study.pattern.observer;

import java.util.function.Function;

public interface Observer<T> {
    void update(Subject subject, T task);

}
