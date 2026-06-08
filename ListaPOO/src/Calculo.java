public class Calculo {
    private double totalSalario;
    private double salarioBase;
    private int horasTrab;

    public void calculaSalario(){
        totalSalario = salarioBase*horasTrab;
    }

    public void setHoras_trab(int horasTrab) {
        this.horasTrab = horasTrab;
    }

    public void setSalario_base(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getTotalSalario() {
        return totalSalario;
    }

    public int getHoras_trab() {
        return horasTrab;
    }

    public double getSalario_base() {
        return salarioBase;
    }
}