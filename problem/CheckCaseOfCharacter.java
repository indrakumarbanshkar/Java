package project.problem;

import java.util.Scanner;
/*
Write a program that takes a character as input and prints 1, 0, or -1 according to
the following rules.
1, if the character is an uppercase alphabet (A - Z).
0, if the character is a lowercase alphabet (a - z).
-1, if the character is not an alphabet.
 */
public class CheckCaseOfCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch= sc.next().charAt(0);
        int a= ch;
        if(a>=65 && a<=90){
            System.out.println("1");
        }
        else if(a>=97 && a<=122){
            System.out.println("0");
        }
        else{
            System.out.println("-1");
        }

    }
}
