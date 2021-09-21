package com.bootcamp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LineClientTest {
    private static final double EPS = 1e-9;

    @Test
    public void shouldReturnCorrectLength() {
        LineClient lineClient = new LineClient();

        assertEquals(5.0, lineClient.calculateLength(0, 0, 3, 4), EPS);
    }
}
