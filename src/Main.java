
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature in celcius");
        float tempc = input.nextFloat();
        float tempf = (tempc * 9/5) +32;

        System.out.println("temeperature in float is " + tempf);
    }

}