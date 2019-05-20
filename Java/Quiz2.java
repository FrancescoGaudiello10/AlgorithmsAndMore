/* QUIZ NUMBER 2. */

/* LINK => https://www.hackerrank.com/challenges/simple-array-sum/problem */

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Quiz2 {

    static int simpleArraySum(int[] ar) {
        
        // Solution:
        int somma = 0;
        for(int i = 0; i < ar.length; i++){
            somma = somma + ar[i];
        }
        return somma;         
    }
}