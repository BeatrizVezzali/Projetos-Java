package escola;

public class TesteAluno {
	
static Aluno Aluno0 = new Aluno();
static Aluno Aluno1 = new Aluno();
static Aluno Aluno2 = new Aluno();

public static void main (String[] args) {
	
	Aluno0.ra = "1111111";
	Aluno0 .nome = "Hermengarda";
	Aluno0.curso = "Corte e Costura";

	Aluno1.ra = "222222";
	Aluno1.nome = "Filisbina";
	Aluno1.curso = "Marcenaria";
	
	Aluno2.ra = "333333";
	Aluno2.nome = "Joaquina";
	Aluno2.curso = "Culinária";
	
	System.out.println("RA do aluno: " + Aluno0.ra);
	System.out.println("Nome: " + Aluno0.nome);
	System.out.println("Curso: " + Aluno0.curso);
	
	System.out.println("RA do aluno: " + Aluno1.ra);
	System.out.println("Nome: " + Aluno1.nome);
	System.out.println("Curso: " + Aluno1.curso);
	
	System.out.println("RA do aluno: " + Aluno2.ra);
	System.out.println("Nome: " + Aluno2.nome);
	System.out.println("Curso: " + Aluno2.curso);
}

}
