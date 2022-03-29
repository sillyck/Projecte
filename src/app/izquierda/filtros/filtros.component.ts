import { Component, OnInit, Output, EventEmitter } from '@angular/core';
import { trigger, state, style, animate, transition, animation } from '@angular/animations';

@Component({
  selector: 'app-filtros',
  templateUrl: './filtros.component.html',
  styleUrls: ['./filtros.component.css'],
  animations: [
    trigger('animacionAbrir',[
      transition(':enter', [
        style({ opacity: 0, transform: 'translateY(-10px)' }),
		    animate('200ms', style({ opacity: 1, transform: 'translateY(0)' })),
      ]),
      transition(':leave', [
        animate('200ms', style({ opacity: 0, transform: 'translateY(10px)' })),
      ]),
    ])
  ]
})
export class FiltrosComponent implements OnInit {

  precio_max:number = 0;
  estrellas:number = 0;

  @Output() EP_max = new EventEmitter<number>();
  @Output() EEstrellas = new EventEmitter<number>();

  ejecutarEvento(){
    this.EP_max.emit(this.precio_max);
    this.EEstrellas.emit(this.estrellas);
  }

  formatLabel(value: number) {
    return value + '€';
  }

  constructor() {
   }

  ngOnInit(): void {
  }

}
