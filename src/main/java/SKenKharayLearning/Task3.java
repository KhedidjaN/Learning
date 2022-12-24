package SKenKharayLearning;

public class Task3
/*
I want to print num from 1 to 20 skip5 6,7
 */

{
    public static void main (String[]args){

        for (int i=1; i<=20; i++){
            if (i==5 || i==6 || i==7){
                continue;
            }
            System.out.print(i+" ");
        }

    }
}
