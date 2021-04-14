import java.util.ArrayList;



class Venta{
    ArrayList<Prenda> prendasVendidas = new ArrayList<>();
    TipoDeVenta medioDePago;
    int fechaVenta;

    Venta(ArrayList<Prenda> prendas, TipoDeVenta medio,int fecha){
        this.prendasVendidas= prendas;
        this.medioDePago = medio;
        this.fechaVenta = fecha;
    }
    int cantidadPrendas() {
        return prendasVendidas.size();
    }
    double precioFinal() {
        return prendasVendidas.stream().mapToDouble(prenda -> medioDePago.gananciaTotal(prenda.precioDeVenta())).sum();
    }
    void agregarProductoParaComprar(Prenda prendaComprada){
        prendasVendidas.add(prendaComprada);
    }

}




interface TipoDeVenta{
    double gananciaTotal(int precio);
}

class Efectivo implements TipoDeVenta{
    public double gananciaTotal(int precio) {
        return precio;
    }
}

class Tarjeta implements TipoDeVenta{
    int cuotas;
    int coeficienteFijo;

    Tarjeta(int cantCuotas, int coeficiente){
        this.cuotas = cantCuotas;
        this.coeficienteFijo = coeficiente;
    }
    public double gananciaTotal(int precio) {
        return precio + (cuotas*coeficienteFijo+ 0.01*precio);
    }
}


interface Prenda{
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


interface Estado{
    int precioFinal(int precio);
}


class Promocion implements Estado{
    int valorFijo;

    Promocion(int valor){
        this.valorFijo = valor;
    }
    public int precioFinal(int precio){
        return precio-valorFijo;
    }
}

class Nueva implements Estado{

    public int precioFinal(int precio){
        return precio;
    }
}

class Liquidacion implements Estado{

    public int precioFinal(int precio){
        return precio/2;
    }
}