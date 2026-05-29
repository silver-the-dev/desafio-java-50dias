public class Alimento extends Produtos{
    public final String TIPO = "Alimento";
    public String descricao;
    public int quantidade;

    public Alimento(String desc, int quantidade){
        super(desc, quantidade);
    }
}
