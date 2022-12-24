package SKenKharayLearning;

public class task4 {
    public static void main(String[]args){
        int number=1234, reversed=0;

        while (number !=0){
            int digit= number %10;
            reversed= reversed *10 +digit;
            number/=10;

        }
        System.out.println("reversed number is "+ reversed);
    }
}
