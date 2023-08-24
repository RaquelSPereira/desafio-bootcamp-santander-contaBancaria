public class ContaBancaria {
    private int numeroContaBancaria;
    private String agenciaContaBancaria;
    private String nomeCliente;
    private double saldoContaBancaria;

    public ContaBancaria(int numeroContaBancaria, String agencia, String nomeCliente, double saldo) {
        this.numeroContaBancaria = numeroContaBancaria;
        this.agenciaContaBancaria = agencia;
        this.nomeCliente = nomeCliente;
        this.saldoContaBancaria = saldo;
    }

    // Getters e Setters
    public int getNumeroContaBancaria() {
        return numeroContaBancaria;
    }

    public void setNumeroContaBancaria(int numeroContaBancaria) {
        this.numeroContaBancaria = numeroContaBancaria;
    }

    public String getAgenciaContaBancaria() {
        return agenciaContaBancaria;
    }

    public void setAgenciaContaBancaria(String agenciaContaBancaria) {
        this.agenciaContaBancaria = agenciaContaBancaria;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldoContaBancaria() {
        return saldoContaBancaria;
    }

    public void setSaldoContaBancaria(double saldoContaBancaria) {
        this.saldoContaBancaria = saldoContaBancaria;
    }
}

