package calculadora;

public class adicao {

    public static double num_antigo;

    public static double salvarNumAntigo(double num){
        num_antigo = num;
        return num_antigo;
    }

    public static double somar(double num_antigo, double num_atual) {
        double resultado;
        
        resultado = num_antigo + num_atual;
        return resultado;
    }

}
