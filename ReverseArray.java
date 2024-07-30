public class ReverseArray {
    public static void reverseArray(int arr[]) {
    int start=0;int end=arr.length-1;
    while(start<end){
        int temp=arr[end];
        arr[end]=arr[start];
        arr[start]=temp;
        start++;
        end--;
    }
        
    }

    public static void main(String[]args){
        int arr[]={10,9,8,7,6,5,4,3,2,1};
        reverseArray(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}