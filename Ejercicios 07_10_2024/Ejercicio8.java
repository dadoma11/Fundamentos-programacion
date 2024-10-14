public class Ejercicio8 {
    public static void main(String[] args) {
        int a=1, b=2, c=3, d=1;
        float r, s=(float)3.5;
        r=a+b/c+d/a; //1 + 2/3 + 1 = 2 + 2/3 = 2,66666
        System.out.println(r);

        s=r-s;
        System.out.println(s);

        r=(long) s; //Al hacer un long eliminamos el decimal.
        System.out.println(r);

        ++r;
        System.out.println(r);
    }
}
