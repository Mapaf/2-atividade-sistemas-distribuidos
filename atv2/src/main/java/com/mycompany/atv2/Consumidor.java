/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.atv2;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mapaf
 */
public class Consumidor extends Thread{
    Number numero;
    
    Consumidor(Number numero){
        this.numero = numero;
    }
    
    @Override
    public void run(){
        int valor = 0;
        
        for(int k=0; k<10; k++){
            valor = this.numero.get(this.getName());
            try {
                sleep(200);
            } catch (InterruptedException ex) {
                Logger.getLogger(Produtor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
