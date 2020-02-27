package org.epam.learn;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TrainingDay1Test {

    public static int sum(int a, int b) {
        return a + b;
    }

    /*
     * public static void main(String[] args) { int c = sum(3,3);
     *
     * System.out.println("The sum is:" +c);
     *
     * if(c ==5) { System.out.println("Passed, The sum is:" +c); } else {
     * System.out.println("Failed:"); }
     *
     * }
     */

    @Test
    public void testSum() {
        assertEquals(5, sum(2,3));
        assertEquals(6, sum(3,3));
    }
}
