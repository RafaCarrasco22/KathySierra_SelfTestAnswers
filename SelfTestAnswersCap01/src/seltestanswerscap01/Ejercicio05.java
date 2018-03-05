/*What is the result? (Choose all that apply.)
 A. 5 6 7
 B. 5 followed by an exception
 C. Compilation fails with an error on line 7
 D. Compilation fails with an error on line 8
 E. Compilation fails with an error on line 9
 F. Compilation fails with an error on line 10

*/

package seltestanswerscap01;

/**
 *
 * @author Rafael
 */
class Foo {
    int a = 5;
    protected int b = 6;
    public int c = 7;
}

public class Ejercicio05 {
    public static void main(String[] args) {
    Foo f = new Foo();
    System.out.print(" " + f.a);
    System.out.print(" " + f.b);
    System.out.print(" " + f.c);
}
}
//Respuesta D y E, pero ya compuesto es  A