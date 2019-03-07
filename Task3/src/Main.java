import Task_1_2.Circle;
import Task_1_2.Square;
import Task_3.Student;

public class Main {

    public static void main(String[] args) {

        /*Exersise 1*/
        Square square1 = new Square(8);
        System.out.println("Area of square: " + square1.calculateArea());
        System.out.println("Perimeter of square: " + square1.calculatePerimeter());
        System.out.println();

        /*Exersise 2*/
        Circle circle = new Circle(8.00);
        System.out.println("Area of circle: " + circle.calculateArea());
        System.out.println("Perimeter of circle: " + circle.calculatePerimeter());
        System.out.println();

        /*Exersise 3*/
        Student student1=new Student();
        Student student2=new Student();
        student1.setData("Ion",24);
        student2.setData("Alex",27);
        System.out.println("Average age: "+(student2.getAge()+student1.getAge())/2);
        System.out.println();

        /*Exersise 4,5 -inside package Task_4_5*/

        /*Exersise 6,7 -inside package Task_6_7*/

        /*Exersise 8 -inside package Task_1_2*/


    }

}
