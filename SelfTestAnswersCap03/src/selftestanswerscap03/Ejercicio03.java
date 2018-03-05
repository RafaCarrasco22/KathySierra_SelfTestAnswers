/*
What is the result?
 A.2
 B. 4
 C. An exception is thrown at runtime
 D. Compilation fails due to an error on line 4
 E. Compilation fails due to an error on line 5
 F. Compilation fails due to an error on line 6
 G. Compilation fails due to an error on line 7
 */
package selftestanswerscap03;

/**
 *
 * @author Rafael
 */
class Dims {
    public static void main(String[] args) {
        int[][] a = {{1,2,}, {3,4}};
        int[] b = (int[]) a[1];
        Object o1 = a;
        int[][] a2 = (int[][]) o1;
        // linea eliminada int[] b2 = (int[]) o1;
        System.out.println(b[1]);
    } 
}
//R = C, había que borrar una linea