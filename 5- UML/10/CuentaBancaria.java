public class CuentaBancaria {

    private String cbu;
    private double saldo;
    private ClaveSeguridad claveSeguridad;
    private Titular titular;
    
    public CuentaBancaria() {}
    
    public CuentaBancaria(String cbu, double saldo) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveSeguridad = new ClaveSeguridad();
    }
    
    public String getCbu() {
        return cbu;
    }
    
    public void setCbu(String cbu) {
        this.cbu = cbu;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public ClaveSeguridad getClaveSeguridad() {
        return claveSeguridad;
    }
    
    public Titular getTitular() {
        return titular;
    }
    
    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getCuentaBancaria() != this) {
            titular.setCuentaBancaria(this);
        }
    }
    
    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "cbu='" + cbu + '\'' +
                ", saldo=" + saldo +
                ", claveSeguridad=" + claveSeguridad +
                ", titular=" + (titular != null ? titular.getNombre() : "null") +
                '}';
    }
    
}