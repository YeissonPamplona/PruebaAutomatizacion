# language: es

Característica: Agregar un producto al carrito de compras
  Yo como usuario
  necesito agregar un producto al carrito de comprar
  para iniciar el proceso de compra

  @AgregarProductoCarrito
  Esquema del escenario: Iniciar proceso de compra
    Dado Que el usuario busca un producto
      | producto   | tipoProducto   | marca   | nombreProducto   | talla   |
      | <producto> | <tipoProducto> | <marca> | <nombreProducto> | <talla> |
    Cuando Agrega el producto al carrito para iniciar proceso de pago
      | municipio   | ciudad   | barrio   | direccion   | numDepartamento   |
      | <municipio> | <ciudad> | <barrio> | <direccion> | <numDepartamento> |
    Entonces deberia de ver el precio inicial del producto

    Ejemplos:
      | producto | tipoProducto   | marca  | nombreProducto                              | talla | municipio | ciudad   | barrio   | direccion        | numDepartamento |
      | zapatos  | zapatos hombre | adidas | Tenis Adidas Hombre Basketball Own The Game | 40    | CALDAS    | LA LINDA | LA LINDA | Av. siempre viva | Torre 1         |

