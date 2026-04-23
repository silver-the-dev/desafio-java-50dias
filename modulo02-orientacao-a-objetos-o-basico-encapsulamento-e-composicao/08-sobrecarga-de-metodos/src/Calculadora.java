public class Calculadora {
    public static int somar(int... numeros){
        int resultado = 0;
        for(int num : numeros){
            resultado += num;
        }
        return resultado;
    }
    public static double somar(double... numeros){
        double resultado = 0;
        for(double num : numeros){
            resultado += num;
        }
        return resultado;
    }
}
