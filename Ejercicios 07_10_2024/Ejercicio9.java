public class Ejercicio9 {
    public static void main(String[] args) {
        // Inicializamos la variable entera 'var' con valor 1
        int var = 1;
        
        // Declaramos cuatro variables booleanas
        boolean r, s, t, v;

        // Primera operación:
        // Evaluamos: (var > 1) && (var++ < 100) --  Condicion && (se tienen que cumplir ambas)
        // 1. var > 1 es false, ya que var es 1.
        // 2. Debido a que la primera condición es false, el operador && no evalúa la segunda parte (var++ < 100).
        //    Este fenómeno se llama "evaluación perezosa" (short-circuit), es decir, si el primer término es false, el resultado total es false.
        // 3. Como la segunda parte no se evalúa, var no se incrementa.
        // Resultado: r = false
        r = (var > 1) && (var++ < 100);

        // Segunda operación:
        // Evaluamos: (100 < var) && (150 > var++)
        // 1. 100 < var es false, porque var sigue siendo 1.
        // 2. Debido a que el primer término es false, la segunda parte (150 > var++) no se evalúa (nuevamente, por el short-circuit del operador &&).
        // 3. El incremento var++ no ocurre.
        // Resultado: s = false
        s = (100 < var) && (150 > var++);

        // Tercera operación:
        // Evaluamos: (100 == var) || (200 > var++) -- Condicion || (Uno de los 2)
        // 1. 100 == var es false, porque var es 1.
        // 2. Como el primer término es false, ahora se evalúa el segundo término, ya que el operador || necesita verificar la otra parte.
        // 3. var++ es evaluado antes del incremento, por lo que var sigue siendo 1 durante la comparación (200 > 1), que es true.
        // 4. Después de la evaluación, var se incrementa, ahora es 2.
        // Resultado: t = true
        t = (100 == var) || (200 > var++);

        // Cuarta operación:
        // Evaluamos: (100 == var) || (200 > var++)
        // 1. 100 == var es false, porque var ahora es 2.
        // 2. Se evalúa el segundo término: (200 > var++). Como var es 2, la comparación (200 > 2) es true.
        // 3. Después de la comparación, var se incrementa y ahora es 3.
        // Resultado: v = true
        v = (100 == var) || (200 > var++);

        // Imprimimos los resultados de las variables booleanas
        // Esto mostrará: false false true true
        System.out.println(r + " " + s + " " + t + " " + v);

        // Imprimimos el valor final de la variable 'var'
        // Después de las operaciones, 'var' ha sido incrementado dos veces en las evaluaciones lógicas, por lo que su valor final es 3.
        System.out.println("Var: " + var);
    }
}
