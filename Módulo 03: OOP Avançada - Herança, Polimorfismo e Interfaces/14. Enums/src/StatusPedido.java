public enum StatusPedido{
    PROCESSANDO(1),
    ENVIADO(2),
    ENTREGUE(3);

    int status;

    StatusPedido(int status){
        this.status = status;
    }

    StatusPedido incrementar(){
        return values()[(ordinal() + 1) % values().length];
    }
}
