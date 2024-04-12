package project.problem;

import java.sql.SQLOutput;
import java.util.Scanner;

/*Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E)
and Step Size (W), you need to convert all Fahrenheit values from Start to End at the gap of W,
into their corresponding Celsius values and print the table.*/
public class FahrenheitToCelcius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S= sc.nextInt();
        int W = sc.nextInt();
        int E= sc.nextInt();
        int fah;
        while(S<E){
            fah=((5*(S-32))/9);
            System.out.println(S +"  "+ fah);
            S+=W;
        }
    }

}
