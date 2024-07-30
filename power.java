public class power {
    public static int Power(int x,int n){
        if(n==0){
            return 1;
        }
    int xnm1=Power(x, n-1);
    int xn=x*xnm1;
    return xn;
    }
    public static int powerOptimized(int x,int n){
        if(n==0){
            return 1;
        }
    int halfPower=powerOptimized(x, n/2);
    int halfPowersq=halfPower*halfPower;
    if(n%2!=0){
        halfPowersq=x*halfPowersq;
    }
    return halfPowersq;
    }

    public static void main(String[]args){
        System.out.println(Power(2, 5));
        System.out.println(powerOptimized(2, 10));

    }
}
