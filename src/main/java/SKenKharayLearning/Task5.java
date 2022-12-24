package SKenKharayLearning;

import java.util.Scanner;

public class Task5 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int monthIndex = scan.nextInt();
        switch (monthIndex) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3 :
                System.out.println("March");
                break;
            default:
                System.out.println("I dont know ");

        }


    }


}
