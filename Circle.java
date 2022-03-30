import java.util.*;

public class Circle {
    public static void main(String args[]){
        Scanner c = new Scanner(System.in);
        System.out.print("Enter the radius of circle:");
        Double radius = c.nextDouble();

        System.out.println("Area of circle is =" +(Math.PI*radius*radius));

        System.out.println("Paramenter of circle is =" +(2*Math.PI*radius));
        c.close();
    }
}
