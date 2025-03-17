package com.kaungmyat.javase.unittest;

import com.kaungmyat.javase.unittest.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTotal {
    @Test
    public void testTotal() {
        Total obj = new Total();
        int result = obj.sum(1, 2, 3);

        assertEquals(6, result);
    }
}
