/*
Which, inserted at line 9, will compile? (Choose all that apply.)
 A. x2.do2();
 B. (Y)x2.do2();
 C. ((Y)x2).do2();
 D. None of the above statements will compile

 */
package selftestanswerscap02;

/**
 *
 * @author Rafael
 */
class X { void do1() { } }
class Y extends X { void do2() { } }

class Chrome {
    public static void main(String [] args) {
        X x1 = new X();
        X x2 = new Y();
        Y y1 = new Y();
        // insert code here
        ((Y)x2).do2();
    }
 }

//R = C