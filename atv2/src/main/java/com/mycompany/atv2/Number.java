/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.atv2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mapaf
 */
public class Number {
    
    private int Num;
    private boolean Cond;
    
    Number(int Num){
        this.Num = Num;
        this.Cond = Cond;
    }
    
    public synchronized int get(String idThread){
        while(this.Cond == false){
            try {
                this.wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Number.class.getName()).log(Level.SEVERE, null, ex);
            }    
        }
        
        System.out.println(idThread + " consumiu: " + Num);
        this.Cond = false;
        notifyAll();
        return this.Num;
    }
    
    public synchronized void produzir(String idThread, int value){
        while(this.Cond == true){
            try {
                this.wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Number.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.Cond = true;
        this.Num = value;
        notifyAll();
        System.out.println(idThread + " produziu: " + Num);
        
    }
}
