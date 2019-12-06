package s12;

class Hospital{
    Repositorio<Medico> medicos;

    public Hospital(){
        this.medicos = new Repositorio<>("Medico");
    }

    public String toString(){
        return "Médicos: " + medicos.getAll();
    }

}
