import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ContratoAluguelVeiculo {
    private String idAluguel;
    private LocalDate dataInicio;
    private LocalDate dataFinal;
    private float precoAluguel;
    private boolean pago;
    private Veiculo veiculo;
    private Seguro s;

    // Construtor
    public ContratoAluguelVeiculo(Veiculo v,LocalDate dataInicio, LocalDate dataFinal) {
        this.veiculo=v;
        this.veiculo.setDisponivel(false);
        this.dataInicio=dataInicio;
        this.dataFinal=dataFinal;
        if(v.getTipo()==1)
            this.idAluguel=v.getPlaca();
        else
            this.idAluguel=v.getId();
        long dias = ChronoUnit.DAYS.between(dataInicio, dataFinal);
        this.precoAluguel=(v.getPrecoVeiculo()* dias);
    }

    public float calculaMulta(LocalDate dataHoje){
        long dias = ChronoUnit.DAYS.between(this.dataInicio, dataHoje);
        return 50 * dias;
    }

    public void efetuarPgmto(String numCartao, String dataValidade, String cvv){

    }

    public void incluirSeguro(){
        this.s = new Seguro();
        this.s.setIdSeguro(idAluguel);
    }

    // Getters e setters
    public String getIdAluguel() {
        return idAluguel;
    }

    public void setIdAluguel(String idAluguel) {
        this.idAluguel = idAluguel;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(LocalDate dataFinal) {
        this.dataFinal = dataFinal;
    }

    public float getPrecoAluguel() {
        return precoAluguel;
    }

    public void setPrecoAluguel(float precoAluguel) {
        this.precoAluguel = precoAluguel;
    }

    public boolean getPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

}
