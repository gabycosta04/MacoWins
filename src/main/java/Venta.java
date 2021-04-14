import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Venta {

    Set<Prenda> prendasVendidas = new HashSet<Prenda>();
    TipoDeVenta medioDePago;
    int fechaVenta;

    public static void main(String[] args){
            EstadoPrenda sinUso = new Nueva();
            Prenda pantalonCorto = new Pantalon(5000,sinUso);
            Prenda saquitoFacha = new Saco(15000,sinUso);
            Prenda camisaPriv = new Camisa(10000,sinUso);
            Set<Prenda> totalVenta1= new HashSet<Prenda>();

            TipoDeVenta pagoEfectivo = new Efectivo();
            Venta ventaN1 = new Venta(totalVenta1,pagoEfectivo, 20210414);
            ventaN1.agregarProductoParaComprar(pantalonCorto);
            ventaN1.agregarProductoParaComprar(saquitoFacha);
            ventaN1.agregarProductoParaComprar(camisaPriv);
            System.out.print("\n\nCantidad de prendas: " + ventaN1.cantidadPrendas());
            System.out.print("\nPrecio final: " + ventaN1.precioFinal()); // como podemos ver aca en pantalla nos imprimiria el precio de 30000

            //ahora nosotros establecimos que no se podria repetir la misma prenda para agregar, por lo tanto deberia no agregarla repetida
            ventaN1.agregarProductoParaComprar(camisaPriv);
            System.out.print("\n\nAHORA AL AGREGAR UNA NUEVA PRENDA REPETIDA, vemos si el precio se modifica:");
            System.out.print("\nCantidad de prendas: " + ventaN1.cantidadPrendas());
            System.out.print("\nPrecio final: " + ventaN1.precioFinal());
            //como podemos ver funciona correctamente


            //Ahora probamos otro ejemplo pero con tarjeta de credito, donde a pesar de tener los mismos articulos, el precio aumenta:
            TipoDeVenta masterCardPriv = new Tarjeta(6,15);
            Set<Prenda> totalVenta2= new HashSet<Prenda>();
            Venta ventaN2 = new Venta(totalVenta2,masterCardPriv, 20210425);
            ventaN2.agregarProductoParaComprar(pantalonCorto);
            ventaN2.agregarProductoParaComprar(saquitoFacha);
            ventaN2.agregarProductoParaComprar(camisaPriv);

            System.out.print("\n\nPrecio final: " + ventaN2.precioFinal());
            System.out.print("\nCantidad de prendas: " + ventaN2.cantidadPrendas());

    }

    Venta(Set<Prenda> prendas, TipoDeVenta medio,int fecha){
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










