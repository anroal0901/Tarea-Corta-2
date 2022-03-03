import java.util.ArrayList;
import java.util.List;

public class Tablero {
    public int casillas;
    public int fichasTotales;
    List<Ficha> fichas;


    public Tablero() {
        this.casillas = 15;
        this.fichasTotales = 3;
        this.fichas = new ArrayList<Ficha>();
    }

    public void listaFichas(){
        int cont = 0;
        while (cont < fichasTotales){
            if (cont == 0){
                fichas.add(new Ficha("verde"));
                cont++;
            }else if(cont == 1){
                fichas.add(new Ficha("azul"));
                cont++;
            }else{
                fichas.add(new Ficha("rojo"));
                cont++;
            }
        }
    }

    public void turnos(){
        int cont = 0;
        while ((cont < fichas.size()) && (win() != true)){
            System.out.println(fichas.get(cont).color);
            fichas.get(cont).avanzar();
            cont++;
        }
    }

    public boolean win(){
        boolean winner = false;
        for (int i = 0; i < fichas.size(); i++){
            if ((fichas.get(i).posicion >= casillas) && (winner != true)){
                winner = true;
                System.out.println("El ganador es la ficha color: " + fichas.get(i).color);
            }
        }
        return winner;
    }

}
