class AppVenda {
	
	public static void main(String args[]) {
		// cadastrando alguns produtos
		Produto p1 = new Produto("Pepsi", 2.31f);
		Produto p2 = new Produto("Feijão 1kg", 6.8f);
		Produto p3 = new Produto("Arroz 5kg", 15.9f);
		Produto p4 = new Produto("Sal 1kg", 0.99f);
		Produto p5 = new Produto("Coca-cola", 2.35f);
		
		// inciando uma venda
		Venda v1 = new Venda();
		v1.adicionarItem(p1);
		v1.adicionarItem(p3);
		v1.adicionarItem(p4);
		
		// imprimindo a venda
		v1.visualizarVenda();
	}
	
}
