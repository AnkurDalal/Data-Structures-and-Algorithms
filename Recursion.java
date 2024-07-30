public class Recursion {
    public static void printDec(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    public static void printInc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int fnm1=factorial(n-1);
        int fn=n*fnm1;
        return fn;
    }
    public static int calSum(int n){
        if(n==1){
            return n;
        }
        int snm1=calSum(n-1);
        int sn=n+snm1;
        return sn;
    }
    public static int calFab(int n){
        if(n==0||n==1){
            return n;
        }
        int fbnm1=calFab(n-1);
        int fnm2=calFab(n-2);
        int fb=fbnm1+fnm2;
        return fb;
    }
    

    public static void main(String[]args){
        int n=5;
        printDec(n);
        printInc(n);
        System.out.println(factorial(n));
        System.out.println(calSum(n));
        System.out.println(calFab(n));
    }
}
