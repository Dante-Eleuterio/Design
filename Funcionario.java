public class Funcionario extends Usuario {
    public Funcionario(String nome, String login, String email, String senha) {
        super(nome,login,email,senha,0); // Chamada ao construtor de Usuario
    }
}
