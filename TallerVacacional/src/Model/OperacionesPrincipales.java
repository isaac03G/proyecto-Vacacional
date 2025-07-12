package Model;
import java.util.Scanner;


public abstract class  OperacionesPrincipales {
    Scanner data = new Scanner(System.in);
    
    protected int valor1;
    protected int valor2;
    protected int resultado;
    
    public void PedirDatos (){
        
        System.out.println("=========================");
        System.out.print("ingrese el primer valor:");
        valor1 = data.nextInt();
        
        
        System.out.println("=========================");
        System.out.print("ingrese el segundo valor :");
        valor2 = data.nextInt();
        
    }
    
    public void MostrarRespuesta (){
        System.out.println("=========================");
        System.out.println("la respuesta es: ");
        System.out.println(resultado);
        System.out.println("=========================");
    }

}
