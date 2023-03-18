
package com.mycompany.compania_tele;

public class Tipoplan {
    private String nombre_plan;


    
    public Tipoplan (String nombre_plan){
        this.nombre_plan = nombre_plan;
        
    }
    //GETTERS
    public String GetNombrePlan(){
        return nombre_plan;
    }

    
    //SETTERS
    public void SetNombrePlan(String nombre_plan){
        this.nombre_plan = nombre_plan;

    }


}
