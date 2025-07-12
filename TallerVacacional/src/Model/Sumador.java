package Model;

public class Sumador extends OperacionesPrincipales{
    public void MostrarTipoOperacion(){
        System.out.println("===ESTA OPERACION ES SUMA===");
    }
    
    public void OperacionSuma (){
        resultado = valor1 + valor2;
    }
}
