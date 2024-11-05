public class CalculoMedia {

    public static void main(String[] args) {
        MediaNotas();  // Chamando o método MediaNotas
    }

    public static void MediaNotas() {
        System.out.println(" *** MediaNotas *** ");
        
        int num1 = 10;
        int num2 = 8;
        int num3 = 6;
        int num4 = 7;
        
        int media = (num1 + num2 + num3 + num4) / 4;  // Ajustado para calcular a média corretamente
        System.out.println("Média: " + media);  // Imprime o resultado da média
    }
}
