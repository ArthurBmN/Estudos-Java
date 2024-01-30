import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeTarefas {
    private ArrayList<String> tarefas;
    private Scanner scanner;

    public ListaDeTarefas() {
        tarefas = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void adicionarTarefa(String descricao) {
        tarefas.add(descricao);
    }

    public void excluirTarefa(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            tarefas.remove(indice);
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void mostrarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa na lista.");
        } else {
            for (int i = 0; i < tarefas.size(); i++) {
                System.out.println(i + ": " + tarefas.get(i));
            }
        }
    }

    public static void main(String[] args) {
        ListaDeTarefas lista = new ListaDeTarefas();
        Scanner scanner = new Scanner(System.in);
        boolean executando = true;

        while (executando) {
            System.out.println("\n===== Lista de Tarefas =====");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Excluir Tarefa");
            System.out.println("3. Mostrar Tarefas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    System.out.print("Digite a descrição da tarefa: ");
                    String descricao = scanner.nextLine();
                    lista.adicionarTarefa(descricao);
                    break;
                case 2:
                    System.out.print("Digite o índice da tarefa a ser excluída: ");
                    int indiceExcluir = scanner.nextInt();
                    lista.excluirTarefa(indiceExcluir);
                    break;
                case 3:
                    lista.mostrarTarefas();
                    break;
                case 4:
                    executando = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}