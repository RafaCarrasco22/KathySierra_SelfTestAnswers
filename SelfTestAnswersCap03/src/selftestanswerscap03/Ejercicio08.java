/*
 What is the result?
 A. 5 7
 B. 5 8
 C. 8 7
 D. 8 8
 E. Compilation fails
 */
package selftestanswerscap03;

/**
 *
 * @author Rafael
 */
public class Ejercicio08 {
    static int ouch = 7;
    public static void main(String[] args) {
        new Ejercicio08().go(ouch);
        System.out.print(" " + ouch);
    }
 
    void go(int ouch) {
        ouch++;
        for(ouch = 3; ouch < 6; ouch++)
        ;
        System.out.print(" " + ouch);
    }
 }
//La respuesta es E
//al arreglar el error el resultado es 6 7