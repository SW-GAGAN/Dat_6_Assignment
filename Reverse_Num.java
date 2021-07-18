import java.util.Scanner;

public class Reverse_Num {
    public static void main(String[] args) {
        int num, rnum = 0;
        //Taking input from Console
        //input data stored inside num
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to be Revesed :");
        num = sc.nextInt();
        //condion num!=0
        //dividing num by 10 soring reminder at rnum afeter * rnum by 10
        while (num != 0) {
            rnum = rnum * 10;
            rnum = rnum + num % 10;
            num = num / 10;
        }
        //print reversed no
        System.out.println("The reversed number is :" + rnum);

    }
}

