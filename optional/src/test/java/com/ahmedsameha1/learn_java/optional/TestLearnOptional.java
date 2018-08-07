package com.ahmedsameha1.learn_java.optional;

// Following the tutorial at: https://www.youtube.com/watch?v=FZVjICj_1vE&index=2&list=PL_WCPOWW_gJEJkasFUTZEHSMFKi76_VXA
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.OptionalInt;

public class TestLearnOptional {
    @Test
    public void test() {
        LearnOptional obj = new LearnOptional();
        // Following https://stackoverflow.com/a/38958484
        assertEquals(OptionalInt.empty(), obj.sumOver100());
        assertEquals(OptionalInt.of(105), obj.sumOver100(10, 10, 85));
        assertEquals(OptionalInt.empty(), obj.sumOver100(11, 55));
    }
}
