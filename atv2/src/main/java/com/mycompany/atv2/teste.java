/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.atv2;

/**
 *
 * @author mapaf
 */
public class teste {
    
    public static void main(String[] args){
        Number n = new Number(0);
        Produtor p = new Produtor(n);
        Consumidor c = new Consumidor(n);
        p.start();
        c.start();
    }
    
}
