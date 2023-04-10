package exercises.util;

public class ConversaoAtual {
    public static double IOF = 0.06;

    public static double dollarToReal(double montante, double precoDolar){
        return montante * precoDolar * (1.0 + IOF);
    }
}
