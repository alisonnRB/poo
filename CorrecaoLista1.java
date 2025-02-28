class CorrecaoLista1 {

	public static void main (String args[]) {
		// Faça um programa que incrementa o valor de uma 
		// variável em 10% e escreva os dois valores na tela
		
		int num = 100;
		float valorReajustado = num * 1.1f;
		
		System.out.printf("Valor original: %d - Valor com 10 por cento: %f \n", num, valorReajustado);
	
		// Faça um programa que calcula e mostre o percentual 
		// de frequência de um estudante. Para isso, considere 
		// que 120 períodos correspondem 
		// a 100% da carga horária. 
		int presencas = 80;
		
		float freq = (presencas / (float)120) * 100;
		System.out.printf("Com %d perídos, você atingiu %f de frequencia \n", presencas, freq);
	
		// Faça um programa que analise três números variáveis 
		// contendo números inteiros, e em seguida, calcule
		// e exiba a média aritmética desses números.
		int num1 = 18;
		int num2 = 25;
		int num3 = 30;
		
		float resultado =  (num1+num2+num3) / 3;
		
		System.out.printf("A média de %d + %d + %d é %f \n", num1, num2, num3, resultado);
	
		// Crie um programa que verifica se um número inteiro é positivo,
		// negativo ou zero
		
		num = 0; // reaproveitando a variavel do exercício 1, mas ela NÃO pode
		// ser redeclarada
		
		if (num > 0){
			System.out.printf("%d é positivo \n", num);
		} else if (num < 0){
			System.out.printf("%d é negativa \n" , num);
		} else {
			System.out.printf("ZERO \n");
		}
		
		// Escreva um programa que verifica se um número é par ou ímpar. 
		
		// reaproveitando a variavel num
		num = 9; 
		
		if (num % 2 == 0) {
			System.out.printf("%d é par \n", num);
		} else {
			System.out.printf("%d é impar \n", num);
		}
	
	}
}
