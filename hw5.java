

import java.util.Scanner;


public class hw5 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=x.nextInt();
        for(int i =1; i<= n ;i++){
            for(int j= i; j < n; j++){
                System.out.print(" ");
            }
            for(int h=1; h<=i;h++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
