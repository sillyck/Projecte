import { Component, ViewChild } from '@angular/core';
import { HotelesService } from '../hoteles.service';

@Component({
  selector: 'app-mapa',
  templateUrl: './mapa.component.html',
  styleUrls: ['./mapa.component.css'],
})
export class MapaComponent {

  lat: number = 41.118746913714624;
  lng: number = 1.2445956472042103;
  zoom: number = 15;
  estrellas: number = 0;
  precio_max: number = 0;
  hoteles: any = null;

  constructor(private hotelesService: HotelesService) {}

  ngOnInit(): void {
    this.hoteles.retornar()
      .subscribe( (result: any) => this.hoteles = result)
  }

  obtenerPrecio(e: any){
    console.log("Precio: "+ e);
    this.precio_max = e;
  }

  obtenerEstrellas(e: any){
    console.log("Estrellas: "+ e);
    this.estrellas = e;
  }

}
