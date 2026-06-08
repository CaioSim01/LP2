public class Prontuario {
    private String exames, laudos, prescricoes;

    public Prontuario(String exames, String laudos, String prescricoes) {
        this.exames = exames;
        this.laudos = laudos;
        this.prescricoes = prescricoes;
    }

    public String getExames() {
        return exames;
    }

    public void setExames(String exames) {
        this.exames = exames;
    }

    public String getLaudos() {
        return laudos;
    }

    public void setLaudos(String laudos) {
        this.laudos = laudos;
    }

    public String getPrescricoes() {
        return prescricoes;
    }

    public void setPrescricoes(String prescricoes) {
        this.prescricoes = prescricoes;
    }
}
