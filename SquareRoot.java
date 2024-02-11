import java.util.Scanner;
public class SquareRoot {
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the no whose sqaure you want to calculate");
        int no=Sc.nextInt();
        int ans=root(no);
        System.out.println("THe square root of your no is " +ans);
    }

    public static int root(int no){
        int size=no+1;
        int arr[]=new int[size];
        for(int i=0;i<=no;i++){
            arr[i]=i;
        }
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            int temp=arr[mid]*arr[mid];
            if(temp==no){
                return arr[mid];
            }else if(temp>no){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
}
