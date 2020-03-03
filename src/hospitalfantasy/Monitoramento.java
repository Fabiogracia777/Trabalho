package hospitalfantasy;

import java.util.ArrayList;

public class Monitoramento {

    ArrayList<Paciente> listadepacientes = new ArrayList<>();

    public void addPaciente(Paciente p1) {
        this.listadepacientes.add(p1);
    }
    
    public void monitorar(){
        
        for(Paciente p : listadepacientes){
            p.notificar();
        }
    }

}
