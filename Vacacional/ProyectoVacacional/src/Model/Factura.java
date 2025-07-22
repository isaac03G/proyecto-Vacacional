package Model;

public abstract class Factura {
    
    protected int horasConsumo;
    protected double valorKWH;

    public Factura(int horasConsumo, double valorKWH) {
        this.horasConsumo = horasConsumo;
        this.valorKWH = valorKWH;
    }

    public int getHorasConsumo() {
        return horasConsumo;
    }

    public void setHorasConsumo(int horasConsumo) {
        this.horasConsumo = horasConsumo;
    }

    public double getValorKWH() {
        return valorKWH;
    }

    public void setValorKWH(double valorKWH) {
        this.valorKWH = valorKWH;
    }

    @Override
    public String toString() {
        return "Factura{" + "horasConsumo=" + horasConsumo + ", valorKWH=" + valorKWH + '}';
    }
    
    
}
