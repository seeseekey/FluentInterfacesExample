package org.example.fluentinterfaces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class StarterTests {

    @Test
    void testMinimalClass() {

        Starter minimal = new Starter();
        assertNotNull(minimal);
    }
}
