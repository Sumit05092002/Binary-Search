public class Pivot {
    public static void main(String args[]){
        int arr[]={7,8,9,1,2,3};
        int pivot=pivot(arr,arr.length);
        System.out.println("THe pivot element is "+pivot);
    }

    public static int pivot(int arr[],int size){
        int start=0;
        int end=size-1;
        int ans=0;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>=arr[0]){
                start=mid+1;
            }else{
                end=mid;
            }
        }
        return arr[start];
    }
}
