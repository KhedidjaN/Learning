package SKenKharayLearning;

import java.util.Scanner;

public class FirstClass {
    /*
   Create a Java program and store values of mortgage rate and mortgage price.
First, program should check if rate is higher than 4.5 user will not buy a house,
 otherwise user will consider buying. Once user decides to buy a house,
 if price of the house is larger than 200000 than user will take a loan, otherwise user will pay cash.

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the mortgage rate");
        Double mortgageRate=scan.nextDouble();

        if (mortgageRate > 4.5) {
            System.out.println("Buyer will not buy a house");
        } else {
            System.out.println("Enter the price of house ");
            int morgagePrice = scan.nextInt();
            if (morgagePrice > 200000){
                System.out.println("the user will take a loan");
            }else {
                System.out.println("user will pay cash");
            }

        }

    }

}