package br.com.bancocomfiliais.Enums;

public enum TiposDeConta {
    C("Corrente"),
    D("Depósito"),
    P("Poupança");

    private String label;

    TiposDeConta(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
