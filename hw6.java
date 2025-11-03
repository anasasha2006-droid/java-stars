
package anas.sii;

import java.util.Scanner;


public class hw6 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("enter yhe number:");
        int n=x.nextInt();
        for(int i =0; i< n;i++){
            for(int j=0; j< i;j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}
