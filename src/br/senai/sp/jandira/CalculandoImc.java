package br.senai.sp.jandira;

import java.util.Scanner;

public class CalculandoImc {

	public static void main(String[] args) {
		
		// Criar o Scanner para interagir com o usuário 
		Scanner leitor = new Scanner(System.in);
		
		// Criar as variáveis que serão utilizadas no cálculo e solicitar os dados 
		double peso;
		System.out.println("Qual o seu peso?");
		peso = leitor.nextDouble();
		
		double altura;
		System.out.println("Qual sua altura?");
		altura = leitor.nextDouble();
		
		double imc = peso/(altura*altura);
		System.out.printf("O valor do seu IMC é: %s\n", imc);
		
		//Determinar a classificação do usuário
		if (imc <18.5) {
			 System.out.println("Atenção, você está abaixo do peso!!");
		}
		
		if (imc >=18.5 && imc <25.0) {
			System.out.println("Parabéns, você está no peso ideal!!");
		}
		
		if (imc >25.0 && imc <30.0) {
			System.out.println("Atenção, você está levemente acima do peso!!");
		}
		
		if (imc >30.0 && imc <35.0) {
			System.out.println("Cuidado, você está com obesidade grau I!!");
		}
		 if (imc >35.0 && imc <40.0) {
			 System.out.println("Cuidado, você está com obesidade grau II - severa!!");
		 }
		 
		 if (imc >40) {
			 System.out.println("Procure ajuda profissional, você está com obesidade grau III - móbrida");
		 }
		
	}

}
