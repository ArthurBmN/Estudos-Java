public class Teste3 {
    public static void main(String[] args) {
        int ladoA = 20;
        int ladoB = 10; 
        int ladoC = 50;
        if (ladoA == ladoB && ladoB == ladoC){
            System.out.println("O triangulo é equilétero");
        } else if (ladoA == ladoB || ladoA == ladoB || ladoB == ladoC) {
            System.out.println("O triângulo é isósceles.");
        } else {
            System.out.println("O triângulo é escaleno.");
        }
    }
}
