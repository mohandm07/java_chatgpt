package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SampleAppTest {

    @Test
    public void testAdd() {
        SampleApp app = new SampleApp();
        assertEquals(5, app.add(2, 3), "2 + 3 should equal 5");
    }
}
