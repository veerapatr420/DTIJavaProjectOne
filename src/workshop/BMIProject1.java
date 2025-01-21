package workshop;
import java.text.DecimalFormat;
import java.util.Scanner;
public class BMIProject1 {
    public static void main(String[] args) {
        String Name;
        double weight, height, BMI;

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");

        System.out.println("+++++++++++++++++++++++++++++++++");
        System.out.println("   BMI Program by DTI-SAU");
        System.out.println("+++++++++++++++++++++++++++++++++");
        System.out.print("Input Your name : ");
        Name = sc.next();
        System.out.print("input your weight(kg) : ");
        weight = sc. nextDouble();
        System.out.print("Input your height(m) : ");
        height = sc. nextDouble();

        BMI = weight / Math.pow(height, 2);
        System.out.println("+++++++++++++++++++++++++++++++++");
        System.out.println("BMI of " + Name + " is " + df.format(BMI) );
        System.out.println("+++++++++++++++++++++++++++++++++");




    }
}
