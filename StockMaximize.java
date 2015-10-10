/*Problem Statement

Your algorithms have become so good at predicting the market that you now know what the share price of Wooden Orange Toothpicks Inc. (WOT)
 will be for the next N days.
Each day, you can either buy one share of WOT, sell any number of shares of WOT that you own, or not make any transaction at all. 
What is the maximum profit you can obtain with an optimum trading strategy?*/



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        
        for(int i=0;i<num;i++)
            {
                int n=Integer.parseInt(br.readLine());
                int a[]=new int[n];
               
                 String s[]=(br.readLine()).split(" ");
                 for(int j=0;j<n;j++)
                     a[j]=Integer.parseInt(s[j]);
                 System.out.println(calculate(a));
            
            }
    }
    
    
   public static long calculate(int a[])
       {
            int price[]=new int[a.length];
            int n=a.length;
            price[n-1]=a[n-1];
       for(int i=n-2;i>=0;i--)
           {
                     price[i]=Math.max(price[i+1],a[i]);
           
           }
       long sum=0;
       for(int j=0;j<n;j++)
           {
               if(a[j]<price[j])
                   sum+=price[j]-a[j];
           
            }
       return sum;
       
       
       
       
       
       }
    
    
}