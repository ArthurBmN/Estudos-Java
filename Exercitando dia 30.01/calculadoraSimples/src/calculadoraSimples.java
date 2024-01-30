public class calculadoraSimples {
    public static void main(String[] args) {
        int numeroA = 10;
        int numeroB = 10;
        String operacao = "divisão";
        if (operacao == "Adição")
        System.out.println(numeroA + numeroB);
        else if (operacao == "Subtração")
        System.out.println(numeroA - numeroB);
        else if (operacao == "Multiplicação")
        System.out.println(numeroA * numeroB);
        else if (operacao == "Divisão")
        System.out.println(numeroA / numeroB);
        else
        System.out.println("Escolha uma das operações básicas!(Adição,Subtração,Multiplicação ou Divisão )");
    }
}
