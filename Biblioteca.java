import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    public String nome;
    public ArrayList<Livro> livros;

    public static ArrayList<Biblioteca> bibliotecas = new ArrayList<>();

    public Biblioteca(String nome) {
        this.nome = nome;
        this.livros = new ArrayList<>();
        bibliotecas.add(this);
    }

    public String getNome() {
        return nome;
    }

    public String toString() {
        return "Nome: " + this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void listarLivros() {
        for (Livro livro : this.livros) {
            System.out.println(livro.toString());
        }
    }

    public static void listarBibliotecas() {
        for(int i = 0; i < bibliotecas.size(); i++) {
            Biblioteca biblioteca = bibliotecas.get(i);
            System.out.println(i + " - " + biblioteca.toString());
            biblioteca.listarLivros();
        }
    }
}
////////////////////////////////////////////////////////////


