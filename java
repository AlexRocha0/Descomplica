public class SomaMedia {
    public static void main(String[] args) {
        // Declaração de variáveis
        String nomeAlg;
        int resultadoSoma;
        double resultadoMedia;
        double resultadoMedia2;

        // Atribuição de valores
        nomeAlg = "Soma e Média";
        resultadoSoma = 5 + 5 + 5;
        resultadoMedia = (5 + 5 + 5) / 3.0;
        resultadoMedia2 = resultadoSoma / 3.0;

        // Exibição dos resultados
        System.out.println("Soma e média dos números 5, 5 e 5");
        System.out.println("Nome do algoritmo: " + nomeAlg);
        System.out.println("Resultado da Soma: " + resultadoSoma);
        System.out.println("Resultado da Média: " + resultadoMedia);
        System.out.print("Resultado da Média usando a variável resultadoSoma: ");
        System.out.println(resultadoMedia2);
    }
}
