package project.problem;

import java.util.Scanner;

public class fibonaci {
    public static void main(String[] args) {
        int i=1;
        int fact=1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println();
        for (int j = 0; j <n ; j++) {
            if(i<=n){
                fact=fact*i;
                 i++;
            }
        }
        System.out.println(fact);
    }
}
