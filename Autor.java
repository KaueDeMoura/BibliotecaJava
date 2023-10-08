import java.util.ArrayList;
import java.util.List;

public class Autor {
    public String nome;
    public static ArrayList<Autor> autores = new ArrayList<Autor>();

    public Autor(String nome) {
        this.nome = nome;

        autores.add(this);
    }

    public String toString() {
        return "Nome: " + this.nome;
    }

    public static void listarAutores() {
        for (Autor autor : autores) {
            System.out.println(autor.toString());
        }
    }

    public static List<Autor> getAutores() {
        return autores;
    }
}
////////////////////////////////////////////////////////////////////////

