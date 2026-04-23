public enum StatusPedido{
    PROCESSANDO(1),
    ENVIADO(6),
    ENTREGUE(0);

    int status;

    StatusPedido(int status){
        this.status = status;
    }

    StatusPedido incrementar(){
        return values()[(ordinal() + 1) % values().length];
    }
    int verificarPrazo(){
        int valor = 0;
        for(int i = ordinal(); i < values().length; i++){
            System.out.println("Valor: " + this.status);
            valor += values()[i].status;
        }
        return valor;
    }
}
