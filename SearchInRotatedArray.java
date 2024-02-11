import java.util.Scanner;
public class SearchInRotatedArray {
    public static void main(String args[]){
        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter the no you want to search");
        int element=Sc.nextInt();
        int arr[]={1,3};
        int pos=search(arr,arr.length,element);
        System.out.println("The position of your element is "+pos);
    }

    public static int search(int arr[],int size,int element){
        int start=0;
        int end=size-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>=arr[0]){
                start=mid+1;
            }else{
                end=mid;
            }
        }
        int pivot=arr[start];
        if(element>arr[0]){
            int s=0;
            int e=start;
            int position=binary(arr,size,s,e,element);
            return position;
        }else if(element<arr[0]){
            int s=start;
            int e=size-1;
            int position=binary(arr,size,s,e,element);
            return position;
        }else if(element==arr[0]){
            return 0;
        }else{
            System.out.println("Element not found");
            return -1;
        }
    }

    public static int binary(int arr[],int size,int start,int end,int element){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==element){
                return mid;
            }else if(arr[mid]>element){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        System.out.println("Element not found");
        return -1;
    }
}
