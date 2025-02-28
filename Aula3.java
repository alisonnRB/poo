public class Aula3 {

	public static void main (String args[]) {
		// exemplo da estrutura de decisão switch
		// objetivo é escrever o dia da semana por extenso, avaliando
		// o valor de uma variavel
		int diaSemama = 3; // 0 é domingo, 1 segunda....6 sábado
		
		switch (diaSemama) {
			case 0: 
				System.out.printf("Domingo \n");
				break;
			case 1: 
				System.out.printf("Segunda-feira \n");
				break;
			case 2: 
				System.out.printf("Terça-feira \n");
				break;
			case 3: 
				System.out.printf("Quarta-feira \n");
				break;
			case 4:
				System.out.printf("Quinta-feira \n");
				break;
			case 5: 
				System.out.printf("Sexta-feira \n");
				break;
			case 6: 
				System.out.printf("Sábado");
				break;
			default:	// default é opcional e tem a finalidade de simular o último else 
			// de uma estrutura de decisão com if aninhados
				System.out.printf("Número inválido. Tente numeros entre 0 e 6 \n");
				// não é necessário o break, pois não tem mais nada a ser testado
		}
		
		// EXEMPLOS DE CRIACAO DE LAÇOS DE REPETIÇÃO
		/* laço for é um laço de repetição contado, ou seja, é executado
		   por um numero determinado de vezes
		   é composto por 3 condições:
		   1º incialização da variavel
		   2º condição de saída
		   3º condição de incremento
		*/
		
		
		
		for (int i = 0; i < 10; i++) {
			System.out.printf("Executando o laço for pela %d vez \n", i);
		}
		
		// ao descomentar a linha abaixo, geraria um erro, pois a variavel i não será encontrada
		// como ela foi declarada dentro do laço for, ela tem um escopo LOCAL, não sendo acessível fora
		
		// System.out.printf("%d \n", i);
		
		// exemplo de for decrescente
		for (int i=10; i > 0; i--) {
			System.out.printf("Executando o laço for pela %d vez \n", i);
		} 
		
		// exemplo de for pulando de 2 em 2 (i=i+2)
		for (int i=0; i < 10; i=i+2) {
			System.out.printf("Executando o laço for pela %d vez \n", i);
		} 
		
		// exemplo de laço while
		
		boolean status = false;	// condição a ser avaliada para executar o laço while
		
		int i = 0; // criando uma variavel para poder ter uma condição de saída
		while (status) {
			System.out.printf("Executando o laço while\n");
			
			// condição de saída
			if (i == 5){
				status = false;	// quando o valor da variavel mudar, o laço será interrompido
			}
			
			i++; // incrementa a variavel para ter a condição de saída
			
		}
	
	
		// exemplo laço do while
		// laço de repetição com pós validação - o que está dentro será executado
		// pelo menos uma vez, e ao final, a condição será avaliada para saber se 
		// a execução continua ou é interrompida
		
		boolean encontrado = false;	// variavel de controle para execução do laço
		
		int k = 0; // criando outra variavel de controle (cond. de saida) que 
		// permite alterar o valor da variavel encontrado
		
		
		do{
			
			System.out.printf("Executando o laço do while\n");
			
			// condição de saida
			if (k == 5)
				encontrado = true;	// altera o valor da variavel de controle
				// em comandos if, else, for com uma linha, as chaves podem ser omitidas
			
			k++;
				
		} while (encontrado != true); // ou (!encontrado)

	}
}
