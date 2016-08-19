
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a={{0,2,4,6,8},{1,5,8,10,12},{3,7,9,11,14},{5,8,12,15,17},{7,10,13,16,18}};
		findX(a,4);
	}
//The input is an N*N matrix of numbers that is already in memory 
//each individual row is increasing from left to right
//each individual column is increasing from top to bottom
//give an algorithm that decides if a number X is in the matrix
//Sequential search for each element O(N^2)
//Binary Search for each row of column O(NlgN)
//More efficient way O(N),
//From left-bottom element if Y>X, eliminate bottom row, if Y<X, eliminate left column
	public static int findX(int[][] a, int x){
		if(a==null) throw new Error("No solution");
		int n=a.length;
		int row=n-1,column=0;
		
		while(row>=0 && column<n){//control loop, could be changed to use in a[X][Y]
			int base=a[row][column];
			if(x<base){
				row--;
			}else if(x>base){
				column++;
			}else{
				System.out.println(x+" is found at index ["+ row +", "+ column+"]");
				return base;
			}
		}
		throw new Error("No solution");
		
	}

}


