package lp2;
import java.util.Scanner;
public class exercicio1 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
			double valor, desconto, novo, parcela;
			int p;
			valor = entrada.nextDouble();
			desconto = entrada.nextDouble();
			novo = valor - desconto;
			System.out.println("1-À vista: com 10% de desconto.");
			System.out.println("2-Parcelado 2 vezes: em duas vezes(preço da etiqueta).");
			System.out.println("3-Parcelado de 3 vezes até 6 vezes: com 3% de juros ao mês (somente para compras acima de R$ 500,00 - inclusive).");
		int i = entrada.nextInt();
		while (i !=0) 
		{
			switch(i)
			{
			case 1:
			System.out.println("Bem-vindo cliente! Por favor, apresente o valor total de sua compra:");	
				desconto = valor * 0.1;
			System.out.printf("Muito bem, o valor do pagamento a vista é: %.2f", novo);
			break;
			
			case 2:
				System.out.println("Bem-vindo cliente! Por favor, apresente o valor total de sua compra:");
				parcela = valor %2;
			System.out.printf("Ótimo, a sua escolha resultou em duas prestações de: %.2f", parcela);
			break;
			
			case 3:
				System.out.println("Bem-vindo cliente! Por favor, apresente o valor total de sua compra:");
				System.out.println("Por favor, apresente em quantas parcelas você deseja fazer:");
				p = entrada.nextInt();
				if(valor <= 500.00) 
				{
					if(p == 3)
						{
						parcela = valor %3;
						System.out.printf("Show, agora as suas três prestações possuem um costo cada de: %.2f", parcela);
						
						}
					
					else if(p == 4)
						{
						parcela = valor %4;
						System.out.printf("Show, agora as suas quatro prestações possuem um costo cada de: %.2f", parcela);
						}
				
					else if(p == 5)
					{
					parcela = valor %5;
					System.out.printf("Show, agora as suas cinco prestações possuem um costo cada de: %.2f", parcela);
					}
				
					else if(p == 6)
					{
					parcela = valor %6;
					System.out.printf("Show, agora as suas seis prestações possuem um costo cada de: %.2f", parcela);
					}
					else
						System.out.println("Escolha uma nova forma de pagamento.");
				}
				
			}
		}
	
	
	}

}
