/*Which, inserted independently at line 6, will compile? (Choose all that apply.)
 A. static void doStuff(int... doArgs) { }
 B. static void doStuff(int[] doArgs) { }
 C. static void doStuff(int doArgs...) { }
 D. static void doStuff(int... doArgs, int y) { }
 E. static void doStuff(int x, int... doArgs) { }
*/
package seltestanswerscap01;

/**
 *
 * @author Rafael
 */
class Voop {
        public static void main(String[] args) {
        doStuff(100);
        doStuff(100,50);
        
    }
        static void doStuff(int doArgs) { 
            System.out.println("Con el primer metodo: "+doArgs);
        }
        static void doStuff(int x, int doArgs) { 
        System.out.println("Con el segundo metodo: "+doArgs +"  "+ x);}
    }
//A y E son válidos