/*
What is the result?
 A. BD
 B. DB
 C. BDC
 D. DBC
 E. Compilation fails
 */
package selftestanswerscap02;

/**
 *
 * @author Rafael
 */
class Top {
 public Top(String s) { System.out.print("B"); }
}
    public class Ejercicio02 extends Top {
    
    
    public static void main(String [] args) {
    new Ejercicio02("C");
    System.out.println(" ");
}

    public Ejercicio02(String s) {
        super(s);
    }
}

//Resouesta E y al componer es B
/*La llamada super() en el constructor de Bottom2 no se puede satisfacer porque 
no hay un constructor no-arg en la parte superior. 
*/
