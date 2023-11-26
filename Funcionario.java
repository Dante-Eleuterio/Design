import java.util.*;
public class Funcionario {
    private String nome;
    private String cpf;
    private String funcao;

    public Funcionario() {
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

    public String getFuncao() { 
        return funcao; 
    }
    
    public void setFuncao(String funcao) { 
        this.funcao = funcao; 
    }

    // Additional methods
    public void cadastrarFuncionario() {
        // Method logic here
    }

    public void atualizarDados() {
        // Method logic here
    }

    public static Funcionario create(String nome, String cpf) {
        // Static factory method logic
        return new Funcionario();
    }
}
