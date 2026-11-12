package exercise1;

public class Libro {
    public String titulo;
    public String autor;
    public int paginas;
    public boolean disponible;

    public Libro (){
        titulo = "Sin titulo";
        autor = "Anonimo";
        paginas = 0;
        disponible = true;
    }

    public Libro (String titulo, String autor, int paginas, boolean disponible){
        this.titulo=titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.disponible = disponible;
    }

    public Libro (Libro myLibro){
        this.titulo = myLibro.titulo;
        this.autor = myLibro.autor;
        this.paginas = myLibro.paginas;
        this.disponible = myLibro.disponible;
    }

    public static void main (String [] args){
        Libro libro1 = new Libro();
        Libro libro2 = new Libro("Harry potter", "JK ROwling", 300, false);
        Libro libro3 = new Libro(libro2);
        libro3.titulo = "Cuitas del joven Werter";
        System.out.println(libro3.titulo);
        System.out.println(libro2.titulo);
    }

}
