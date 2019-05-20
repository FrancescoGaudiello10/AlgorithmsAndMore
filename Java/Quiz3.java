/* QUIZ NUMBER 3*/

/* LINK => https://www.hackerrank.com/challenges/compare-the-triplets/problem */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        //Creo una nuova lista di 2 elementi
        List<Integer> ris = new ArrayList<>(); 

        int incrA = 0; 
        int incrB = 0; 

        int ind = 0; 
        //Finchè una delle due non è vuota
        while(!a.isEmpty() && !b.isEmpty()){
            if(a.get(ind) > b.get(ind)){
                incrA++;
                System.out.println("[A] Sto incrementando..");
            }
            else if(a.get(ind) < b.get(ind)){
                incrB++;
                System.out.println("[B] Sto incrementando.."); 
            }
            else{
                System.out.println("Gli elementi sono uguali.");
            }
            System.out.println("Operazione di rimozione..");
            a.remove(ind); 
            b.remove(ind); 
        }

        ris.add(incrA);
        ris.add(incrB); 
        return ris; 
    }
}