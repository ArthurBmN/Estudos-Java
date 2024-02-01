public class Teste2 {
public static void main(String[] args) throws Exception {
    int numeroA = 1000;
    int numeroB = 600;
    int numeroC = 10;    
    if (numeroA >= numeroB && numeroA >= numeroC) {
        System.out.println("O númeroA é o maior!");
    } else if (numeroB >= numeroA && numeroB >= numeroC) {
        System.out.println("O númeroB é o maior!");
    } else {
        System.out.println("O númeroC é o maior!");
    }
}}
