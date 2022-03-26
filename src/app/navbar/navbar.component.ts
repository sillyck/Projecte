import { Component, OnInit } from '@angular/core';
import { trigger, state, style, animate, transition, animation } from '@angular/animations';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css'],
  animations: [
    trigger('animacionAbrir',[
      transition(':enter', [
        style({ opacity: 0, transform: 'translateY(-10px)' }),
		    animate('100ms', style({ opacity: 1, transform: 'translateY(0)' })),
      ]),
      transition(':leave', [
        animate('100ms', style({ opacity: 0, transform: 'translateY(1px)' })),
      ]),
    ])
  ]
})
export class NavbarComponent implements OnInit {
  mostrarLogin: boolean = false;
  mostrarRegister: boolean = false;

  constructor() { }

  ngOnInit(): void {
  }

  abrirLogin() {
    this.mostrarRegister = false;
    this.mostrarLogin = this.mostrarLogin ? false : true;
  }

  abrirRegister() {
    this.mostrarLogin = false;
    this.mostrarRegister = this.mostrarRegister ? false : true;
  }

}
