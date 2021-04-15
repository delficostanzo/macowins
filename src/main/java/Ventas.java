import java.util.Set;
import java.util.HashSet;

public class Ventas {
    Set<Prenda> prendasVendidas = new HashSet<Prenda>();
    TipoDeVenta tipoDeVenta;
    int fechaVenta;


    Ventas(Set<Prenda> prendasVendidas, TipoDeVenta tipoDeVenta, int fechaVenta){
        this.prendasVendidas = prendasVendidas;
        this.tipoDeVenta = tipoDeVenta;
        this.fechaVenta = fechaVenta;
    }

    int cantidadPrendas(){
        return prendasVendidas.size();
    }

}
