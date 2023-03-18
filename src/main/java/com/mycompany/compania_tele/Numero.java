
package com.mycompany.compania_tele;


public class Numero {
    private int numero_personas_plan;

    
    public Numero (int numero_personas_plan){
        this.numero_personas_plan = numero_personas_plan;
        
    }
    //GETTERS
    public int GetNumeroPersonasPlan (){
        return numero_personas_plan;

    }
    
    //SETTERS
    
    public void SetNumeroPersonasPlan (int numero_personas_plan) {
       this.numero_personas_plan = numero_personas_plan;
    }

}