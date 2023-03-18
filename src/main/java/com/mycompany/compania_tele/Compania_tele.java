
package com.mycompany.compania_tele;
import java.util.Scanner;
public class Compania_tele {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int loop;

        
        Tipoplan p = new Tipoplan ("Preferencial");
        Tipoplan n = new Tipoplan ("Normal");
        Cliente min = new Cliente (0);
        Numero nump = new Numero (0);
        Numero numn = new Numero (0);
        

        do{
            
            System.out.println("Ingrese el tipo de plan del cliente\n 1. Tipo Plan P (Preferencial)\n 2. Tipo Plan N (Normal)\n: \n");
            int opc = read.nextInt();
            
                if (opc == 1) {
                    System.out.println("Has seleccionado el plan Preferencial.\n");
                    p.SetNombrePlan("Preferencial");
                    nump.SetNumeroPersonasPlan(nump.GetNumeroPersonasPlan()+1);

                    
                    System.out.println("Ingrese la cantidad de minutos utilizados:\n");
                    min.SetMinConex(read.nextInt());
                    
                        System.out.println();
                        int mul= min.GetMinConex() * 80;
                        int pagototal = 15000 + mul;

                        System.out.println("El monto total que debe pagar el cliente es de: "+ pagototal);
                    }
                    
                    
                    

                if (opc == 2){
                    System.out.println("Has seleccionado el plan Normal.\n Ingrese la cantidad de minutos utilizados:\n");
                    n.SetNombrePlan("Normal");
                    numn.SetNumeroPersonasPlan(numn.GetNumeroPersonasPlan()+1);

                    
                    System.out.println("Ingrese la cantidad de minutos utilizados:\n");
                    min.SetMinConex(read.nextInt());
                    int multi= min.GetMinConex() * 120;
                    int pago_total = 7000 + multi;
                
                    
                    System.out.println("El monto total que debe pagar el cliente es de: "+ pago_total);
            }   
                
                
                System.out.println("La cantidad de clientes con el plan preferencial es de"+ nump);
                System.out.println("La cantidad de clientes con el plan normal es de"+ numn);
                
            
            
         
            
            System.out.println("Si desea continuar presione 0");
        loop = read.nextInt();
        }while (loop == 0);
        
        
    }
}
