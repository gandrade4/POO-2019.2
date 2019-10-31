package s12;

import java.util.Map;

class Paciente{
    String id;
    Map<String, Medico> medicos;
    void addMedico(Medico medico) {
        Medico pmedico = medicos.get(medico.id);
        if(pmedico != null)
            return;
        medicos.put(medico.id, medico);
        medico.addPaciente(this);
    }
    void delMedico(Medico medico){
        Medico pmedico = medicos.get(medico.id);
        if (pmedico != null){
            return;
        }
        medicos.remove(medico.id);
        medico.delPaciente(this);
    }

}
class Medico{
    String id;
    Map<String, Paciente> pacientes;
    void addPaciente(Paciente paciente) {
        Paciente mpaciente = pacientes.get(paciente.id);
        if(mpaciente != null)
            return;
        pacientes.put(paciente.id, paciente);
        paciente.addMedico(this);
    }

    void delPaciente(Paciente paciente){
        Paciente mpaciente = pacientes.get(paciente.id);
        if (mpaciente != null){
            return;
        }
        pacientes.remove(paciente.id);
        paciente.delMedico(this);
    }
}
class Hospital{
    Map<String, Paciente> pacientes;
    Map<String, Medico> medicos;

    void removerPaciente (String id){

    }
}

public class Controller {
}
