public class findSubsets {
    public static void FindSubsets(String str,String ans,int i){
        //base
        if(i==str.length()){
            if(ans.length()==0)
            System.out.println("null");
        }else{
            return;
        }
        //kaam
        FindSubsets(str, ans+str.charAt(i), i+1);//yes choice
        FindSubsets(str, ans, i+1);//NO CHOICE
    }
    public static void main(String[]args){
        String str="abc";

    }
}
