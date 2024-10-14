public class Ejercicio4 {
    public static void main(String[] args) {
        char probador;
        probador='c';
        System.err.println("Probador: "+probador);
        ++probador; // Le suma 1 a probador es decir la siguiente letra del diccionario. D
        System.out.println("Probador: "+ probador);
        System.out.println("Probador: "+ probador++ + probador + probador-- + probador); //Al ser un post incremento nos muestra la variable probador sin el valor incrementado. (probador++ imprimirá : d, pero si fuera ++probador imprimiria: e)
    }
}
