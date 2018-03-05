/*
What is the result?
 A. 13
 B. Compilation fails due to multiple errors
 C. Compilation fails due to an error on line 6
 D. Compilation fails due to an error on line 7
 E. Compilation fails due to an error on line 11
*/
package seltestanswerscap01;

/**
 *
 * @author Rafael
 */


public class Ejercicio09 extends Hobbit {
    public static void main(String[] args) {
    Short myGold = 7;
    System.out.println(countGold(myGold, 6));
 }
 }

class Hobbit {
  int countGold(int x, int y) { return x + y; }
}
//La respuesta es D, en este caso es la linea 20