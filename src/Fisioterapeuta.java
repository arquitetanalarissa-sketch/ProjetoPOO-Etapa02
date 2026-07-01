public class Fisioterapeuta extends Profissional {
    
    private int totalSessoes;

    //Construtor Mínimo
    public Fisioterapeuta(String nome) {
        super(nome, "Fisioterapia");
    }

    //Construtor Intermediário
    public Fisioterapeuta(String nome, String registro, double valorConsulta) {
        super(nome, "Fisioterapia", registro, valorConsulta);
    }

    //Construtor Completo
    public Fisioterapeuta(String nome, String registro, double valorConsulta, String[] diasDisponiveis, int totalDias) {
        super(nome, "Fisioterapia", registro, valorConsulta, diasDisponiveis, totalDias);
    }

    // Implementação dos métodos abstratos
    @Override
    public String registrarEspecifico(Atendimento atendimento) {
        return "Plano de tratamento: " + totalSessoes + " sessões.";
    }

    @Override
    public String exibirResumo() {
        return "Fisioterapeuta: " + getNome() + " | Sessões Previstas: " + totalSessoes;
    }

    //getters e setters

    public int getTotalSessoes() { return totalSessoes; }
    public void setTotalSessoes(int sessoes) { this.totalSessoes = sessoes; }

}
