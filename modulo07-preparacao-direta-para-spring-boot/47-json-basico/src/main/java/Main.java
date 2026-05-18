import com.google.gson.Gson;

public class Main {
    static void main(String[] args) {
        Usuario usr = new Usuario("João", "joaosilverio@email.com", 21, true);
        System.out.println(usr);
        String json = praJson(usr);
        Usuario usr2 = deJson(json);
        System.out.println(usr2);
    }
    public static String praJson(Usuario usr){
        return new Gson().toJson(usr);
    }
    public static Usuario deJson(String json){
        return new Gson().fromJson(json, Usuario.class);
    }
}