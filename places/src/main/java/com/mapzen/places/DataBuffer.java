package com.mapzen.places;

public interface DataBuffer<T> {
    int getCount();
    T get(int index);
}
