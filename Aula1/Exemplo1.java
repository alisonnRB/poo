public class Exemplo1 {

	// Isso é um tipo de comentário de uma linha
	
	/* Isso é um comentário multi linha. Ele é encerrado
	 * com a sequencia de um * seguido por /
	 * main é o método principal da linguagem. É necessário
	 * para que o código seja executado
	 */
	public static void main (String args[]) {
		// exemplos de declaração de variaveis
		
		// a declaração tem a seguinte sintaxe: tipo da variavel seguido 
		// pelo nome
		int idade = 22;
		
		// ao declarar uma variavel do tipo float, é preciso colocar o f no final
		float peso = 70.1f;
		
		// para declarar um string sempre usa-se aspas duplas "
		String nome = "Marco";
		
		// tipo char é para apenas 1 caracter e deve 
		// obrigamente ser declarado com aspas simpoles '
		char sexo = 'M';
		
		boolean status = true;
		
		// para printar informações, existem 2 métodos que fazem isso
		System.out.printf("Nome: %s \n", nome); // %s para mostrar uma string
		System.out.printf("Idade: %d \n", idade); // %d para mostrar um int
		System.out.printf("Peso: %f \n", peso); // %f para mostrar um float
		
		System.out.printf("Sexo: %s \n", sexo);
		System.out.println("Sexo: " + sexo );
	}
	
	
}
