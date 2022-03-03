public class Dado {

    public int caras;

    public Dado(int carasN){
        this.caras = carasN;
    }
    
    public int lanzar(){
        int numRandom = (int) (Math.random()*caras+1);
        return numRandom;
    }
}
