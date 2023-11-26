import java.util.*;

public class Cliente {
    private String nome;
    private String cpf;
    private String endereco;
    private String email;
    private String telefone;
    private List<ContratoAluguelVeiculo> contratosAluguel;

    public Cliente() {
        // Constructor logic here
    }

    // Getters and Setters
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

    public String getEndereco() {
         return endereco; 
    }
    public void setEndereco(String endereco) { 
        this.endereco = endereco; 
    }

    public String getEmail() { 
        return email; 
    }
    public void setEmail(String email) { 
        this.email = email; 
    }

    public String getTelefone() { 
        return telefone; 
    }
    
    public void setTelefone(String telefone) { 
        this.telefone = telefone; 
    }

    public List<ContratoAluguelVeiculo> getContratosAluguel() { 
        return contratosAluguel; 
    }
    
    public void setContratosAluguel(List<ContratoAluguelVeiculo> contratosAluguel) { 
        this.contratosAluguel = contratosAluguel; 
    }

    // Additional methods
    public void cadastrarCliente() {
        // Method logic here
    }

    public void atualizarDados() {
        // Method logic here
    }

    public void visualizarContratos() {
        // Method logic here
    }

    public static Cliente create(String nome, String cpf) {
        // Static factory method logic
        return new Cliente();
    }
}
