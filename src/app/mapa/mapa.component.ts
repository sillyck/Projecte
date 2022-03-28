import { Component, ViewChild } from '@angular/core';


@Component({
  selector: 'app-mapa',
  templateUrl: './mapa.component.html',
  styleUrls: ['./mapa.component.css'],
})
export class MapaComponent {

  lat: number = 41.118746913714624;
  lng: number = 1.2445956472042103;
  zoom: number = 15;

}
