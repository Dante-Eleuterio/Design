import java.util.*;

public class Cliente extends Usuario {
    private ContratoAluguelVeiculo contrato;

    public Cliente(String nome, String login, String email, String senha) {
        super(nome,login,email,senha,1); // Chamada ao construtor de Usuario
    }

    public void solicitaAluguel(Veiculo v, Date dataInicio, Date dataFim){
        
    }
    public void efetuarPgmto(String numCartao,Date dataValidade, int cvv){
        
    }

    public void consultaContrato(){

    }

}


