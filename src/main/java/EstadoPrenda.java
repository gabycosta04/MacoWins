public interface EstadoPrenda{
    int precioFinal(int precio);
}


class Promocion implements EstadoPrenda{
    int valorFijo;

    Promocion(int valor){
        this.valorFijo = valor;
    }
    public int precioFinal(int precio){
        return precio-valorFijo;
    }
}

class Nueva implements EstadoPrenda{

    public int precioFinal(int precio){
        return precio;
    }
}

class Liquidacion implements EstadoPrenda{

    public int precioFinal(int precio){
        return (precio/2);
    }
}
