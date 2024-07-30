import java.util.*;
public class Strings {
    public static void printString(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your first name : ");
        String  firstname=sc.next();
        System.out.println("enter your last name :");
        String lastname=sc.next();
        String fullname=firstname+lastname;
        System.out.println(fullname.charAt(2));

        printString(fullname);
    }
}