package project.problem;

import java.util.Scanner;

public class CheckOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rem= num%2;
        if(rem==0){
            System.out.println("num is Even");
        }else{
            System.out.println("num is odd");
        }
    }
}
