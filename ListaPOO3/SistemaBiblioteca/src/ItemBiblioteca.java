public abstract class ItemBiblioteca {
    private String titulo;
    private static int gerarCodigo = 0;
    private int codigo;

    public ItemBiblioteca(String titulo){
        setTitulo(titulo);
        codigo = gerarCodigo++;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getCodigo() {
        return codigo;
    }

    public abstract void exibirInformacoes();
}
