
package algorithms;
public class BinarySearch {
    static int binarySearch(int arr[], int x)
    {
        int l=0,r=arr.length-1,mid;
        
        while(l<=r){
            mid=l+(r-l)/2;
            if(arr[mid]==x)
                return mid;
            else if(arr[mid]<x)
                l=mid+1;
            else
                r=mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{1,2,3,4},3));
    }
    }
    

