
package com.mycompany.java_hw;

import java.util.Scanner;

public class Java_hw {

    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.print("enter the nuber of enter valus:");
        int n=x.nextInt();
        int[] firstarray=new int[n];
        int[] sucondarray=new int[n];
        for(int i=0; i<firstarray.length;i++){
            System.out.println("enter the number"+(i+1)+": ");
            firstarray[i]=x.nextInt();
        }
        for(int i=0; i<firstarray.length;i++){
            int R=firstarray[i];
            if(R % 2 == 0){
                sucondarray[i] =R*R;
                System.out.println("the number:"+R+"even-->"+R+"*"+R+"= "+sucondarray[i]);
            }else{
                sucondarray[i]=R+R;
                System.out.println("the number:"+R+"odd-->"+R+"+ "+R+"= "+sucondarray[i]);
                
                
            } 
        }
        int total_sum=0;
        for(int i=0; i<sucondarray.length;i++){
            total_sum+=sucondarray[i];
        }
        System.out.println("total_sum = "+total_sum);
    }
}
