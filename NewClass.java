package Sample;

import java.util.Scanner;

public class NewClass {
	
	public int geometricProgression(int a,int b,int n)
	{
	
	int term=a;
	for(int i=1;i<n;i++)
	{
		System.out.print(term + " ");
		term = a*(int)Math.pow(b, i);
	}	
	return term;
	}
	
	public void matrixMultiplication(int m1[][],int m2[][],int r1,int c1, int r2,int c2)
	{
		if(c1!=r2) {
			System.out.println("Matrix multiplication is not possible...");
		}
		else {
		int c[][]=new int[r1][c2];
		int i,j,k;
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c2;j++)
			{
				c[i][j]=0;
				for(k=0;k<c1;k++)
				{
					c[i][j]=c[i][j]+(m1[i][k]*m2[k][j]);
				}
			}
		}
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c2;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		}
	}
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
	NewClass nc = new NewClass();
	//System.out.print(nc.geometricProgression(2,3,5));
	System.out.println("Enter the first Matrix row and column size ");
	int r1=sc.nextInt();
	int c1=sc.nextInt();
	System.out.println("Enter the second matrix row and  column size.");
	int r2 = sc.nextInt();
	int c2=sc.nextInt();
	System.out.println("Enter the first matrix elements..");
	int m1[][]=new int[r1][c1];
	try
	{
	for(int i=0;i<r1;i++) {
		for(int j=0;j<c1;j++)
		{
			m1[i][j]=sc.nextInt();
		}
	}
	System.out.println("Enter the second matrix elements...");
	int m2[][]=new int[r2][c2];
	for(int i=0;i<r2;i++)
	{
		for(int j=0;j<c2;j++)
		{
			m2[i][j]=sc.nextInt();
		}
	}
	
		nc.matrixMultiplication(m1,m2,r1,c1,r2,c2);	
	}catch(Exception exe) {
		exe.printStackTrace();
	}
	}	
	
}
