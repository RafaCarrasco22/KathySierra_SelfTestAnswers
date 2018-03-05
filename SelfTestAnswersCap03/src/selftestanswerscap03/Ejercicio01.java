/*
When // doStuff is reached, how many objects are eligible for GC?
 A. 0
 B. 1
 C. 2
 D. Compilation fails
 E. It is not possible to know
 F. An exception is thrown at runtime
 */
package selftestanswerscap03;

/**
 *
 * @author Rafael
 */
class CardBoard {
    Short story = 200;
    CardBoard go(CardBoard cb) {
    cb = null;
    return cb;
 }
 
    public static void main(String[] args) {
        CardBoard c1 = new CardBoard();
        CardBoard c2 = new CardBoard();
        CardBoard c3 = c1.go(c2);
        c1 = null;
 // do Stuff
    } 
}
//R= C, Solo un objeto CardBoard (c1) es elegible