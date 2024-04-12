package project.problem;

import java.util.Scanner;

public class SumofNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
         int N = sc.nextInt();
         int sum=0;
         int i=1;
         while(i<=N){
             sum = sum + i;
             i++;
         }
        System.out.println(sum);
    }
}
