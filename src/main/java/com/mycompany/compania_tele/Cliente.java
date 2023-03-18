
package com.mycompany.compania_tele;


public class Cliente {
    private int min_conex;

    
    public Cliente (int min_conex){
        this.min_conex = min_conex;
        
    }
    //GETTERS
    public int GetMinConex(){
        return min_conex;
    }
    
    //SETTERS
    public void SetMinConex(int min_conex){
        this.min_conex = min_conex;

    }

}
