package day01;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class NumberSequenceTest {

    @org.junit.jupiter.api.Test
    void testCloseToAverage() {
        NumberSequence sequence = new NumberSequence(Arrays.asList(1,2,3,4,5,6,7,8,9));
        assertEquals(Arrays.asList(4,5,6),sequence.closeToAverage(2));
    }
}