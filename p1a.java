
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooad;
import java.util.Scanner;

public class p1a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.print("Enter first number: ");
        num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        num2 = sc.nextInt();
        try{
            System.out.println(num1+num2);
            System.out.println(num1-num2);
            System.out.println(num1*num2);
            System.out.println(num1/num2);
        }
        catch(ArithmeticException e){
            System.out.println("exception caught");
        }
    }
    
}
