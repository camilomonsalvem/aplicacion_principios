
import java.util.Scanner;
public class Principal{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Procesos p1 = new Procesos();
        
        System.out.println("Ingrese su saldo:");
        double num = entrada.nextDouble();
        p1.setSaldo(num);
        
        System.out.println("Ingrese su Meta:");
        num = entrada.nextDouble();
        p1.setMeta(num);
         
        System.out.println("Ingrese sus Ahorros:");
        num = entrada.nextDouble();
        p1.setAhorros(num);
        
        System.out.println("Ingrese su Deudas:");
        num = entrada.nextDouble();
        p1.setDeudas(num);
        
        p1.toString(p1);
    }
    
}