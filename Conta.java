class Conta {
	// atributos da classe
	String nome; // nome do cliente
	float saldo;	// saldo do cliente
	Data abertura;	// indica quando a conta do cliente foi aberta - exemplo de composição/
	
	public Conta (String nome, Data dt) {
		
		// validação do nome do cliente
		// apenas nomes com mais de 5 caracteres serão aceitos
		if (nome.length() > 5){
			this.nome = nome;
		} else {
			System.out.println("Nome do cliente inválid");
			// necessário atribuir um valor ao atributo nome
			// se não for inicializado o atributo, na hora de mostrar o extrato será exibido
			// Nome: null 
			this.nome = "Indefinido - fale com o grente para alterar o nome";
			
		}
		
		this.abertura = dt;	// inicializando a data de abertura da conta
		
		saldo = 0;	// ao abrir a conta, o saldo está zerado
	}
	
	// método para imprimir os dados da classe
	public void imprimirExtrato(){
		System.out.printf("Extrato de conta \n");
		System.out.printf("Cliente: %s \n", nome);
		System.out.printf("Conta aberta em %s \n", abertura.escreverPorExtenso() );
		System.out.printf("Saldo: %.2f \n", saldo);
		System.out.printf("----------------\n");
	}
	
	public static void main(String args[]) {
		
		// criando uma variavel para armazenar a data que Pablo abriu a conta
		Data d1 = new Data(8 , 3, 2021);
		
		// criando a conta do Pablo
		// agora é obrigatório passar um argumento do tipo data para criar uma conta
		Conta cta1 = new Conta("Pablo da Silva", d1);
		
		// criando a conta da Júlia
		Conta cta2 = new Conta("Júlia Snidze", new Data(41, 8, 2019) );
		
		// fazendo operações de deposito e saque na conta do Pablo
		cta1.depositar(200);
		cta1.depositar(100);
		cta1.sacar(150);
		
		// imprimindo o extrato do Pablo
		cta1.imprimirExtrato();
		
		// ao depositar/sacar da conta da Júlia, vamos validar se as operações foram executadas com sucesso

		if (cta2.depositar(-300) ) {
			System.out.println("Depósito realizado com sucesso!");
		} else {
			System.out.println("Houve um erro ao depositar!");
		}
		
		if (cta2.sacar(100) ){
			System.out.printf("Saque realizado com sucesso");
		} else {
			System.out.printf("Houve um erro ao executar o saque");
		}
		
		// imprimindo o extrato da Júlia
		cta2.imprimirExtrato();
	}

	public boolean depositar(float valor){
		if (valor > 0) {
			saldo = saldo + valor;
			return true; // indica que teve sucesso
		}
		
		return false;	// falha no deposito
	}
	
	public boolean sacar(float valor){
		if (valor > 0) {
			saldo -= valor;
			return true; // sucesso ao sacar
		}
		
		return false;	// falha ao sacar
	}
}
