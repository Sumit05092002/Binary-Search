import java.util.Scanner;

public class Binary{
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the element you want to search for");
        int element=Sc.nextInt();
        int arr[]={22,43,67,85,90};
        int idx=search(arr,arr.length,element);
        System.out.println("your element is at index "+idx);
    }

    public static int search(int arr[],int size,int element){
        int start=0;
        int end=size-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            System.out.println("Mid is "+mid);
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