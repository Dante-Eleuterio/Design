import java.time.LocalDate;
import java.util.*;

public class Cliente extends Usuario {
    private ContratoAluguelVeiculo contrato;

    public Cliente(String nome, String login, String email, String senha) {
        super(nome,login,email,senha,1); // Chamada ao construtor de Usuario
        this.contrato=null;
    }

    public void solicitaAluguel(Veiculo v, LocalDate dataInicio, LocalDate dataFim){
        this.contrato = new ContratoAluguelVeiculo(v, dataInicio, dataFim);
    }
    public void efetuarPgmto(String numCartao,String dataValidade, String cvv){
        contrato.efetuarPgmto(numCartao, dataValidade, cvv);
        contrato=null;
    }

    public ContratoAluguelVeiculo consultaContrato(){
        if(this.contrato!=null)
            return this.contrato;
        else
            return null;
    }

}


