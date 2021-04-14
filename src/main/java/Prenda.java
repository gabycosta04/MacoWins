public interface Prenda{
    int precioDeVenta();
}

class Pantalon implements Prenda{
    EstadoPrenda estadoActual;
    int precioActual;

    Pantalon(int precio,EstadoPrenda estado){
        this.precioActual = precio;
        this.estadoActual = estado;
    }

    public int precioDeVenta() {
        return estadoActual.precioFinal(precioActual);
    }

}

class Camisa implements Prenda{
    EstadoPrenda estadoActual;
    int precioActual;

    Camisa(int precio,EstadoPrenda estado){
        this.precioActual = precio;
        this.estadoActual = estado;
    }

    public int precioDeVenta() {
        return estadoActual.precioFinal(precioActual);
    }

}

class Saco implements Prenda{
    EstadoPrenda estadoActual;
    int precioActual;

    Saco(int precio,EstadoPrenda estado){
        this.precioActual = precio;
        this.estadoActual = estado;
    }

    public int precioDeVenta() {
        return estadoActual.precioFinal(precioActual);
    }

}
