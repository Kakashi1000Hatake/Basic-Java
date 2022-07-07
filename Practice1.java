import java.util.*;

public class Practice1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Reverse the number

        // int num,rev,rem;
        // rev = 0;
        
        // System.out.print("Enter the number to be reversed : ");
        // num = sc.nextInt();

        // while(num != 0){
        //     rem = num % 10;
        //     rev = (rev * 10) + rem;
        //     num = num/10;
        // }
        // System.out.println("The Reverse Of Number is : "+rev);


        // Palindrome 

        // int num, rev, rem, temp;

        // rev = 0;
        // System.out.print("Enter the number to be checked for palindrome : ");
        // num = sc.nextInt();

        // temp = num;

        // while(num > 0){
        //     rem = num % 10;
        //     rev = (rev * 10) + rem;
        //     num = num/10;
        // }

        // if(temp == rev){
        //     System.out.println("The number "+temp+" is Palindrome");
        // }else{
        //     System.out.println("The number "+temp+" is not Palindrome");
        // }




        // Fibonacci Series

        // int n1, n2, n3, count, i;

        // System.out.print("Enter the count for the Fibonacci Series : " );
        // count = sc.nextInt();

        // n1 = 0;
        // n2 = 1;
        // System.out.print(n1+" "+n2);

        // for(i = 2; i < 10; ++i){
        //     n3 = n1 + n2;
        //     System.out.print(" "+n3);
        //     n1 = n2;
        //     n2 = n3;
        // }



        // Armstrong Number

        // int num, digit, sum, temp;

        // sum = 0;
        // System.out.println(" Enter the number to check for armstrong : ");
        // num = sc.nextInt();
        // String a = String.valueOf(num);
        // temp = num;

        // while(temp>0){
        //     digit = temp % 10;
        //     sum = (int) (sum + Math.pow(digit, a.length()));
        //     temp = temp / 10;
        // }

        // if(num == sum){
        //     System.out.println("The number is armstrong");
        // }else{
        //     System.out.println("the number is not armstrong");
        // }

        sc.close();
    }
}
