import { Component, ViewChild } from '@angular/core';


@Component({
  selector: 'app-mapa',
  templateUrl: './mapa.component.html',
  styleUrls: ['./mapa.component.css'],
})
export class MapaComponent {

  lat: number;
  lng: number;
  zoom: number;

  constructor(){
    this.lat = 41.118746913714624;
    this.lng = 1.2445956472042103;
    this.zoom = 15;
  }

}
