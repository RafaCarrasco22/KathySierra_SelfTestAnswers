/*
What is the result?
 A. Clidlet
 B. Clidder
 C.Clidder
Clidlet
 D.Clidlet
Clidder
 E. Compilation fails
*/
package selftestanswerscap02;

/**
 *
 * @author Rafael
 */
class Clidder {
    private final void flipper() { System.out.println("Clidder"); }
}
public class Ejercicio03 extends Clidder {
    public final void flipper() { System.out.println("Clidlet"); }
    public static void main(String [] args) {
    new Ejercicio03().flipper();
    } 
}
//respuesta A