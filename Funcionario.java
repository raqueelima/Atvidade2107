import java.util.Date;

public class Funcionario {
    private String nome;
    private String cpf;
    private String rg;
    private int matricula;
    private final double salario;
    private Date dataContratacao;
    private double salarioBase;
    private double horasTrabalhadas;
    private static int geraMatricula = 0;

    public Funcionario(String nome, double salarioBase, double horasTrabalhadas) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.horasTrabalhadas = horasTrabalhadas;
        this.dataContratacao = new Date(); 
        this.matricula = ++geraMatricula;
        
        Calculo calculo = new Calculo();
        calculo.calculaSalario(salarioBase, horasTrabalhadas);
        this.salario = calculo.getTotalSalario();
    }

    public void calculaSalario() {
        Calculo calculo = new Calculo();
        calculo.calculaSalario(this.salarioBase, this.horasTrabalhadas);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Date getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(Date dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public double getSalario() {
        return salario;
    }

    public void imprimeDados() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("RG: " + rg);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Salário: " + salario);
        System.out.println("Data de Contratação: " + dataContratacao);
    }
}
