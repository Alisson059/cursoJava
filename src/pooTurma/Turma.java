package pooTurma;

public class Turma extends Senac {
	String mencao;
	String emailEducacional;
	
	//Construtor
	public Turma(){
		System.out.println();
		
	}
	
	public void unidadeCurricular() {
		if (mencao == "D") {
			aprovarAluno();
		}
		
		else {
			reprovarAluno();
		}
	
	}
	
	private void aprovarAluno() {
		System.out.println("Aluno(a) aprovado(a)!");
	}
	
	private void reprovarAluno() {
		System.out.println("Aluno(a) reprovado(a)!");
	}
}