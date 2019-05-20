/* QUIZ NUMBER 5*/

/* LINK => https://www.hackerrank.com/challenges/diagonal-difference/problem */


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] arr){

        int sommaRiga1 = 0; 
        int sommaRiga2 = 0; 

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(i == j){
                    sommaRiga1 = sommaRiga1 + arr[i][j]; 
                }
            } 
        }
        // --------

        int k = arr.length-1;
        for(int i = 0; i < arr.length; i++){
            
            sommaRiga2 = sommaRiga2 + arr[i][k]; 
            k--;
        }

        if(sommaRiga1 > sommaRiga2){
            return sommaRiga1-sommaRiga2;
        }
        else if(sommaRiga2 > sommaRiga1){
            return sommaRiga2-sommaRiga1;
        }
        else 
            return 0; 
    }
}