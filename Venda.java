class Venda {
	Produto itens[];	// vetor de produtos (armazenada vários produtos
	float total;	// armazena o valor total dos itens adicionados a venda
	int indice;	// usado para controlar a posição que um produto deve ser inserido no vetor "itens"

	// criando um método construtor
	public Venda() {
		itens = new Produto[100];	// cria um vetor que pode armazenar ATÉ 100 produtos
		total = 0;	// a venda começada zerada
		indice = 0;
	}
	
	// método que adiciona um produto a venda
	public void adicionarItem(Produto item){
		itens[indice] = item;	// adiciona o produto ao vetor "itens"
		total += item.precoVenda;	// adiciona o preço do produto ao total da venda
		indice++;	// incrementa em um o indice
	}
	
	// método que mostra todos os itens adicionados e o valor total da venda
	public void visualizarVenda(){
		// laço de repetição para percorrer os produtos adicionados
		// i < indice, pois não haverá produtos adicionados além do indice
		for (int i=0; i < indice; i++) {
			itens[i].mostrar();	// usa a variavel i para poder chamar o método mostrar()
		} 
		// mostrando o somatório dos produtos adicionados
		System.out.printf("Total da venda: %.2f \n", total);
	
	}

}
