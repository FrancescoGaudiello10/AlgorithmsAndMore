/* QUIZ NUMBER 4 */

/* LINK => https://www.hackerrank.com/challenges/a-very-big-sum/problem */


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the aVeryBigSum function below.
    static long aVeryBigSum(long[] ar) {
        long somma = 0;
        for(int i = 0; i < ar.length; i++){
            somma = ar[i] + somma;
        }

        return somma;
    }
}