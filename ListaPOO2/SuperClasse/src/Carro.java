public class Carro extends Veiculo{
    private String modelo, motor, combustivel;

    public Carro(String marca, String cor, int ano, double velocidademax, String modelo, String motor, String combustivel) {
        super(marca, cor, ano, velocidademax);
        this.modelo = modelo;
        this.motor = motor;
        this.combustivel = combustivel;
    }

    @Override
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Modelo do Carro: " + getModelo());
        System.out.println("Motor do Carro: " + getMotor());
        System.out.println("Combustivel do Carro: " + getCombustivel());
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
}
