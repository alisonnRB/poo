class Ponto {
	// criação dos atributos que são as coordenadas de cada ponto
	int x;
	int y;
	
	// criando um método para determinar em qual quadrante o ponto está
	public void determinarQuadrante() {
		if (x > 0 && y > 0)
			System.out.println("1º quadrante");
		else if (x < 0 && y > 0)
			System.out.println("2º quadrante");
		else if (x < 0 && y < 0)
			System.out.printf("3º quadrante");
		else if (x > 0 && y < 0)
			System.out.printf("4º quadrante");
	
	}

	public static void main (String args[]) {
		// criando uma instancia da classe Ponto
		Ponto p1 = new Ponto();
		
		// definindo diretamente as coordenadas do ponto
		p1.x = 2;	// define o atributo x de p1
		p1.y = -1;	// define o atribuyo y de p1
		
		p1.determinarQuadrante();
		
		Ponto p2 = new Ponto();
		p2.x = 5;
		p2.y = 1;
		p2.determinarQuadrante();
	}
}
