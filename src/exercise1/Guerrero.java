package exercise1;

public class Guerrero {
    public String nombre;
    public int vida;
    public int ataqueBase;

    public Guerrero(String nombre, int vida, int ataqueBase){
        this.nombre = nombre;
        this.vida = vida;
        this.ataqueBase = ataqueBase;
    }

    public Guerrero(Guerrero guerrero){
        this.nombre = guerrero.nombre;
        this.vida = guerrero.vida;
        this.ataqueBase = guerrero.ataqueBase;
    }

    public void atacar(Guerrero oponente){
        int danioAleatorio =(int)(Math.random()*11) + ataqueBase-5;
        oponente.vida = Math.max(0, oponente.vida-danioAleatorio);
        System.out.println(nombre+" ataco a "+ oponente.nombre);
        System.out.println("Le ocaciono " + danioAleatorio +" de daño.");
        System.out.println("Le queda "+ oponente.vida + " de vida a "+oponente.nombre);
    }

    public boolean estaVivo(){
        return vida>0;
    }

    public static void main (String[]args){
        Guerrero guerrero1 = new Guerrero("Aragorn", 100, 18);
        Guerrero guerrero2 = new Guerrero(guerrero1);
        guerrero2.nombre = "Clon Sombra";

        while(guerrero1.estaVivo() && guerrero2.estaVivo()){
            guerrero1.atacar(guerrero2);
            if(!guerrero2.estaVivo()){
                break;
            }
            guerrero2.atacar(guerrero1);
        }
        Guerrero ganador = guerrero1.estaVivo() ? guerrero1 : guerrero2;
        System.out.println("El ganador es: " + ganador.nombre);
    }
}
