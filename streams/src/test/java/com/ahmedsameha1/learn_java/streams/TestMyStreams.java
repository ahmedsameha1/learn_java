package com.ahmedsameha1.learn_java.streams;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.stream.Stream;

public class TestMyStreams {
    private MyStreams myStreams;

    @Test
    public void test() {
        myStreams = new MyStreams();
        assertEquals(Stream.of("a", "b", "c"), myStreams.getStream("a", "b", "c"));
    }
}
