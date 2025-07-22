package Controller;
import Model.Factura;
import java.util.Scanner;


public class FacturaController extends Factura{
    
    public FacturaController(int horasConsumo, double valorKWH) {
        super(horasConsumo, valorKWH);
    }
    
    public void procesoFactura(int estrato) {

        Scanner guarda = new Scanner(System.in);
        horasConsumo = guarda.nextInt();
        valorKWH = guarda.nextDouble();

        switch (estrato) {
            case 1 ->
                valorKWH = (horasConsumo <= 173) ? horasConsumo * 447.41 : horasConsumo * 1118.53;
            case 2 ->
                valorKWH = (horasConsumo <= 173) ? horasConsumo * 559.27 : horasConsumo * 1118.53;
            case 3 ->
                valorKWH = (horasConsumo <= 173) ? horasConsumo * 950.75 : horasConsumo * 1118.53;
            case 4 ->
                valorKWH = horasConsumo * 1118.53;
            case 5, 6 ->
                valorKWH = horasConsumo * 1342.25;
            default -> {
                return;
            }
        }
    }
}
