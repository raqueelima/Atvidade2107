public class Calculo {
    private double totalSalario;

    public void calculaSalario(double salarioBase, double horasTrabalhadas) {
        this.totalSalario = salarioBase * horasTrabalhadas;
    }

    public double getTotalSalario() {
        return this.totalSalario;
    }
}
