package lp2;
import java.util.Scanner;
import java.util.Random;
public class exercicio4 
{
	public static void main(String[] args) 
  {
    Scanner entrada = new Scanner(System.in);
    Random random = new Random();
    System.out.println("Por favor, digite o número da opção desejada:");
    System.out.println("1-Cadastrar Passageiro.");
    System.out.println("2-Check in.");
    System.out.println("3-Cancelar voo.");
    System.out.println("4-Sair.");
    int i = 0;
    String nome, cpf, data,hora;
    int num, poltrona, numlugar;
    int al = random.nextInt(999);
    
    int [] matriz = new int [100]; 
    do 
    {
    i=entrada.nextInt();
    switch(i)
      		{
      case 1:
        System.out.println("Por favor, digite o seu nome:");
        nome=entrada.next();
        System.out.println("Por favor, digite o seu CPF:");
        cpf=entrada.next();
        System.out.println("Por favor, digite a data do voou:");
        data=entrada.next();
        System.out.println("Por favor, digite a hora do voou:"); 
        hora=entrada.next();
        System.out.println("Cadastro efetuado com sucesso. O seu voou será: " + al);
        break;
      case 2:
        System.out.println("Por favor, digite o seu CPF:");
        cpf=entrada.next();
        System.out.println("Por favor, digite o número do voou:");
        num=entrada.nextInt();
        System.out.println("Por favor, apresente o número de sua poltrona.:");
        poltrona=entrada.nextInt();
        for (int j = 0; j < 99; j++) 
        {
        	if (poltrona == j ) 
        		System.out.println("Ok!");
        	else       		
        		System.out.println("Por favor, escolha outra poltrona.");        	     	
        }
        System.out.println("Check in realizado com sucesso.");
        break;
      case 3:
        System.out.println("Por favor, digite o seu cpf:");
        cpf=entrada.next();
        System.out.println("Por favor, digite o número do seu voou:");
        num=entrada.nextInt();
        System.out.println("Voou cancelado com sucesso.");
        break;
        }
    } while(i<=10);   
   }
}