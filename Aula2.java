public class Aula2{
	
	public static void main (String args[]) {
		
		int num1 = 10;
		int num2 = 3;
		
		int soma = num1 + num2; //13
		
		int sub = num1 - num2; // 7
		
		int mult = num1 * num2; // 30
		
		// int div = num1 / num2;	// daria 3
		float div = num1 / (float)num2; // 3.33333...
		// para dar 3.333 é necessário fazer a conversão para float
		
		System.out.printf("%d + %d = %d \n", num1, num2, soma);
		
		System.out.printf("%d - %d = %d \n", num1, num2, sub);
		
		System.out.printf("%d * %d = %d \n", num1, num2, mult);
		
		// .2 coloca duas casas decimais depois da virgula
		System.out.printf("%d / %d = %.2f \n", num1, num2, div);
		
		int resto = num1 % num2;
		
		System.out.printf("%d MOD %d = %d \n", num1, num2, resto);
	
		// teste com uma condição 
		int idade = 22;
	
		if (idade >= 18){
			System.out.println("Maior de idade");
		} else {
			System.out.println("Menor de idade");
		}
		
		// exemplo de if E lógico: todas as condições precisam ser verdaeiras
		// situação academica: para ser aprovado, a média tem que ser igual ou superior a 7
		// e a frequencia tem que ser maiorou igual a 75
		float nota = 7.6f;
		int freq = 80;
		
		if (nota >= 7 && freq >= 75) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
		
		// exemplo OU lógico - UMA condição precisa ser satisfeita para ser verdadeiro
		// cliente precisa participar do clube ou comprar no mínimo 500 reais
		float totalCompra = 480.77f;
		boolean participaClube = false;
		
		if (totalCompra >= 500 || participaClube == true){
			System.out.println("O cliente tem frete grátis");
		} else {
			System.out.println("Não tem frete grátis");
		}
		
		// exemplo de if aninhado
		// teste para escrever os numero de 0 a 3 por extenso
		
		int num = 5;
		
		if (num == 0)
			System.out.println("ZERO");
		else if (num == 1)
			System.out.println("UM");
		else if (num == 2)
			System.out.println("DOIS");
		else 
			System.out.println("TRÊS");
	}
}
