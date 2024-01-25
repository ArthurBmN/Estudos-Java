public class caixaEletronico {
    public static void main(String[] args) {

        double saldo = 25.0;
        double valorSolicitado = 10.0;
 
        if(valorSolicitado < saldo){
         saldo = saldo - valorSolicitado;
         System.out.println("Saldo Disponível!");
         System.out.println(saldo);
        }else{
        System.out.println("Saldo Insuficiente!");
        System.out.println(saldo);
    }
}
}
