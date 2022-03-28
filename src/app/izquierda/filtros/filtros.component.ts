import { Component, OnInit } from '@angular/core';
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


  formatLabel(value: number) {
    return value + '€';
  }

  estrellas:number = 0;

  constructor() {
   }

  ngOnInit(): void {
  }

}
