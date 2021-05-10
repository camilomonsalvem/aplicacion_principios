
import java.util.Scanner;
public class Principal{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Procesos proceso1 = new Procesos();
 
        System.out.println("Ingrese su saldo actual:");
        double salario = entrada.nextDouble();
        proceso1.setSaldo(salario);
 
        System.out.println("Ingrese la meta de ahorros que desea alcanzar:");
        double meta = entrada.nextDouble();
        proceso1.setMeta(meta);
 
        System.out.println("Ingrese sus ahorros:");
        double ahorros = entrada.nextDouble();
        proceso1.setAhorros(ahorros);
 
        System.out.println("Ingrese sus deudas:");
        double deudas = entrada.nextDouble();
        proceso1.setDeudas(deudas);
 
        proceso1.toString(proceso1);
    }
 
}
