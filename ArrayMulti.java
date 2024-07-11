package MultiDimensinalArray;

import java.util.Scanner;

public class ArrayMulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=3;
		int cols=3;
		//int value=1;
		int[][] arr=new int[rows][cols];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			}
	}

}
