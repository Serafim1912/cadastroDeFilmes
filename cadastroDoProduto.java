package SIstemaCadastroDeProdutos;
import  SIstemaCadastroDeProdutos.cadastroDoProduto;
import java.util.Scanner;
public class cadastroDoProduto {
        Scanner cadast = new Scanner(System.in);
        //System.out.println("Nome do cadastrante:")
        String pessoaCadastrante = cadast.nextLine();
        //System.out.println("Nome do produto:");
        String nome = cadast.nextLine();
        //System.out.println("Preço do produto:")
        double preço = cadast.nextDouble();
        //System.out.println("Quantidade de produto:");
        double quantidade = cadast.nextDouble();
        
        String nulo = null;
        


        public void cadastroDoProduto() {
                if (cadast.equals(nulo)) {
                        System.out.println("Nenhum produto cadastrado.");
                        return;
                }

                int Produtos = 0;
                for (int i = 0; i < Produtos; i++) {

                        cadast = produtos.get(i);

                        System.out.println("Produto " + (i + 1));
                        produtos p = null;
                        System.out.println("Nome: " + p.getNome());
                        System.out.println("Preço: " + p.getPreço());
                        System.out.println("Quantidade: " + p.getQuantidade());
                        System.out.println("---------------------");
                }
        }
}
