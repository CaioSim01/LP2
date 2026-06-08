public class Main {
    public static void main(String[] args){
        Estagiario estag = new Estagiario("Caio", "Estagiario", 1000, "Sistemas de Informaçao");
        Analista analista = new Analista("Maria", "Analista", 3000, "Desenvolvimento de Software");
        Gerente gerente = new Gerente("Paulo", "Gerente", 5000, "Tecnologia da Informacao");

        estag.gerarRelatorio();
        analista.gerarRelatorio();
        gerente.gerarRelatorio();
    }
}
