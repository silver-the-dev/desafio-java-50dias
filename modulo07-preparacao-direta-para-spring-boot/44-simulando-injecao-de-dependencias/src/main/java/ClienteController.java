public class ClienteController {
    EmailService email;

    public ClienteController(EmailService email){
        this.email = email;
    }

    public String enviarEmail(String mensagem){
        return email.enviarEmail(mensagem);
    }
}
