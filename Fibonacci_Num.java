import java.util.Scanner;

public class Fibonacci_Num {
    public static void main(String[] args) {
        int num1 = 0, num2 = 1, num3, i, count;
        //Take input count from console
        //input stored in count
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the no of counts");
        count = sc.nextInt();
        //printing 0 and 1
        System.out.println(num1 + "," + num2);
        //loop to apply formula
        //loop starts from 2 because o and 1 already exist
        for (i = 2; i < count; i++) {
            num3 = num1 + num2;
            System.out.print("," + num3);
            num1 = num2;
            num2 = num3;
        }
    }
}
