package project.problem;

import java.util.Scanner;

public class EvenNumbers {

    public static void main(String[] args) {
        int a=1;
        int e=1;
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        for (int i = 1; i <=n ; i++) {
            if(i<=n){
                if(e%2==0){
                    System.out.println(e);
                }
                e++;
            }
        }
    }
}
