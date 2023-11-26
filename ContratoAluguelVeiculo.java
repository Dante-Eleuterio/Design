import java.util.*;
public class ContratoAluguelVeiculo {
    private String idAluguel;
    private Date dataInicio;
    private Date dataFinal;
    private float precoAluguel;
    private boolean pago;

    public ContratoAluguelVeiculo() {
        // Constructor logic here
    }

    // Getters and Setters
    public String getIdAluguel() { return idAluguel; }
    public void setIdAluguel(String idAluguel) { this.idAluguel = idAluguel; }

    public Date getDataInicio() { return dataInicio; }
    public void setDataInicio(Date dataInicio) { this.dataInicio = dataInicio; }

    public Date getDataFinal() { return dataFinal; }
    public void setDataFinal(Date dataFinal) { this.dataFinal = dataFinal; }

    public float getPrecoAluguel() { return precoAluguel; }
    public void setPrecoAluguel(float precoAluguel) { this.precoAluguel = precoAluguel; }

    public boolean isPago() { return pago; }
    public void setPago(boolean pago) { this.pago = pago; }

    // Additional methods
    public void addPrecoSeguro() {
        // Method logic here
    }

    public float calculaMulta(Date dataHoje) {
        // Method logic here
        return 0.0f; // Placeholder return
    }

    public void efetuarPgmto(String numCartao, Date dataValidade, String cvv) {
        // Method logic here
    }

    public void incluirSeguro() {
        // Method logic here
    }

    public static ContratoAluguelVeiculo create(Date dataInicio, Date dataFim) {
        // Static factory method logic
        return new ContratoAluguelVeiculo();
    }
}
