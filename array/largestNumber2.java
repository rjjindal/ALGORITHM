import java.util.*;

class Main{

  public static boolean doCompare(int a,int b){

        String val1 = String.valueOf(a) + String.valueOf(b);
        String val2 = String.valueOf(b) + String.valueOf(a);

        return( val1.compareTo(val2) >=0 ? false : true);
    }

  public static int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1);
        for (int j=low; j<high; j++)
        {
            if (Main.doCompare(arr[j],pivot))
            {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    public static int[] sort(int arr[], int low, int high)
    {
        if (low < high)
        {
            int pi = partition(arr, low, high);

            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }else{}
    }

    public static void main(String[] args) {
              ArrayList<Integer> list = new ArrayList<Integer>();
              list.add(3);
              list.add(30);
              list.add(34);
              list.add(5);
              list.add(9);

              int arr[] = { 3, 30, 34, 5, 9};
              System.out.println(Main.sort(arr, 0, arr.length-1));
    }
}
