import java.util.Scanner;

public class Prime_Numer {
    public static void main(String[] args) {
        int i, num;
        boolean flag = true;
        //thaling input from console
        //input stored inside num
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        num = sc.nextInt();
        for (i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        //if flag!=0
        if (!flag) {
            // print if it is prime
            System.out.println(" The No is prime number");
        } else {
            //print if it is not prime
            System.out.println("The No is not prime number");
        }
    }
}


