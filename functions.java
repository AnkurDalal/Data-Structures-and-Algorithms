import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class functions {
    public static void print(){
        System.out.println("hi this is ankur dalal learning dsa");
        System.out.println("hi this is ankur dalal learning dsa");
        System.out.println("hi this is ankur dalal learning dsa");
        System.out.println("hi this is ankur dalal learning dsa");

        return;
    }
    public static int sum(int a,int b){
        int sum=a+b;
        return sum;
    }
    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        
    }
    public static int multiply(int a,int b){
        int product=a*b;
        return product;
    }
    public static void main(String[]args){
        print();
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int sum=sum(num1, num2);
        System.out.println(sum);

        int a=10;
        int b=5;
        System.out.println(a);
        System.out.println(b);
    swap(a, b);
    int product=multiply(a, b);
    System.out.println(product);
    }
}
