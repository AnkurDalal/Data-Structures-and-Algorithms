public class SearchInRotatedArray {
    public static int search(int arr[],int tar,int si,int ei){
        if(si>ei){
            return -1;
        }
        int mid=si+(ei-si)/2;
        //case found
        if(arr[mid]==tar){
            return mid;
        }
        //mid lies on L1
        if(arr[si]<=arr[mid]){
            //case a
            if(arr[si]<=tar && tar<=arr[mid]){
               return search(arr, tar, si, mid);
            }else{
            //case b
            return search(arr, tar, mid+1, ei);
            }
        }
        else{
            if(arr[mid]<=tar && tar<=arr[ei]){
               return search(arr, tar, mid+1, ei);
            }else{
                return search(arr, tar, si, mid);
            }

        }
    }
    public static void main(String[]args){
        int arr[]={4,5,6,7,0,1,2};
        int tar=0;
        System.out.println(search(arr, tar, 0, arr.length-1));
    }
}
