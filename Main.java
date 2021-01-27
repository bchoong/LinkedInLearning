import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Triangle triangleA = new Triangle(15,3,3,2,4);
        Triangle triangleB = new Triangle(3,2.596,4,5,6);

        double triangleAArea = triangleA.findArea();
        System.out.println(triangleAArea);
        double triangleBArea = triangleB.findArea();
        System.out.println(triangleBArea);

        System.out.println(Triangle.numOfSides);
    }

}