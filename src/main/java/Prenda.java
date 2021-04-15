public interface Prenda {
    int precioVenta();
}

class Saco implements Prenda {
    int precioPrenda;
    EstadoPrenda estadoPrenda;

    Saco(int precioPrenda, EstadoPrenda estadoPrenda){
        this.precioPrenda = precioPrenda;
        this.estadoPrenda = estadoPrenda;
    }

    public int precioVenta(){
        return estadoPrenda.precioPrendaTotal(precioPrenda);
    }
}

class Pantalon implements Prenda{
    int precioPrenda;
    EstadoPrenda estadoPrenda;

    Pantalon(int precioPrenda, EstadoPrenda estadoPrenda){
        this.precioPrenda = precioPrenda;
        this.estadoPrenda = estadoPrenda;
    }

    public int precioVenta(){
        return estadoPrenda.precioPrendaTotal(precioPrenda);
    }
}

class Camisa implements Prenda{
    int precioPrenda;
    EstadoPrenda estadoPrenda;

    Camisa(int precioPrenda, EstadoPrenda estadoPrenda){
        this.precioPrenda = precioPrenda;
        this.estadoPrenda = estadoPrenda;
    }

    public int precioVenta(){
        return estadoPrenda.precioPrendaTotal(precioPrenda);
    }
