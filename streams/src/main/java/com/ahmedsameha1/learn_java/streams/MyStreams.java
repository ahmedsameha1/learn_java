package com.ahmedsameha1.learn_java.streams;

import java.util.stream.Stream;

public class MyStreams {
    public static void main(String[] args) {
        var obj = new MyStreams();
        obj.getStream("a", "b", "c").forEach(System.out::println);
    }

    public <T> Stream getStream(T... t) {
        return Stream.of(t);
    }
}
