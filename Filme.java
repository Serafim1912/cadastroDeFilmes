package javapooALURA.br.com.alura.screenwatch.modelo;
import java.util.Scanner;
public class Filme extends Main {


    //direto
    public String getDiretor() {
        return  diretor;
    }
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
    //direto
    //nomdefilme
    public String getTitulo(){
        return titulo;
    }

    public void setNomefilme(){
        this.titulo = titulo;
    }
    //nomdefilme
    //preçodaentrada
    public double getPreçoDaEntrada(){
        return preço ;
    }
    public void setPreçoDaEntrada(){
        this.titulo = titulo;
    }
    //preçodaentrada

    public void exibeFichaTecnica() {
        System.out.println("Nome do diretor:" + diretor);
        System.out.println("Nomde do filme: "+ titulo);
        System.out.println("Valor do filme:" + preço );


    }
}