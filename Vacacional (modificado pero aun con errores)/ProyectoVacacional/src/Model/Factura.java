package Model;

public abstract class Factura {

    protected int horasConsumo;
    protected double valorKWH;
    protected int estrato;

    public Factura(int horasConsumo, double valorKWH, int estrato) {
        this.horasConsumo = horasConsumo;
        this.valorKWH = valorKWH;
        this.estrato = estrato;
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

    public int getEstrato() {
        return estrato;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }

    @Override
    public String toString() {
        return "Factura{" + "horasConsumo=" + horasConsumo + ", valorKWH=" + valorKWH + ", estrato=" + estrato + '}';
    }
    
}
