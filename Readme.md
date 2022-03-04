# Documentación del proyecto

## Diagrama inicial
![Diagrama](https://user-images.githubusercontent.com/97508353/156740718-3e1ee025-85cc-44f4-9042-cb016600006b.png)

Este fue nuestro diagrama inicial, más tarde le añadimos varias tablas para futuras ampliaciones

## Modelo relacional

```
Usuario ("ID", DNI, Nombre, Apellidos, Edad, Correo, Password, Telefono)
	Busca (PK: "ID", FK:"Hoteles_id", FK:"Usuario_id")

Hoteles ("ID", PaginaWeb, Nombre, Categoria, Telefono, PrecioNoche)
	Situado (PK: "ID", FK:"Hoteles_id", FK:"Ciudad_id")

Ubicacion ("ID", CodUbicacion, Latitud, Longitud)	
Ciudad ("ID", Nombre, FK: CodUbicacion,  Poblacion)
```
(Modelo relacional del diagrama inicial)
