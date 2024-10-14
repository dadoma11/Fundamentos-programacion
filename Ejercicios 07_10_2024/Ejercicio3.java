public class Ejercicio3 {
    public static void main(String[] args) {
        int i=3;
        {
            int j=4;
            System.out.println("J: "+j); //Aqui si funcionaria ya que encuentra la variable J
        }
        //System.out.println("J: "+j); //Dará error ya que J no se ve desde fuera del alcance superior.
        System.out.println("I: "+i);
    }
}
