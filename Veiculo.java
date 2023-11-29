public class Veiculo {
    private String placa;
    private int tipo;
    private String id;
    private String cor;
    private boolean disponivel;
    private String modelo;
    private float precoVeiculo;
    private String anoFabricacao;

    public Veiculo(String placa,String id, int tipo, String cor, String modelo, float precoVeiculo, String anoFabricacao) {
        this.placa = placa;
        this.tipo = tipo;
        this.id =id;
        this.cor = cor;
        this.disponivel = true;
        this.modelo = modelo;
        this.precoVeiculo = precoVeiculo;
        this.anoFabricacao = anoFabricacao;
    }

    public void atualizaStatusVeiculo(){
        if(this.disponivel==true)
            disponivel=false;
        else
            disponivel=true;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getTipo() {
        return this.tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isDisponivel() {
        return this.disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
    public boolean getDisponivel() {
        return this.disponivel;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPrecoVeiculo() {
        return this.precoVeiculo;
    }

    public void setPrecoVeiculo(float precoVeiculo) {
        this.precoVeiculo = precoVeiculo;
    }

    public String getAnoFabricacao() {
        return this.anoFabricacao;
    }

    public void setAnoFabricacao(String anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }


}
