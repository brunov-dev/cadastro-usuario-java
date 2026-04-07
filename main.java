import java.util.ArrayList;
import java.util.Scanner;

class Usuario {
    String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Usuario> usuarios = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n1 - Cadastrar usuário");
            System.out.println("2 - Listar usuários");
            System.out.println("3 - Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.print("Digite o nome: ");
                String nome = scanner.nextLine();
                usuarios.add(new Usuario(nome));
                System.out.println("Usuário cadastrado!");
            } else if (opcao == 2) {
                System.out.println("\nLista de usuários:");
                for (Usuario u : usuarios) {
                    System.out.println("- " + u.nome);
                }
            }

        } while (opcao != 3);

        scanner.close();
    }
}