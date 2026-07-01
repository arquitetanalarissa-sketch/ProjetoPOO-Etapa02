public class ClinicoGeral extends Profissional {
    
    private String instituicaoFormadora;

    //Construtor Mínimo
    public ClinicoGeral(String nome) {
        super(nome, "Clínico geral");
    }

    //Construtor Intermediário
    public ClinicoGeral(String nome, String registro, double valorConsulta) {
        super(nome, "Clínico geral", registro, valorConsulta);
    }

    //Construtor Completo
    public ClinicoGeral(String nome, String registro, double valorConsulta, String[] diasDisponiveis, int totalDias) {
        super(nome, "Clínico geral", registro, valorConsulta, diasDisponiveis, totalDias);
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

    public String getInstituicaoFormadora() { return instituicaoFormadora; }
    public void setInstituicaoFormadora(String instituto) { this.instituicaoFormadora = instituto; }

}

