import java.util.*;

public class Veiculo {
    private String placa;
    private String tipo;
    private String id;
    private boolean disponivel;
    private String modelo;
    private float precoVeiculo;
    private int anoFabricacao;

    public Veiculo() {
        // Constructor logic here
    }

    // Getters and Setters
    public String getPlaca() { 
        return placa; 
    }

    public void setPlaca(String placa) { 
        this.placa = placa; 
    }

    public String getTipo() { 
        return tipo; 
    }

    public void setTipo(String tipo) { 
        this.tipo = tipo; 
    }

    public String getId() { 
        return id; 
    }

    public void setId(String id) { 
        this.id = id; 
    }

    public boolean isDisponivel() { 
        return disponivel; 
    }

    public void setDisponivel(boolean disponivel) { 
        this.disponivel = disponivel; 
    }

    public String getModelo() { 
        return modelo; 
    }
    
    public void setModelo(String modelo) { 
        this.modelo = modelo; 
    }

    public float getPrecoVeiculo() {
        return precoVeiculo; 
    }
    
    public void setPrecoVeiculo(float precoVeiculo) { 
        this.precoVeiculo = precoVeiculo; 
    }

    public int getAnoFabricacao() { 
        return anoFabricacao; 
    }
    
    public void setAnoFabricacao(int anoFabricacao) { 
        this.anoFabricacao = anoFabricacao; 
    }

    // Additional methods
    public void atualizaStatusVeiculo() {
        // Method logic here
    }

    public void addVeiculoLista(Veiculo veiculo) {
        // Method logic here
    }

    public static Veiculo create() {
        // Static factory method logic
        return new Veiculo();
    }
}
