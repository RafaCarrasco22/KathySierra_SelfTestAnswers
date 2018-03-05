/*Which method names follow the JavaBeans standard? (Choose all that apply.)
 A. addSize
 B. getCust
 C. deleteRep
 D. isColorado
 E. putDimensions
*/
package seltestanswerscap01;

/**
 *
 * @author Rafael
 */
public class Ejercicio02 {
    public static void main(String[] args) {
         Metodos ejemplo = new Metodos(1,9);
         System.out.println("Usando get: "+ ejemplo.getPrueba1()+" y "+
                 ejemplo.getPrueba2());
     }
}
//La respuesta es B y D usan los prefijos validos