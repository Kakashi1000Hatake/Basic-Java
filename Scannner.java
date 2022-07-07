import java.util.Scanner;

public class Scannner {
    public static void main(String[] args) {
        //Enter name and age
    Scanner sc = new Scanner(System.in);
    int a, b, sum, sub, mul, div, mod;
    String name, gen;
    
    // String name;
    // int age;

    // System.out.println("Enter your name : ");
    // name = sc.nextLine();

    // System.out.println("Enter your age : ");
    // age = sc.nextInt();

    System.out.print("Enter your Name : ");
    name = sc.nextLine();

    System.out.print("Enter your Gender : ");
    gen = sc.nextLine();

    System.out.print("Enter the value of a : ");
    a = sc.nextInt();

    System.out.print("Enter the value of b : ");
    b = sc.nextInt();

    sum = a + b;
    sub = a - b;
    mul = a * b;
    div = a / b;
    mod = a % b;

    System.out.println("Hello "+name);
    System.out.println(gen);
    System.out.println("Sum of these two numbers is : "+sum);
    System.out.println("Subtraction of these two numbers is : "+sub);
    System.out.println("Multiplication of these two numbers is : "+mul);
    System.out.println("Division of these two numnbers is : "+div);
    System.out.println("Modulas of these two numbers is : "+mod);


    sc.close();
    }
}
