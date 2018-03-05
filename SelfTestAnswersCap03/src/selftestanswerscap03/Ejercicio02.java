/*
What is the result?
 A.many
 B. a few
 C. Compilation fails
 D. The output is not predictable
 E. An exception is thrown at runtime
 */
package selftestanswerscap03;

/**
 *
 * @author Rafael
 */
class Alien {
    String invade(short ships) { return "a few"; }
    String invade(short... ships) { return "many"; }
}
class Defender {
    public static void main(String [] args) {
        System.out.println(new Alien().invade()); //linea de error System.out.println(new Alien().invade(7))
    }
}
//Es c despues de arreglar el error de compilacion