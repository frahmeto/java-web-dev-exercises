package Studio2.areaofcircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your Circle's radius?");
        double radius = input.nextDouble();
        if(radius < 0){
            System.out.println("Enter a valid number");
        }
        double area = Circle.getArea(radius);
        System.out.println("The Circle area is " + area);
        input.close();

    }
}
