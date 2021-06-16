/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample1;

import java.util.Scanner;


public class Sample1 {

    public static void main(String[] args) {
        // TODO code application logic here
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int a[]=new int[n];
       int temp=0,c=0,c1=0;
       int r=0,t=0;
       for(int i=0;i<n;i++)
       {
           a[i]=s.nextInt();
       }
       for(int j=0;j<n;j++)
       {
           
         temp=a[j];
         if(temp==5)
         {
             c++;
             if(c>0)
        {
        c1++;
        c=0;
        }
         }
         else
         {
            temp=a[j];
        do{
       r=temp%10;
      if(r==5)
      {
          c++;
      }
   //    System.out.println(r);
       t=temp/10;
       if(t==5){
           c++;
       }
       temp=t;
 //      System.out.println(temp);
       } while(temp>9);
        if(c>0)
        {
        c1++;
        c=0;
        }
       }
       }
    System.out.println(c1);
    }
    
}
