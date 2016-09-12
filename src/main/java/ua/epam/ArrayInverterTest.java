package ua.epam;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by Nadiia_Tatomyr on 9/12/2016.
 */
public class ArrayInverterTest {
    @org.junit.Test
    public static void main(String[] args) {
           testInvert(new int[]{});
                testInvert(new int[]{0});
                testInvert(new int[]{0, 1});
                 testInvert(new int[]{0, 3, 6, 7, 5, 8});
             }
    private static void testInvert(int[] arr) {
                System.out.print(Arrays.toString(arr) + " -> ");
                 ArrayInverter.invert(arr);
                System.out.println(Arrays.toString(arr));
            }


}
