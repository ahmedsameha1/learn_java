package com.ahmedsameha1.learn_java.optional;

import java.util.OptionalInt; // Copied from: https://docs.oracle.com/javase/8/docs/api/java/util/OptionalInt.html
import java.util.Arrays; // Copied from: https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html

public class LearnOptional {
    public static void main(String[] args) {
        var obj = new LearnOptional();
        var optionalResult = obj.sumOver100(4, 3, 6, 111);
        if ( optionalResult.isPresent()) {
            System.out.println("The result is: " + optionalResult.getAsInt());
        } else {
            System.out.println("The result is below 100");
        }
    }

    // Returns OptionalInt that has the result if the result is over
    // 100, otherwise returns empty OptionalInt
    public OptionalInt sumOver100(int... ints) {
        var intStream = Arrays.stream(ints);
        var sum = intStream.reduce(0, Integer::sum);
        if (sum > 100) {
            return OptionalInt.of(sum);
        } else {
            return OptionalInt.empty();
        }
    }
}
