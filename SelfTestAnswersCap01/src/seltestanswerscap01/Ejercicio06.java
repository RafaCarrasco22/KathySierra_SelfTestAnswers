/*
What is the result? (Choose all that apply.)
 A. Compilation succeeds
 B. Compilation fails with an error on line 1
 C. Compilation fails with an error on line 3
 D. Compilation fails with an error on line 5
 E. Compilation fails with an error on line 7
 F. Compilation fails with an error on line 9
*/
package seltestanswerscap01;

/**
 *
 * @author Rafael
 */
public class Ejercicio06 implements Device
 { public void doIt() { } }

 abstract class Phone1 extends Ejercicio06 { }

abstract class Phone2 extends Ejercicio06
{ public void doIt(int x) { } }

class Phone3 extends Ejercicio06 implements Device
{ public void doStuff() { } }
interface Device { public void doIt(); }

//Respuesta A