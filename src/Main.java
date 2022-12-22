/*
 *Author Emircan Aktas - 20.Dec.2022
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Write a program that sorts the 3 entered numbers "from least to greatest".

        int number1, number2, number3;
        Scanner inp = new Scanner(System.in);

        System.out.println("***********************");
        System.out.println("Enter different numbers.");
        System.out.println("***********************");
        System.out.print("Enter the number1 :");
        number1 = inp.nextInt();
        System.out.print("Enter the number2 :");
        number2 = inp.nextInt();
        System.out.print("Enter the number3 :");
        number3 = inp.nextInt();

        if(number1 > number2 && number1 >number3){
            if (number2 >number3){
                System.out.println(number1+">"+number2+">"+number3);
            }else {
                System.out.println(number1+">"+number3+">"+number2);
            }
        } else if (number2 > number1 && number2 >number3) {
            if (number1>number3){
                System.out.println(number2+">"+number1+">"+number3);
            }else{
                System.out.println(number2+">"+number3+">"+number1);
            }
        } else if (number3 > number1 && number3 >number2) {
            if (number1>number2){
                System.out.println(number3+">"+number1+">"+number2);
            }else {
                System.out.println(number3+">"+number2+">"+number1);
            }
        }else {
            System.out.println("You have made a wrong transaction.");
        }
    }
}
