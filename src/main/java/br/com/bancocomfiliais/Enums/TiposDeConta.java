package br.com.bancocomfiliais.Enums;

public enum TiposDeConta {
    C("Corrente"),
    D("Dep�sito"),
    P("Poupan�a");

    private String label;

    TiposDeConta(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
