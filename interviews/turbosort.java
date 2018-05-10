import java.util.*;

public class TroubleSort {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		for(int i=1;i<=t;i++) {

			int n = in.nextInt();
			int[] arr = new int[n];

			for(int j=0;j<n;j++) {
				arr[j] = in.nextInt();
			}

			boolean isPres = false;

			while(!isPres) {
				isPres = true;

				for(int j=0;j<n-2;j++) {

					if(arr[j]>arr[j+2]) {

						int temp = arr[j];
						arr[j] = arr[j+2];
						arr[j+2] = temp;
						isPres = false;
					}
				}
			}

			int res = chechSort(arr);
			if(res == -1) {
				System.out.println("Case #"+i+": OK");
			}
			else {
				System.out.println("Case #"+i+": "+res);
			}
		}
	}

	public static int chechSort(int[] arr) {
		int res = -1;

		for(int i=0;i < arr.length - 1;i++) {

			if(arr[i] > arr[i+1]) {
				res = i;
				break;
			}
		}
		return res;
	}
}
