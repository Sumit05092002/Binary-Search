import java.util.Scanner;
public class FirstAndLast {
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the element whose first and last occurence you want to check");
        int element=Sc.nextInt();
        int arr[]={0,1,1,2,2,2,2,2};
        int firstOccurence=firstOccurence(arr,arr.length,element);
        System.out.println("THe first occurence of the element is "+firstOccurence);
        int lastOccurence=lastOccurence(arr, arr.length, element);
        System.out.println("THe last occurence of the element is "+lastOccurence);

    }

    public static int firstOccurence(int arr[],int size,int element){
        int start=0;
        int end=size-1;
        int idx=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==element){
                idx=mid;
                end=mid-1;
            }else if(arr[mid]>element){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return idx;
    }

     public static int lastOccurence(int arr[],int size,int element){
        int start=0;
        int end=size-1;
        int idx=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==element){
                idx=mid;
                start=mid+1;
            }else if(arr[mid]>element){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return idx;
    }
}
