import java.util.Vector;

public class CtrlCadastro {
    private Vector<Funcionario> funcionarios;
    private Vector<Cliente> clientes;
    private Vector<Veiculo> veiculos;
    private Funcionario funcionarioLogado;
    private Cliente clienteLogado;
    private boolean logado;

    public CtrlCadastro() {
        funcionarios = new Vector<>();
        clientes = new Vector<>();
        veiculos = new Vector<>();
        logado=false;
        this.cadastrarUsuario("Júlio César", "julio123", "jc@email.com", "123mudar",1);
        this.cadastrarVeiculo("-1", 2, "10", "preta", "kaloi", 700, "2010");
        this.cadastrarVeiculo("123abc", 1, "0", "Preto", "Toyota Yaris", 2000, "2018");
    }

    public void cadastrarUsuario(String nome, String login, String email, String senha,int tipo){
        if(tipo==0){
            Funcionario funcionario = new Funcionario(nome, login, email, senha);
            funcionarios.add(funcionario);
        }else{
            Cliente cliente = new Cliente(nome, login, email, senha);
            clientes.add(cliente);
        }
    }

    public void cadastrarVeiculo(String placa, int tipo, String id, String cor, String modelo, float precoAluguel, String anoFabricacao){
        Veiculo veiculo = new Veiculo(placa,id, tipo, cor, modelo, precoAluguel, anoFabricacao);
        veiculos.add(veiculo);
    }

    public void definirSenha(String senha,int tipo){
        if(tipo==1){
            clienteLogado.setSenha(senha);
        }else{
            funcionarioLogado.setSenha(senha);
        }
    }

    public boolean efetuarLogin(String login, String senha,int tipo){
        if(tipo==0){
            for(Funcionario f: funcionarios){
                if(f.getLogin().equals(login)){
                    if(f.getSenha().equals(senha)){
                        funcionarioLogado=f;
                        logado=true;
                        return logado;
                    }

                }
            }
        }else{
            for(Cliente c: clientes){
                if(c.getLogin().equals(login)){
                    if(c.getSenha().equals(senha)){
                        clienteLogado=c;
                        logado=true;
                        return logado;
                    }

                }
            }
        }
        return false;
    }

    public Vector<Funcionario> getFuncionarios() {
        return this.funcionarios;
    }

    public void setFuncionarios(Vector<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public Vector<Cliente> getClientes() {
        return this.clientes;
    }

    public void setClientes(Vector<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Vector<Veiculo> getVeiculos() {
        return this.veiculos;
    }

    public void setVeiculos(Vector<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public Funcionario getFuncionarioLogado() {
        return this.funcionarioLogado;
    }

    public Cliente getClienteLogado() {
        return this.clienteLogado;
    }

}
