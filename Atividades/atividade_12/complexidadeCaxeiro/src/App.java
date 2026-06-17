import java.math.BigInteger;
import java.math.BigDecimal;
import java.math.RoundingMode;


public class App { // Mudou para bater com o nome do seu arquivo App.java

    public static void main(String[] args) {
        // Vetor com os casos de 'n' solicitados no enunciado (n = 5, 10, 15, 20, 25)
        int[] casosCidades = {5, 10, 15, 20, 25};
        // Capacidade do computador: 1 milhão (10^6) de rotas por segundo
        BigInteger rotasPorSegundo = new BigInteger("1000000");

        System.out.println("========================================================================================");
        System.out.printf("%-10s | %-30s | %-35s%n", "n Cidades", "Número de Rotas ((n-1)!)", "Tempo Estimado de Cálculo");
        System.out.println("========================================================================================");

        for (int n : casosCidades) {
            // A fórmula do número de rotas com ponto inicial fixo é R(n) = (n - 1)!
            int elementoFatorial = n - 1;
            BigInteger numRotas = calcularFatorial(elementoFatorial);
            
            // Traduz o tempo para uma string legível (segundos, minutos, horas, anos...)
            String tempoFormatado = formatarTempo(numRotas, rotasPorSegundo);

            System.out.printf("%-10d | %-30s | %-35s%n", n, numRotas.toString(), tempoFormatado);
        }
        System.out.println("========================================================================================");
    }

    /**
     * Calcula o fatorial de um número utilizando BigInteger para evitar overflow.
     */
    private static BigInteger calcularFatorial(int numero) {
        BigInteger resultado = BigInteger.ONE;
        for (int i = 2; i <= numero; i++) {
            resultado = resultado.multiply(BigInteger.valueOf(i));
        }
        return resultado;
    }

    /**
     * Calcula o tempo total em segundos e converte para a unidade mais adequada e legível.
     */
    private static String formatarTempo(BigInteger numRotas, BigInteger rotasPorSegundo) {
        BigDecimal rotasDec = new BigDecimal(numRotas);
        BigDecimal rpsDec = new BigDecimal(rotasPorSegundo);
        BigDecimal segundosTotais = rotasDec.divide(rpsDec, 2, RoundingMode.HALF_UP);

        if (segundosTotais.compareTo(new BigDecimal("0.01")) < 0) {
            return "Insignificante (< 0.01 seg)";
        }

        BigDecimal umMinuto = new BigDecimal("60");
        BigDecimal umaHora = new BigDecimal("3600");
        BigDecimal umDia = new BigDecimal("86400");
        BigDecimal umAno = new BigDecimal("31536000"); // 365 dias

        if (segundosTotais.compareTo(umMinuto) < 0) {
            return segundosTotais.setScale(2, RoundingMode.HALF_UP) + " segundos";
        }
        else if (segundosTotais.compareTo(umaHora) < 0) {
            BigDecimal minutos = segundosTotais.divide(umMinuto, 2, RoundingMode.HALF_UP);
            return minutos + " minutos";
        }
        else if (segundosTotais.compareTo(umDia) < 0) {
            BigDecimal horas = segundosTotais.divide(umaHora, 2, RoundingMode.HALF_UP);
            return horas + " horas";
        }
        else if (segundosTotais.compareTo(umAno) < 0) {
            BigDecimal dias = segundosTotais.divide(umDia, 2, RoundingMode.HALF_UP);
            return dias + " dias";
        }
        else {
            BigDecimal anos = segundosTotais.divide(umAno, 2, RoundingMode.HALF_UP);
            if (anos.compareTo(new BigDecimal("1000000")) > 0) {
                return String.format("%.2e anos", anos);
            }
            return anos.setScale(0, RoundingMode.HALF_UP) + " anos";
        }
    }
}