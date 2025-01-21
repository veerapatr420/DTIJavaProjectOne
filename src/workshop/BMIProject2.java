package workshop;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.text.DecimalFormat;

public class BMIProject2 {
    public static void main(String[] args) throws IOException {
        String Name;
        double weight, height, BMI;

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);
        DecimalFormat df = new DecimalFormat("0.000");

        System.out.println("++++++++++++++++++++++++++++++++++++++");
        System.out.println("       BMI Program by DTI-SAU");
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        System.out.print("Input Your name :");
        Name = reader.readLine();
        System.out.print("Input You weight(kg) :");
        weight = Double.parseDouble(reader.readLine() );
        System.out.print("Input your height(m) :");
        height = Double.parseDouble(reader.readLine());

        BMI = weight / Math.pow(height, 2);

        System.out.println("++++++++++++++++++++++++++++++++++++++");
        System.out.println("BMI of " + Name + " is " + df.format(BMI));
        System.out.println("++++++++++++++++++++++++++++++++++++++");

    }
}
