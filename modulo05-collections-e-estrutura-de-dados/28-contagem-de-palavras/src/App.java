import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        String textoExemplo = "A linguagem C oferece um controle preciso sobre a memória. Em jogos clássicos, a grade do jogo é frequentemente representada por uma matriz bidimensional. O uso cuidadoso de ponteiros permite que o programa atualize a tela rapidamente. Cada bloco move-se na matriz linha por linha. Quando uma linha da matriz é preenchida por blocos, essa linha é limpa, e os blocos acima descem. O gerenciamento de memória é crucial; um ponteiro não inicializado pode causar o travamento do jogo inteiro. Portanto, a alocação de memória e a liberação de memória devem ser feitas com muita atenção na linguagem C. A linguagem C não perdoa erros de memória.";
        textoExemplo = textoExemplo.toLowerCase();
        textoExemplo = textoExemplo.replace(",", " ");
        textoExemplo = textoExemplo.replace(".", " ");
        String[] array = (textoExemplo.split(" "));

        Map<String, Integer> contador = new HashMap<>();
        for (String str : array) {
            if (str.isBlank())
                continue;
            if (!str.equals(" ") && contador.containsKey(str)) {
                contador.put(str, contador.get(str) + 1);
                continue;
            } else {
                contador.put(str, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : contador.entrySet()) {
            if (entry.getValue() >= 3) {
                System.out.println("Chave: " + entry.getKey() + " | Valor: " + entry.getValue());
            }
        }
    }
}
