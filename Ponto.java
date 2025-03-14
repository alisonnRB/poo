class Ponto {
	// criação dos atributos que são as coordenadas de cada ponto
	int x;
	int y;
	
	// criando um método para determinar em qual quadrante o ponto está
	// definindo um tipo de retorno para o método
	public int determinarQuadrante() {
		if (x > 0 && y > 0)
			return 1;	// retorna o numero 1 se for 1º quadrante
		else if (x < 0 && y > 0)
			return 2;	// retorna o numero 2 se for 1º quadrante
		else if (x < 0 && y < 0)
			return 3;	// retorna o numero 3 se for 1º quadrante
		else if (x > 0 && y < 0)
			return 4; // retorna o numero 4 se for 1º quadrante
		
		return 0; // retorna 0 se o ponto não estiver em nenhum quadrante
	}

	// método responsável por trocar as coordenas de x e y
	// com isso não é mais preciso definir os atributos diretamente
	public void definirCoordenada(int x, int y){
		// a referencia this é usada para resolver problemas de
		//ambiguidade no nome de parametros e atributos
		this.x = x; // this.x refere-se ao atributo x da classe
		this.y = y; // this.y refere-se ao atributo y da classe
		
	}
	
	// criando um método construtor para definir as coordenadas
	public Ponto(int x, int y) {
		definirCoordenada(x, y);
	}
	
	public static void main (String args[]) {
		// criando uma instancia da classe Ponto
		// ao definir o método construtor, o construtor padrão fornecido
		// pela linguagem java deixa de funcionar
		Ponto p1 = new Ponto(-1, 5);
		
		// definindo as coordenadas do ponto através de um método
		// p1.definirCoordenada(-1, 2);
		
		// armazenando o retorno do método em uma varivel
		int quadrante = p1.determinarQuadrante();
		
		if (quadrante == 1)
			System.out.println("1º quadrante");
		else if (quadrante == 2)
			System.out.println("2º quadrante");
		else if (quadrante == 3)
			System.out.println("3º quadrante");
		else if (quadrante == 4)
			System.out.println("4º quadrante");
		else 
			System.out.println("A coordenada não está em nenhum quadrante");
		
		Ponto p2 = new Ponto(5, 1);
		
		// agora o método definir coordenadas serve para alterar os valores de das coordenadas x e y
		p2.definirCoordenada(-5, -4);
		
		if (p2.determinarQuadrante() == 1)
			System.out.printf("x=%d e y=%d está no 1º quadrante", 
				p2.x, p2.y);
		else if (p2.determinarQuadrante() == 2)
			System.out.printf("x=%d e y=%d está no 2º quadrante", 
				p2.x, p2.y);
		else if (p2.determinarQuadrante() == 3)
			System.out.printf("x=%d e y=%d está no 3º quadrante", 
				p2.x, p2.y);
		else if (p2.determinarQuadrante() == 4)
			System.out.printf("x=%d e y=%d está no 4º quadrante", 
				p2.x, p2.y);
		else 
			System.out.printf("x=%d e y=%d não está em nenhum quadrante", 
				p2.x, p2.y);
		
	}
}
