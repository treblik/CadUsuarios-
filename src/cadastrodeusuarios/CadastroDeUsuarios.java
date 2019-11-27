package cadastrodeusuarios;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroDeUsuarios {

    public static void main(String[] args) {
        ArrayList<Usuario> usuarios = new ArrayList();
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("[1]Adicionar ");
            System.out.println("[2]Mostrar usuarios");
            System.out.println("[3]Encontrar Usuario ");
            System.out.println("[4]Remover Usuario");
            System.out.println("[5]Sair ");
            System.out.println("Digite a opção");
            String opcao = sc.nextLine();

            switch (opcao) {

                case "1": {
                    System.out.println("Digite o email:");
                    String email = sc.nextLine();
                    System.out.println("Digite a senha");
                    String senha = sc.nextLine();

                    Usuario u = new Usuario();
                    u.setEmail(email);
                    u.setSenha(senha);

                    usuarios.add(u);

                    break;
                }

                case "2": {
                    for (int i = 0; i < usuarios.size(); i++) {
                        Usuario uTemporaria = usuarios.get(i);
                        System.out.println("Usuario" + i);
                        System.out.println("Email" + uTemporaria.getEmail());
                        System.out.println("Senha" + uTemporaria.getSenha());
                        System.out.println("");

                    }
                    break;
                }
                case "3": {
                    System.out.println("Digite o email q deseja encontrar");
                    String encontra = sc.nextLine();
                    for (int i = 0; i < usuarios.size(); i++) {
                        Usuario uTemporaria = usuarios.get(i);
                        if (encontra.equals(uTemporaria.getEmail())) {
                            System.out.println("Usuario" + i);
                            System.out.println("Email" + uTemporaria.getEmail());
                            System.out.println("Senha" + uTemporaria.getSenha());
                            System.out.println("");
                        }

                    }
                     break;   
                }
                case "4": {

                    for (int i = 0; i < usuarios.size(); i++) {
                        Usuario uTemporaria = usuarios.get(i);
                        System.out.println("Usuario" + i);
                        System.out.println("Email" + uTemporaria.getEmail());
                        System.out.println("Senha" + uTemporaria.getSenha());
                        System.out.println("");

                    }
                    System.out.println("Digite o usuario que quer remover ");
                    int remove = sc.nextInt();
                    usuarios.remove(remove);

                    break;
                }

                case "5": {
                    continuar = false;
                    break;
                }

            }
        }
    }
}
