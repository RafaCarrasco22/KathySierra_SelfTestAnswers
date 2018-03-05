/*
Which is a correct class? (Choose all that apply.)
A. public abstract class Frob implements Frobnicate {
public abstract void twiddle(String s) { }
}
B. public abstract class Frob implements Frobnicate { }
C. public class Frob extends Frobnicate {
public void twiddle(Integer i) { }
}
D. public class Frob implements Frobnicate {
public void twiddle(Integer i) { }
}
E. public class Frob implements Frobnicate {
public void twiddle(String i) { }
public void twiddle(Integer s) { }
}
 */
package selftestanswerscap02;

/**
 *
 * @author Rafael
 */
public class Ejercicio01 {
     public abstract interface Frobnicate { public void twiddle(String s); }
 //CLASE DE B
    public abstract class Frob implements Frobnicate { }
 
}

//CLASE E
class Frob implements Ejercicio01.Frobnicate {
    public void twiddle(String i) { }
    public void twiddle(Integer s) { }
}
 //Respuestas B y E