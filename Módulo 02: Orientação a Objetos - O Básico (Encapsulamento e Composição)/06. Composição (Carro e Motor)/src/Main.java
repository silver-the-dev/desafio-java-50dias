public class Main {
    public static void main(String[] args){
        Carro car = new Carro("Chevrolet", "Camaro", 1996, new Motor(285, "V8"));
        System.out.println(car.getMotor().getCavalos());
    }
}
