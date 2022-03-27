import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-filtros',
  templateUrl: './filtros.component.html',
  styleUrls: ['./filtros.component.css']
})
export class FiltrosComponent implements OnInit {

  formatLabel(value: number) {
    return value + '€';
  }

  estrellas:number = 0;

  constructor() { }

  ngOnInit(): void {
  }

}
