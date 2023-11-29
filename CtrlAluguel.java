import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CtrlAluguel {
    Cliente cliente;
    Veiculo veiculo;

    public CtrlAluguel(Cliente c,Veiculo v ) {
        this.cliente=c;
        this.veiculo = v;
    }

    public void solicitaAluguel(Veiculo v, LocalDate dataInicio, LocalDate dataFim){
        cliente.solicitaAluguel(v, dataInicio, dataFim);

    }

    public void confirmaAluguel(){

    }

    public ContratoAluguelVeiculo efetuarPgmto(String numCartao,LocalDate dataValidade,int cvv){
        return cliente.consultaContrato();
    }
    
    public void contratarSeguro(){
        float preco = cliente.consultaContrato().getPrecoAluguel();
        LocalDate dataInicio =  cliente.consultaContrato().getDataInicio();
        LocalDate dataFim =  cliente.consultaContrato().getDataFinal();
        long dias = ChronoUnit.DAYS.between(dataInicio, dataFim);
        preco += 50 * dias;
        cliente.consultaContrato().setPrecoAluguel(preco);
    }
}
