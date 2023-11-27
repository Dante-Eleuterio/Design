public class Usuario {
    protected String nome;
    protected String login;
    protected String email;
    protected String senha;
    protected int tipo;

   

    // Construtor
    public Usuario(String nome, String login, String email, String senha,int tipo) {
        this.nome=nome;
        this.login=login;
        this.email=email;
        this.senha=senha;
        this.tipo=tipo;

    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean validaSenha(String senha){
        return true;
    }

    public int getTipo() {
        return this.tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

  




}
