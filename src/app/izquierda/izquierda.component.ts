import { Component, OnInit } from '@angular/core';
import { trigger, state, style, animate, transition, animation } from '@angular/animations';


@Component({
  selector: 'app-izquierda',
  templateUrl: './izquierda.component.html',
  styleUrls: ['./izquierda.component.css'],
  animations: [
    trigger('animacionAbrir',[
      transition(':enter', [
        style({ opacity: 0, transform: 'translateY(-10px)' }),
		    animate('200ms', style({ opacity: 1, transform: 'translateY(0)' })),
      ]),
      transition(':leave', [
        animate('200ms', style({ opacity: 0, transform: 'translateY(21px)' })),
      ]),
    ])
  ]
})
export class IzquierdaComponent implements OnInit {
  show: boolean = false;
  constructor() { }

  ngOnInit(): void {
  }

  abrir() {
    this.show = this.show ? false : true;
  }

}
