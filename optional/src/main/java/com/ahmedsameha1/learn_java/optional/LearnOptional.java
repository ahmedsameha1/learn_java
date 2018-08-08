package com.ahmedsameha1.learn_java.optional;

import java.util.OptionalInt; // Copied from: https://docs.oracle.com/javase/8/docs/api/java/util/OptionalInt.html
import java.util.Arrays; // Copied from: https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html
import java.util.Optional;

public class LearnOptional {
    public static void main(String[] args) {
        var obj = new LearnOptional();
        var optionalResult = obj.sumOver100(4, 3, 6, 111);
        if ( optionalResult.isPresent()) {
            System.out.println("The result is: " + optionalResult.getAsInt());
        } else {
            System.out.println("The result is below 100");
        }
        var concatResult = obj.concatOver10("aa" + "bbbbbb");
        concatResult.ifPresent(System.out::println);
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

    public Optional<String> concatOver10(String... strings) {
        var stream = Arrays.stream(strings);
        var result = stream.reduce("", (s1, s2) -> s1 + s2);
        if (result.length() > 10) {
            return Optional.of(result);
        } else {
            return Optional.empty();
        }
    }
}
