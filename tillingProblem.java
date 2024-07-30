public class tillingProblem {
    public static int TillingProblem(int n){
        if(n==0||n==1){
            return 1;
        }
        //veertical choice;
        int fnm1=TillingProblem(n-1);
        //horizontal choice;
        int fnm2=TillingProblem(n-2);
        //total ways
        int totWays=fnm1+fnm2;
        return totWays;
    }
    public static void main(String[]args){
        System.out.println(TillingProblem(4));

    }
}
