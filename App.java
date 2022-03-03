public class App {
    public static void main(String[] args) throws Exception {
         boolean continuar = true;

         Tablero tablero = new Tablero();
         tablero.listaFichas();

         while(continuar){
             tablero.turnos();
             if(tablero.win()){
                 continuar = false;
             }
         }
    }
}
