public interface TipoDeVenta{
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



