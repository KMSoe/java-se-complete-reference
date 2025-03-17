package com.kaungmyat.javase.unittest;

public class Total {
    public int sum(int ...arr) {
        int total = 0;

        for (int item : arr ) {
            total += item;
        }

        return total;
    }
}
