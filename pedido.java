import java.util.ArrayList;
import java.util.Scanner;

public class pedido {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        class item {
            String descricao;
            int quantidade;
            String categoria;

            item(String descricao, int quantidade, String categoria) {
                this.descricao = descricao;
                this.quantidade = quantidade;
                this.categoria = categoria;
            }
        }

        ArrayList<item> listaDeItens = new ArrayList<>();

        while (true) {
            System.out.print("\nDigite a descrição do item (ou deixe em branco para encerrar): ");
            String descricao = leia.nextLine();

            if (descricao.isEmpty()) {
                break;
            }

            System.out.print("Digite a quantidade do item: ");
            int quantidade = leia.nextInt();

            System.out.println("Selecione a categoria:");
            System.out.println("1 - Alimento");
            System.out.println("2 - Eletronico");
            System.out.println("3 - Outros");
            System.out.print("Digite o número da categoria: ");
            int opcaocategoria = leia.nextInt();

            leia.nextLine();

            String categoria;

            if (opcaocategoria == 1) {
                categoria = "Alimento";
            } else if (opcaocategoria == 2) {
                categoria = "Eletronico";
            } else {
                categoria = "Outros";
            }

            item novoItem = new item(descricao, quantidade, categoria);
            listaDeItens.add(novoItem);
        }
        System.out.println("-----Lista de itens-----");
        for (item item : listaDeItens) {
            System.out.println(item.categoria + " " + item.descricao + " " + item.quantidade);
        }

        leia.close();
    }
}
