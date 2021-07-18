import java.util.Scanner;

public class Perfect_num {
    public static void main(String[] args) {
        int i, num, sum = 0;
        //take input number from console
        //number stored in num
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number");
        num = sc.nextInt();
        for (i = 1; i < num; i++) {
            // condition to check num is perfectly divisible by i or not
            //if num is perfectly divisible i added to sum
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        // IF sum = num condition true
        //else conditiuon is false
        if (sum == num) {
            System.out.println(" The number is perfect Number");
        } else {
            System.out.println("The number is not perfect Number");

        }
    }
}

