import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> lista = new ArrayList<>();
        lista.add("Tarefa 1");
        lista.add("Tarefa 2");
        lista.add("Tarefa 3");
        lista.add("Tarefa 4");
        lista.add("Tarefa 5");

        for(String tarefa : lista){
            if(tarefa.equals("Tarefa 3")){
                System.out.println("Tarefa 3 existe");
                break;
            }
        }
        lista.remove(2);
        lista.forEach(System.out::println);
        for(String tarefa : lista){
            if(tarefa.equals("Tarefa 3")){
                System.out.println("Tarefa 3 existe");
                break;
            }
        }
    }
}
