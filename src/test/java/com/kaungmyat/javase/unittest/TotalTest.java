package com.kaungmyat.javase.unittest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TotalTest {
    @Test
    public void testTotal() {
        Total obj = new Total();
        int result = obj.sum(1, 2, 3);

        Assertions.assertEquals(6, result);
    }
}