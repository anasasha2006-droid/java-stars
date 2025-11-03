
package anas.sooo;

import java.util.Scanner;


public class hw7 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=x.nextInt();
        for(int i=1; i<=n;i++){
           for(int j=i; j<n;j++){
               System.out.print(" ");
           }
           
                System.out.print("*");
            
            System.out.println();
        }
    }
}
