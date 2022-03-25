import { Component } from '@angular/core';

@Component({
  selector: 'app-mapa',
  templateUrl: './mapa.component.html',
  styleUrls: ['./mapa.component.css']
})
export class MapaComponent {

  lat: number;
  lng: number;
  zoom: number;

  constructor(){
    this.lat = 40;
    this.lng = -3;
    this.zoom = 6;
  }

}
