/* 
* Grupo: Lab_B001 
* Miembro 1: Daniel Domínguez Macías 
* Fecha: 18/10/2024
* Descripción: Calcular Suma de los primeros nuemeros usando bucles. 
* Versión: 1.0 */
public class sumanumeros {
    public static void main(String[] args) {
        int sum = 0;
        int i=1;
        while (i >= 100) {
            sum = sum +i;
            i++;
        }
        System.out.println("La suma es: " + sum);
    }
}
