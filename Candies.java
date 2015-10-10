/*Problem Statement

Alice is a kindergarden teacher. She wants to give some candies to the children in her class.  All the children sit in a line, and each 
 of them has a rating score according to his or her performance in the class.  Alice wants to give at least 1 candy to each child. If two children
 sit next to each other, then the one with the higher rating must get more candies. Alice wants to save money, so she needs to minimize the total number of candies. */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int a[]=new int[n];
 	int c[]=new int[n];
        for(int i=0;i<n;i++)
            {
                a[i]=Integer.parseInt(br.readLine());
            }
       
        for(int i=0;i<n;i++)
            {
                c[i]=1;
            }
        
        for(int j=1;j<n;j++)
            {
                if(a[j]>a[j-1])
                    c[j]=c[j-1]+1;
            }
        
        for(int k=n-2;k>=0;k--)
            {
                if(a[k]>a[k+1])
                    c[k]=Math.max(c[k+1]+1,c[k]);
            
            }
        int count=0;
        for(int i=0;i<n;i++)
            {
            count+=c[i];
       	    }
        
        System.out.println(count);
  
        
    }
}