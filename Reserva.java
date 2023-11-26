import java.util.*;

public class Reserva {
    private String idReserva;
    private Date dataReserva;
    private Date dataRetirada;
    private Date dataDevolucao;
    private Cliente cliente;
    private Veiculo veiculo;
    private boolean statusReserva;

    public Reserva() {
        // Constructor logic here
    }

    // Getters and Setters
    public String getIdReserva() { 
        return idReserva; 
    }
    public void setIdReserva(String idReserva) { 
        this.idReserva = idReserva; 
    }

    public Date getDataReserva() { 
        return dataReserva; 
    }
    public void setDataReserva(Date dataReserva) { 
        this.dataReserva = dataReserva; 
    }

    public Date getDataRetirada() { 
        return dataRetirada; 
    }
    public void setDataRetirada(Date dataRetirada) { 
        this.dataRetirada = dataRetirada; 
    }

    public Date getDataDevolucao() { 
        return dataDevolucao; 
    }
    public void setDataDevolucao(Date dataDevolucao) { 
        this.dataDevolucao = dataDevolucao; 
    }

    public Cliente getCliente() { 
        return cliente; 
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente; 
    }

    public Veiculo getVeiculo() { 
        return veiculo; 
    }
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo; 
    }

    public boolean isStatusReserva() { 
        return statusReserva;
    }
    public void setStatusReserva(boolean statusReserva) { 
        this.statusReserva = statusReserva; 
    }

    // Additional methods
    public void criarReserva() {
        // Method logic here
    }

    public void cancelarReserva() {
        // Method logic here
    }

    public static Reserva create(Date dataRetirada, Date dataDevolucao) {
        // Static factory method logic
        return new Reserva();
    }
}
