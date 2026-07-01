public class Psicologo extends Profissional {

    private String abordagem;
    
    //Construtor Mínimo
    public Psicologo(String nome) {
        super(nome, "Psicologia");
    }

    //Construtor Intermediário
    public Psicologo(String nome, String registro, double valorConsulta) {
        super(nome, "Psicologia", registro, valorConsulta);
    }

    //Construtor Completo
    public Psicologo(String nome, String registro, double valorConsulta, String[] diasDisponiveis, int totalDias) {
        super(nome, "Psicologia", registro, valorConsulta, diasDisponiveis, totalDias);
    }

    // Implementação dos métodos abstratos
    @Override
    public String registrarEspecifico(Atendimento atendimento) {
        return "Psicólogo: " + getNome() + " | Abordagem: " + abordagem;
    }

    @Override
    public String exibirResumo() {
        return "Fisioterapeuta: " + getNome() + " | Registro: " + getRegistro();
    }

    //getters e setters
    public String getAbordagem() { return abordagem; }
    public void setAbordagem(String abordagem) { this.abordagem = abordagem; }

}
