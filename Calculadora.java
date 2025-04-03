class Calculadora {

	// criando um método que adiciona 30% a um valor
	public float novoPreco(float valor) {
		return valor * 1.3f;
	}
	
	// sobrecarga de método
	// o método recebe um segundo parametro, que indica a porcentagem que deve ser adicionada a um numero (valor)
	public float novoPreco(float valor, int porcentagem) {
		return valor + ( (valor / 100) * porcentagem );
	}
	
	// criando um método estático - eles são definidos com a palavra chave static
	// conforme o exemplo, demonstrado em aula, o método abaixo corresponde a uma regra de 3 simples e diretamente proporcional
	public static double regra3Simples(double valor, double referencia1, double referencia2) {
		
		double x = (valor * referencia2) / referencia1;
		
		return x;
	}
	
	public static void main (String args[]){
		float precoCusto = 99;
		
		Calculadora c = new Calculadora();
		
		// chama o método novoPreco que retorna um valor acrescido de 30%
		System.out.printf("Preço de custo é %f e o preço de venda será %f \n", precoCusto, c.novoPreco(precoCusto) );
		
		// chama o método novoPreco que retorna um valor acrescido de 60 (conforme o número indicado no segundo argumento)  
		System.out.printf("Preço de custo %f e o preco de venda será %f \n", precoCusto, c.novoPreco(precoCusto, 60) );
		
		// chamando um método estático
		int num = 16;
		
		// a classe Math contém métodos estáticos
		// para chamar o método, usa-se nomeClasse.nomeMétodo
		double raizQuad = Math.sqrt(num);	
		
		System.out.printf("A raiz quadrada de %d é %f \n", num, raizQuad);
		
		// chamando o método estático regra3simples
		// 300 corresponde ao salário do funcionário para trabalhar 8 horas por dia
		// 3º parametro corresponde ao total de horas que ele trabalhou
		double salario = Calculadora.regra3Simples(300, 8, 20);
		
		System.out.printf("O valor a ser pago será %s \n", salario);
		
	}
}
