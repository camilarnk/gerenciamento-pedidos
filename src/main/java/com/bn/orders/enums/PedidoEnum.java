package com.bn.orders.enums;

public enum PedidoEnum {

    PENDENTE(0),
    CONFIRMADO(1),
    ENTREGUE(2);

    private int codigo;

    PedidoEnum(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }
}