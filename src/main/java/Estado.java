public interface Estado{
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
        return (precio/2);
    }
}
