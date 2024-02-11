public class Mountain {
    public static void main(String args[]){
        int arr[]={0,1,2,3,2,1};
        int peak=mountain(arr,arr.length);
        System.out.println("The peak element is "+peak);
    }

    public static int mountain(int arr[],int size){
        int start=0;
        int end=size-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }else{
                end=mid;
            }
        }
        return arr[start];
    }
}
