import java.util.*;

public class Pagamento {
    private String idPagamento;
    private Date dataPagamento;
    private float valor;
    private boolean statusPagamento;
    private String formaPagamento;

    public Pagamento() {
        // Constructor logic here
    }

    // Getters and Setters
    public String getIdPagamento() {
        return idPagamento;
    }
    public void setIdPagamento(String idPagamento) { 
        this.idPagamento = idPagamento; 
    }

    public Date getDataPagamento() { 
        return dataPagamento; 
    }
    public void setDataPagamento(Date dataPagamento) {
         this.dataPagamento = dataPagamento; 
        }

    public float getValor() { 
        return valor; 
    }
        
    public void setValor(float valor) {
        this.valor = valor;
    }

    public boolean isStatusPagamento(){
        return statusPagamento; 
    }
    public void setStatusPagamento(boolean statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public String getFormaPagamento() { 
        return formaPagamento; 
    }
    
    public void setFormaPagamento(String formaPagamento) { 
        this.formaPagamento = formaPagamento; 
    }

    // Additional methods
    public void realizarPagamento() {
        // Method logic here
    }

    public static Pagamento create(float valor, String formaPagamento) {
        // Static factory method logic
        return new Pagamento();
    }
}
