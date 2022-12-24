package SKenKharayLearning;


import java.lang.*;
import java.io.*;
import java.util.*;

public class task7 {
    public static void main(String[] args) {
        //first method to reverse a String
       String str="Work"; // krow
        byte[] strAsByteArray=str.getBytes();
        byte [] result=new byte[strAsByteArray.length];
        for (int i=0; i<strAsByteArray.length; i++)
            result[i]=strAsByteArray[strAsByteArray.length-i-1];
        System.out.println(new String(result));
   // second method to reverse a String



    }
}
