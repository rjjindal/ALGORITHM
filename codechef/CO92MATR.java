import java.util.*;

class Main{

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		while(t-->0){

			int r = in.nextInt();
			int c = in.nextInt();

			int[][] mat = new int[r][c];

			for(int i=0;i<r;i++){
				for(int j=0;j<c;j++){
					mat[i][j] = in.nextInt();
				}
			}

			StringBuilder sol = new StringBuilder();
			boolean isImp = false;
			for(int i=0;i<r;i++){
				for(int j=0;j<c;j++){

					if(mat[i][j] == -1){

						int min = 1;
						int max = 2000000000;

						if(j>0 && mat[i][j-1] != -1 ){
							min = Math.max(min, mat[i][j-1]);
						}

						if(i>0 && mat[i-1][j] != -1){
							min = Math.max(min, mat[i-1][j]);
						}

						if( j < c-1 && mat[i][j+1] != -1 ){
							max = Math.min(max, mat[i][j+1]);
						}

						if( i< r-1  && mat[i+1][j] != -1 ){
							max = Math.min(max, mat[i+1][j]);
						}

						if(min <= max){
							mat[i][j] = min;
						}else{
							isImp = true;
							break;
						}
					}

					sol.append(mat[i][j]);

					if(j > 0 && mat[i][j] < mat[i][j-1]){
						isImp = true;
					}

					if( i > 0 && mat[i][j] < mat[i-1][j] ){
						isImp = true;
					}

					if(j != c-1){
						sol.append(" ");
					}
				}
				if(isImp){
					break;
				}
				if(i != r-1)
					sol.append("\n");
			}

			if(isImp){
				System.out.println(-1);
			}else{
				System.out.println(sol);
			}
		}
	}
}
