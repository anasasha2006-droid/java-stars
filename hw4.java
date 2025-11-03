
package anas.siiiiiii;

import java.util.Scanner;


public class hw4 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=x.nextInt();//نفرض اني قيمه n=5
        for(int i =0; i< n;i++){
            for(int j=0; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
                
    }
}
