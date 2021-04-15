public interface EstadoPrenda {
    int precioPrendaTotal(int precio);
}

class Nuevo implements EstadoPrenda{
    public int precioPrendaTotal(int precio){
        return precio;
    }
}

class Promocion implements EstadoPrenda{
    int valorFijo;

    public int precioPrendaTotal(int precio){
        return precio - valorFijo;
    }
}

class Liquidacion implements EstadoPrenda{
    public int precioPrendaTotal(int precio){
        return precio/2;
    }
}
