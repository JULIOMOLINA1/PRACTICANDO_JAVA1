package exercise1;

public class Evaluacion {
    public String curso;
    public double notaFinal;

    public Evaluacion(String curso, double notaFinal){
        this.curso = curso;
        this.notaFinal=notaFinal;
    }

    public String obtenerCategoria(){
        String categoria = "";
        if(notaFinal>=18 && notaFinal<=20){
            categoria = "Excelente";
        } else if (notaFinal>=14 && notaFinal<=17){
            categoria="Bueno";
        } else {
            if(notaFinal==13){
                categoria = "Regular";
            } else {
                categoria = "Desaprobado";
            }
        }
        return categoria;
    }

    public String obtenerEstado(){
        String estado = "";
        estado =  (notaFinal>=13)? "Aprobado": "Desaprobado";
        return estado;
    }

    public static void main(String[] args){
        Evaluacion evaluacion1 = new Evaluacion("Matematica", 18);
        Evaluacion evaluacion2 = new Evaluacion("Fisica", 12);
        System.out.println(evaluacion1.obtenerCategoria());
        System.out.println(evaluacion1.obtenerEstado());
        System.out.println(evaluacion2.obtenerCategoria());
        System.out.println(evaluacion2.obtenerEstado());
    }
}
