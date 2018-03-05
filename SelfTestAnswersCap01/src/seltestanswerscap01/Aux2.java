/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seltestanswerscap01;

/**
 *
 * @author Rafael
 */
public class Aux2 extends Aux1{
    
    public Aux2 (){
        super(1);
    }
    
    public void metodo01(Integer x){ //sobrecarga

    }
    
    public void metodo01(){//Sobrescritura
	 System.out.println("Acceso a metodo del padre");
	//super.metodo01(); accede al del padre
    }
}
