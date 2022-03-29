# Documentación del proyecto

## Diagrama inicial
![Diagrama](https://user-images.githubusercontent.com/84329782/160592117-2b501663-37a4-43c6-b943-6c1fd411445b.PNG)



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
