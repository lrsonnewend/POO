package engine;

public class Saida {
    private double despesa,pagemento;
    private String dataPagamento, dataDespesa;

    public double getDespesa() {
        return despesa;
    }

    public void setDespesa(double despesa) {
        this.despesa = despesa;
    }

    public double getPagemento() {
        return pagemento;
    }

    public void setPagemento(double pagemento) {
        this.pagemento = pagemento;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public String getDataDespesa() {
        return dataDespesa;
    }

    public void setDataDespesa(String dataDespesa) {
        this.dataDespesa = dataDespesa;
    }

}