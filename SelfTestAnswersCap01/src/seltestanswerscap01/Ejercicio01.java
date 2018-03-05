/*Which is true? (Choose all that apply.)
 A. "X extends Y" is correct if and only if X is a class and Y is an interface
 B. "X extends Y" is correct if and only if X is an interface and Y is a class
 C. "X extends Y" is correct if X and Y are either both classes or both interfaces
 D. "X extends Y" is correct for all combinations of X and Y being classes and/or interfaces
*/
package seltestanswerscap01;

/**
 *
 * @author Rafael
 */
public class Ejercicio01 {
    public static void main(String[] args) {
    
    Aux1 p = new Aux1(2);
    Aux2 h = new Aux2();
    p.metodo01();       //a
    h.metodo01();       //b

    }
}
//La respuesta es C
