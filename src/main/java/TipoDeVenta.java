public interface TipoDeVenta {
    int gananciaVenta(int precio);
}

class Efectivo implements TipoDeVenta{
    public int gananciaVenta(int precio){
        return precio;
    }
}

class Tarjeta implements TipoDeVenta{
    int cantidadCuotas;
    int coeficienteFijo;

    Tarjeta(int cantidadCuotas, int coeficienteFijo){
        this.cantidadCuotas = cantidadCuotas;
        this.coeficienteFijo = coeficienteFijo;
    }

    public int gananciaVentas(int precio){
        return precio + (cantidadCuotas * coeficienteFijo + precio * 0.1);
    }
}
