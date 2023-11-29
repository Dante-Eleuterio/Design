import java.time.LocalDate;
import java.util.*;

public class Cliente extends Usuario {
    private ContratoAluguelVeiculo contrato;

    public Cliente(String nome, String login, String email, String senha) {
        super(nome,login,email,senha,1); // Chamada ao construtor de Usuario
    }

    public void solicitaAluguel(Veiculo v, LocalDate dataInicio, LocalDate dataFim){
        this.contrato = new ContratoAluguelVeiculo(v, dataInicio, dataFim);
    }
    public void efetuarPgmto(String numCartao,LocalDate dataValidade, int cvv){
        
    }

    public ContratoAluguelVeiculo consultaContrato(){
        return contrato;
    }

}


