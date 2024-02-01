import java.util.ArrayList;
import java.util.Scanner;

class Aluno {
    private String nome;
    private int idade;
    private String curso;

    public Aluno(String nome, int idade, String curso) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCurso() {
        return curso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override // Ele é uma forma de garantir que você está sobrescrevendo um método e não criando um novo.
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", Curso: " + curso;
    }
}
public class cadastrodeAlunos {
    private ArrayList<Aluno> alunos;
    private Scanner scanner;

    public cadastrodeAlunos() {
        alunos = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void adicionarAluno() {
        System.out.print("Nome do aluno: ");
        String nome = scanner.nextLine();
        System.out.print("Idade do aluno: ");
        int idade = Integer.parseInt(scanner.nextLine());
        System.out.print("Curso do aluno: ");
        String curso = scanner.nextLine();

        Aluno aluno = new Aluno(nome, idade, curso);
        alunos.add(aluno);
        System.out.println("Aluno adicionado com sucesso!");
    }

    public void visualizarAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            System.out.println("Lista de Alunos:");
            for (Aluno aluno : alunos) {
                System.out.println(aluno);
            }
        }
    }

    public void editarAluno() {
        visualizarAlunos();
        if (!alunos.isEmpty()) {
            System.out.print("Digite o índice do aluno a ser editado: ");
            int indice = Integer.parseInt(scanner.nextLine());
            if (indice >= 0 && indice < alunos.size()) {
                System.out.print("Novo nome do aluno: ");
                String nome = scanner.nextLine();
                System.out.print("Nova idade do aluno: ");
                int idade = Integer.parseInt(scanner.nextLine());
                System.out.print("Novo curso do aluno: ");
                String curso = scanner.nextLine();

                Aluno aluno = alunos.get(indice);
                aluno.setNome(nome);
                aluno.setIdade(idade);
                aluno.setCurso(curso);

                System.out.println("Informações do aluno atualizadas com sucesso!");
            } else {
                System.out.println("Índice inválido.");
            }
        }
    }

    public void excluirAluno() {
        visualizarAlunos();
        if (!alunos.isEmpty()) {
            System.out.print("Digite o índice do aluno a ser excluído: ");
            int indice = Integer.parseInt(scanner.nextLine());
            if (indice >= 0 && indice < alunos.size()) {
                alunos.remove(indice);
                System.out.println("Aluno removido com sucesso!");
            } else {
                System.out.println("Índice inválido.");
            }
        }
    }

    public static void main(String[] args) {
        cadastrodeAlunos cadastro = new cadastrodeAlunos();
        Scanner scanner = new Scanner(System.in);
        boolean executando = true;

        while (executando) {
            System.out.println("\n===== Cadastro de Alunos =====");
            System.out.println("1. Adicionar Aluno");
            System.out.println("2. Visualizar Alunos");
            System.out.println("3. Editar Aluno");
            System.out.println("4. Excluir Aluno");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    cadastro.adicionarAluno();
                    break;
                case 2:
                    cadastro.visualizarAlunos();
                    break;
                case 3:
                    cadastro.editarAluno();
                    break;
                case 4:
                    cadastro.excluirAluno();
                    break;
                case 5:
                    executando = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}