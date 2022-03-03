

public class Ficha {

    Dado dado = new Dado(6);
    public String color;
    public int posicion;

    public Ficha(String colorN){
        this.color = colorN;
        this.posicion = 0;
    }

    public void avanzar(){
        int pasos = dado.lanzar();
        posicion += pasos;
        System.out.println(posicion);
    }

}
