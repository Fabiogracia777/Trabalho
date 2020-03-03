package hospitalfantasy;

import java.util.ArrayList;

public class HospitalFantasy {

    public static void main(String[] args) {

        Paciente p1 = new Paciente("Edinan", 36, 90);

        Responsavel Enfermeira = new Responsavel("Viviane", "Enfermeira", p1);

        Responsavel pai = new Responsavel("Sr Antonio", "Pai do paciente", p1);

        Responsavel medico = new Responsavel("Dr. Rafael Mendes", "Médico", p1);

        Monitoramento m = new Monitoramento();
        m.addPaciente(p1);
        m.monitorar();

    }

}
