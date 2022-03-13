package lp2;
import java.util.Arrays;
public class exercicio3 {
	public static void main(String [] args) 
	{
	int [] numeros = new int [] {32, 2, 444, 60, 30, 11, 27, 5, 57, 89};
	Arrays.sort(numeros);
	System.out.println("IHOW!O vetor ficou ordenado como:");
	for(int numero : numeros)
		System.out.println(numero);
	System.out.println();
	}

}
