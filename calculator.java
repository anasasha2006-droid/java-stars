 
package anas.test;

import java.util.Scanner;

public class calcolater {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("enter the number 1:");
        double num1=x.nextDouble();
        System.out.println("enter the number 2:");
        double num2=x.nextDouble();
        System.out.println("enter the opiration (*,+,/,-):");
        char op=x.next().charAt(0);
        switch (op) {
            case '+':
                System.out.println("result= "+(num1+num2));
                break;
            case '-':
                System.out.println("result= "+(num1-num2));
            case '*':
                System.out.println("result= "+(num1*num2));
            case '/':
                    if(num2 !=0){
                      System.out.println("result= "+(num1/num2));
                    }else{
                      System.out.println("not found");
                    }
             default:
                System.out.println("not exist");
        }
        
    }
   
}
