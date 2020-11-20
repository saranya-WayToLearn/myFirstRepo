package programs;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class LeftRotation {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
    	int aLen = a.length;
    	int[] newArr = new int[aLen];
    	for(int i=0;i<aLen;i++) {
    		int index = i-d;
    		if(index<0) {
    			index=index+aLen;
    		}
    		newArr[index]=a[i];
    	}
    	
		return newArr;
    }


    public static void main(String[] args) {

        int n = 5;

        int d = 5;

        int[] a = {1,2,3,4,5,7,8,9};


        int[] result = rotLeft(a, d);

        for(int i=0;i<result.length;i++) {
        	 System.out.print(result[i]);
    		}
       
    }
}
