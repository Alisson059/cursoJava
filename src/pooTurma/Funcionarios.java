package pooTurma;

public class Funcionarios {

	public static void main(String[] args) {
		//Objeto 1
		Administrativo funcionario1 = new Administrativo();
		funcionario1.nome = "Joelma";
		funcionario1.telefone = "11963592147";
		funcionario1.emailPessoal = "Joelma@gmail.com";
		funcionario1.emailCorporativo = "Joelma@senac.edu.br";
		funcionario1.redeDominio = "@sp.senac.br";
		funcionario1.acessarSistema();
		
		
		//Objeto 2
		Administrativo funcionario2 = new Administrativo();
		funcionario2.nome = "Carlos";
		funcionario2.telefone = "11969856473";
		funcionario2.emailPessoal = "Carlos@gmail.com";
		funcionario2.emailCorporativo = "Carlos@senac.edu.br";
		funcionario2.redeDominio = "@sp.sesi.br";
		funcionario2.acessarSistema();
		

	}

}