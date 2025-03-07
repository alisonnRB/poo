// criacao de uma nova classe
class Disciplina {

	// definicao dos atributos da classe
	String nome; // representa o nome da disciplina
	int cargaHoraria; // total de horas da disciplina
	String professor; // responsável por ministrar a disciplina;
	String avaliacaoI;	// representa a data da avaliacao I
	String avaliacaoII; // representa a data da avaliacao II

	// método responsável por printar as informac
	public void mostrarInformacoes(){
		// mostrando os dados dos dois componentes
		// em cada print, exibe-se o nome do atributo da classe
		System.out.printf("Disciplina: %s \n", nome);
		System.out.printf("Carga horária: %d \n", cargaHoraria);
		System.out.printf("Professor: %s \n", professor);
		System.out.printf("Data da avaliação I: %s \n", avaliacaoI);
		System.out.printf("Data da avaliação II: %s \n", avaliacaoII);
	
		System.out.printf("\n"); // colocando uma quebra de linha para separar as inforçãoes exibidas
	}

	 public static void main(String[] args){ 
		Disciplina poo = new Disciplina();	// criando uma instacia da classe disciplina chamada poo
		
		// preenchendo os atributos da instancia de classe chamada poo
		poo.nome = "Programação Orientada a Objetos";
		poo.cargaHoraria = 66;
		poo.professor = "Marco";
		poo.avaliacaoI = "17/04/2025";
		poo.avaliacaoII = "A definir";
		
		// preenchendo os atributos da instancia de classe chamada bd2
		Disciplina bd2 = new Disciplina();
		bd2.nome = "Banco de dados II";
		bd2.cargaHoraria = 66;
		bd2.professor = "Gabriel Marchezan";
		bd2.avaliacaoI = "A definir";
		bd2.avaliacaoII = "A definir";
		
		poo.mostrarInformacoes();
		
		bd2.mostrarInformacoes();

		// preenchendo os atributos da instancia de classe chamada mq
		Disciplina mq = new Disciplina();
		mq.nome = "Métodos quantitativos";
		mq.professor = "Douglas Manentti";
		mq.cargaHoraria = 66;
		mq.avaliacaoI = "A definir";
		mq.avaliacaoII = "A definir";
		
		// exibindo as informações
		mq.mostrarInformacoes();
	 }

}
