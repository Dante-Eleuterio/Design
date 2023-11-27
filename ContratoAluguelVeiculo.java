import java.util.Date;

public class ContratoAluguelVeiculo {
    private String idAluguel;
    private Date dataInicio;
    private Date dataFinal;
    private float precoAluguel;
    private boolean pago;
    private Veiculo v;
    private Seguro s;

    // Construtor
    public ContratoAluguelVeiculo(Veiculo v,Date dataInicio, Date dataFinal) {
        // Inicialização dos atributos
    }

    public float calculaMulta(Date dataHoje){
        return 0.5f;
    }

    // Getters e setters
    public String getIdAluguel() {
        return idAluguel;
    }

    public void setIdAluguel(String idAluguel) {
        this.idAluguel = idAluguel;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
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
