public interface Prenda{
    int precioDeVenta();
}

class Pantalon implements Prenda{
    Estado estadoActual;
    int precioActual;

    Pantalon(int precio,Estado estado){
        this.precioActual = precio;
        this.estadoActual = estado;
    }

    public int precioDeVenta() {
        return estadoActual.precioFinal(precioActual);
    }

}

class Camisa implements Prenda{
    Estado estadoActual;
    int precioActual;

    Camisa(int precio,Estado estado){
        this.precioActual = precio;
        this.estadoActual = estado;
    }

    public int precioDeVenta() {
        return estadoActual.precioFinal(precioActual);
    }

}

class Saco implements Prenda{
    Estado estadoActual;
    int precioActual;

    Saco(int precio,Estado estado){
        this.precioActual = precio;
        this.estadoActual = estado;
    }

    public int precioDeVenta() {
        return estadoActual.precioFinal(precioActual);
    }

}
