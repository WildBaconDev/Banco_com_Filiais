package br.com.bancocomfiliais.Enums;

public enum TiposDeTransacao {

    D("Deposito"),
    S("Saque");

    private String label;

    TiposDeTransacao(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
