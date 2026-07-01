public class Nutricionista extends Profissional {
    private String abordagem;

    //Construtor Mínimo
    public Nutricionista(String nome) {
        super(nome, "Nutrição");
    }

    //Construtor Intermediário
    public Nutricionista(String nome, String registro, double valorConsulta) {
        super(nome, "Nutrição", registro, valorConsulta);
    }

    //Construtor Completo
    public Nutricionista(String nome, String registro, double valorConsulta, String[] diasDisponiveis, int totalDias) {
        super(nome, "Nutrição", registro, valorConsulta, diasDisponiveis, totalDias);
    }

    // Implementação dos métodos abstratos
    @Override
    public String registrarEspecifico(Atendimento atendimento) {
        return "Registrando sessão de fisioterapia: Avaliação motora e tratamento.";
    }

    @Override
    public String exibirResumo() {
        return "Fisioterapeuta: " + getNome() + " | Registro: " + getRegistro();
    }

    //getters e setters

    public String getAbordagem() { return abordagem; }
    public void setAbordagem(String abordagem) { this.abordagem = abordagem; }
}
