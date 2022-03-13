package lp2;
import java.util.Scanner;
public class exercicio_2 {
	
	static final int LIN = 50;
	static final int COL = 50;
	
	public static void main(String [] args) 
	{
		Scanner input = new Scanner(System.in);
		int mat [][] =new int [LIN][COL];
		int dp=0;
		for(int i=0; i<LIN; i++) {
			for(int j=0; j<COL; j++) {
				System.out.println("Informe: ");
				mat[i][j] = input.nextInt();
			}
		}
		for(int i=0; i<LIN; i++) {
			for(int j=0; j<COL; j++) {
				System.out.print("["+mat[i][j]+"]");
			}
		System.out.print("\n");
		}
		for(int i=0; i<LIN; i++) {
			for(int j=0; j<COL; j++) {
				if(i==j) {
					dp = dp + mat[i][j];
				}
	
			}

		}
	System.out.println("A diagonal principal é:" +dp);
	}
}
