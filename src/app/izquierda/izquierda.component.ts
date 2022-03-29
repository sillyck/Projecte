import { Component, OnInit, Output, EventEmitter } from '@angular/core';
import { trigger, state, style, animate, transition, animation } from '@angular/animations';
import { delay } from 'rxjs';


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
        animate('200ms', style({ opacity: 0, transform: 'translateY(10px)' })),
      ]),
    ])
  ]
})
export class IzquierdaComponent implements OnInit {
  show: boolean = false;
  mostrarLogin: boolean = false;
  mostrarRegister: boolean = false;

  @Output() EP_max = new EventEmitter<number>();
  @Output() EEstrellas = new EventEmitter<number>();

  constructor() { }

  ngOnInit(): void {
  }

  abrir() {
    this.show = this.show ? false : true;
  }

  abrirLogin() {
    this.mostrarRegister = false;
    this.mostrarLogin = this.mostrarLogin ? false : true;
  }

  abrirRegister() {
    this.mostrarLogin = false;
    this.mostrarRegister = this.mostrarRegister ? false : true;
  }

  obtenerPrecio(e: any){
    this.EP_max.emit(e);
  }

  obtenerEstrellas(e: any){
    this.EEstrellas.emit(e);
  }

 }

