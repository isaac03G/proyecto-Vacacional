package Main;
import Model.Sumador;
import Model.Restador;
import Model.Multiplicador;
import Model.Divicionador;



public interface View {
    public static void main(String[] args){
        
        Sumador mensajeSuma = new Sumador();
        mensajeSuma.MostrarTipoOperacion();
        mensajeSuma.PedirDatos();
        mensajeSuma.OperacionSuma();
        mensajeSuma.MostrarRespuesta();
        
        Restador mensajeResta = new Restador();
        mensajeResta.MostrarTipoOperacion();
        mensajeResta.PedirDatos();
        mensajeResta.OperacionResta();
        mensajeResta.MostrarRespuesta();
        
        
        Multiplicador mensajeMulti = new Multiplicador();
        mensajeMulti.MostrarTipoOperacion();
        mensajeMulti.PedirDatos();
        mensajeMulti.OperacionMultip();
        mensajeMulti.MostrarRespuesta();
        
        
        Divicionador mensajeDivicion = new Divicionador();
        mensajeDivicion.MostrarTipoOperacion();
        mensajeDivicion.PedirDatos();
        mensajeDivicion.OperacionDivicion();
        mensajeDivicion.MostrarRespuesta();
        
        
    }
}
