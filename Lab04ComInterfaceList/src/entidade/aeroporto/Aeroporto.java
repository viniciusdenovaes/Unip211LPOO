package entidade.aeroporto;

import entidade.Flyable;
import java.util.ArrayList;

public class Aeroporto {
    
    ArrayList<Flyable> coisasQueVoam;

    public Aeroporto() {
        this.coisasQueVoam = new ArrayList<>();
    }
    
    public void addFlyable(Flyable coisaQueVoa){
        if(coisasQueVoam.size() >= 4){
            System.out.println("Aeroporto Lotado");
            return;
        }
        coisasQueVoam.add(coisaQueVoa);
    }
    
    public void fazVoar(){
        int hora = 2;
        for(Flyable coisaQueVoa: coisasQueVoam){
            System.out.println("Hora: " + hora);
            coisaQueVoa.voa();
            System.out.println();
            hora++;
        }
        coisasQueVoam = new ArrayList<>();
    }
    
}
