# Documentación del proyecto

## Diagrama inicial
![Diagrama](https://user-images.githubusercontent.com/97508353/156740718-3e1ee025-85cc-44f4-9042-cb016600006b.png)

Este fue nuestro diagrama inicial, más tarde le añadimos varias tablas para futuras ampliaciones

## Modelo relacional

```
Usuario ("DNI", Nombre, Apellidos, Edad, Correo, Telefono)
	Busca (FK:"PaginaWeb", FK:"DNI")

Hoteles ("PaginaWeb", Nombre, Categoria, Telefono, PrecioNoche)
	Situado (FK:"PaginaWeb", FK:"Nombre")

Ubicacion ("CodUbicacion", Latitud, Longitud)	
Ciudad ("Nombre", FK: CodUbicacion,  Poblacion)
´´´
(Modelo relacional del diagrama inicial)
