package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void findMinTest() {
        Solution solution = new Solution();
        assertEquals(1, solution.findMin(new int[]{3,4,5,1,2}));
        assertEquals(0, solution.findMin(new int[]{4,5,6,7,0,1,2}));
        assertEquals(11, solution.findMin(new int[]{11,13,15,17}));
    }
}