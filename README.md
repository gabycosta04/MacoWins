# MACOWINS


Se requiere:

Identificar los requerimientos
Presentar una solución usando el paradigma de objetos (pseudocódigo, diagrama de clases).
Explicar todo lo que considere necesario en prosa.
Si se descarta alguna alternativa durante el desarrollo de la solución, o si se tiene otra solución, explicarla brevemente.


La conocida empresa de ropa formal para caballeros, Macowins, es capaz de darle soporte a la venta de prendas. Un fragmento de la grabación del analista con el cliente:

“Queremos saber el precio de venta de una prenda y sus tipos, los tipos de prenda son: sacos, pantalones, camisas.”

El cálculo del precio de una prenda es, el precio propio de la prenda modificado según el estado de la prenda, que pueden ser:
Nueva: en este caso no modifican el precio base.
Promoción: Le resta un valor fijo decidido por el usuario.
Liquidación: Es un 50% del valor del producto.

Ah, un requerimiento más: Macowins registra las ventas de estas prendas y necesita saber las ganancias de un determinado día. 

“Cada venta tiene asociada las prendas que se vendieron, su cantidad y la fecha de venta. 
Las ventas pueden ser en efectivo o con tarjeta. En el caso que sea con tarjeta, tienen el mismo comportamiento que en efectivo (el cual no modifica el precio), sólo que se le aplica un recargo según la cantidad de cuotas seleccionadas (cantidad de cuotas * un coeficiente fijo + 0.01 del valor de cada prenda).”


# Requerimentos identificados:

- Una prenda puede ser de los tipos: sacos, camisas, pantalones.
- Las prendas deben estar formadas tanto por su precio base como por su condicion/estado
- Cada estado de la prenda permite calcular el precio final de venta de la prenda de una manera diferente cada una.
- Una venta esta formada por un conjunto de prendas que son vendidas, por una fecha de venta y por el tipo de pago con el que se realizo la venta.
- De cada venta se puede saber la cantidad de prendas vendidas, la fecha de venta, y ademas el monto final que fue pagado (el cual ademas del precio de venta de cada prenda, tambien depende del metodo de pago utilizado).
- No se pueden agregar prendas repetidas al realizar una venta
- Cada metodo de pago permite calcular el precio final de una venta realizada de un conjunto de prendas, de una manera diferente cada una.


# Modelado del programa (DIAGRAMA DE CLASES):

![Im](modeloUML-DiagramaDeClases.png "Diagrama de clases del Ejercicio Macowins realizado en LucidChart")

