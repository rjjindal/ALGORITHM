import java.util.*;
class Main {

    public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int t = in.nextInt();

			while(t>0){
				int c = in.nextInt();
				int v = in.nextInt();
				int arr[][] = new int[v][c];
				for(int i=0;i<v;i++){
          for(int j=0;j<c;j++){
            arr[i][j] = in.nextInt();
	        }
				}

				int sol[] = new int[c+1];
				for(int i=0;i<v;i++){
        	sol[i] = 0;
				}

				for(int i=0;i<v;i++){
          for(int j=0;j<c;j++){
            sol[arr[i][j]] += (c-j);
          }
				}

				int temp = 0;
				int pos=0;
				for(int i=1;i<(c+1);i++){
          if(temp<sol[i]){
            temp = sol[i];
            pos = i;
					}
				}
				int var = temp/(c*v) > 50 ? 1 : 2;
				System.out.print(pos+" "+var+"\n");
				t--;
			}
	}
}
