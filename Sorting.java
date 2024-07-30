public class Sorting {
    public static void bubbleSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){//turns
            for(int j=0;j<arr.length-1-i;j++){//till where the comparsion will take place
                if(arr[j]>arr[j+1]){//comparison
                    //swap 
                  int temp=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=temp;
                }
            }
        }
    
    }
    //print the array
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){//turns
            int minPos=i;//curr position is our min smallest;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minPos]>arr[j]){//comparison
                    minPos=j;
                }
            }
            //swap
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
    }
    public static void insertionSort(int arr[]){
     for(int i=0;i<arr.length-1;i++){
        for(int j=i+1;j>0;j--){
            if(arr[j-1]>arr[j]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
            }else{
                break;
            }
        }
     }
        
    }
    
    public static void main(String[]args){
        int arr[]={5,4,1,3,2};
       // bubbleSort(arr);
       //selectionSort(arr);
       insertionSort(arr);
        printArr(arr);
    }
}
