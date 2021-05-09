
public class Procesos{
    private double saldo;
    private double ahorros;
    private double meta;
    private double deudas;
    private double gasto;
    
    public void retirar(double cantidad) {
        saldo = saldo - cantidad;
    } 

    public double getSaldo(){
        return this.saldo;
    }
    
    public double getAhorros(){
        return this.saldo;
    }
    
    public double getMeta(){
        return this.saldo;
    }
    
    public double getDeudas(){
        return this.saldo;
    }
    
    public void setSaldo(double s){
        this.saldo = this.saldo + s;
    }
    
    public void setAhorros(double a){
        this.ahorros = this.ahorros+a;
    }
    
    public void setMeta(double m){
        this.meta = this.meta + m;
    }
    
    public void setDeudas(double d){
        this.deudas = this.deudas + d;
    }
    
    public void toString(Procesos p){
        System.out.println("Su saldo es de: " + p.getSaldo() + "$");
        System.out.println("Sus ahorros son: " + p.getAhorros() + "$");
        System.out.println("Su meta a cumplir es de: " + p.getMeta() + "$");
    }
}










