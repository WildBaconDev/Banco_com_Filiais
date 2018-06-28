package br.com.bancocomfiliais.Enums;

public enum TiposDeCliente {

    A("Administrador"),
    O("Organizador");

    private String label;

    TiposDeCliente(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
