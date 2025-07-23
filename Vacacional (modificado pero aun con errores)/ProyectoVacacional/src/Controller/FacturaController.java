package Controller;

import Model.Factura;

public class FacturaController extends Factura {

    public FacturaController(int horasConsumo, double valorKWH, int estrato) {
        super(horasConsumo, valorKWH, estrato);
    }

    public void procesoFactura(int estrato) {

        int horas = getHorasConsumo();
        double valorTotal;

        if (horas <= 0) {
        setValorKWH(0.0);
        return; 
    }

    switch (estrato) {
        case 1:
            if (horas <= 173) {
                valorTotal = horas * 447.41;
            } else {
                valorTotal = horas * 1118.53;
            }
            break;
        case 2:
            if (horas <= 173) {
                valorTotal = horas * 559.27;
            } else {
                valorTotal = horas * 1118.53;
            }
            break;
        case 3:
            if (horas <= 173) {
                valorTotal = horas * 950.75;
            } else {
                valorTotal = horas * 1118.53;
            }
            break;
        case 4:
            valorTotal = horas * 1118.53;
            break;
        case 5:
        case 6:
            valorTotal = horas * 1342.25;
            break;
        default:
            valorTotal = 0.0;  // estrato inválido
            break;
    }

    setValorKWH(valorTotal);
    }

}
