package java4;

public class Matrixoperation {
	public static void main(String[] args) {
		int a[][]= {{1,2,3},{2,4,6},{1,3,5}};
		int b[][]= {{8,9,10},{5,7,9},{6,7,8}};
		int c[][]=new int[3][3];
		System.out.println("Addition of two  Matrix is:");
		for (int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System .out.println();
		}
		System.out.println("Multiplication of two Matrix is:");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=0;
				for(int k=0;k<3;k++) {
					c[i][j]+=a[i][k]*b[k][i];
				}
				
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}

}
