package SKenKharayLearning;

public class Task9 {

    public static void main(String[]args){
      // 1 to 20 , skip 5 6 7

        for (int i=1; i<=20; i++){
            if (i== 5 || i==6 || i==7)
                continue;
            System.out.println(i+" ");
        }

    }

}
