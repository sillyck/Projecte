import { Component, OnInit } from '@angular/core';
import { trigger, state, style, animate, transition, animation } from '@angular/animations';
import { UserPerfilService } from '../servicios/user-perfil.service';

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
    ]),
    trigger('visualizacion', [
      transition(':leave', [
        animate('50ms', style({ opacity: 0, transform: 'translateY(0)' })),
      ]),
    ]),
  ]
})
export class NavbarComponent implements OnInit {
  mostrarLogin: boolean = false;
  mostrarRegister: boolean = false;
  botonLogin: boolean = true;

  constructor(private servicioPerfil: UserPerfilService) { }
  public us:Array<any> = []
  ngOnInit(): void {
    this.servicioPerfil.disPerfil.subscribe(data => {
      console.log('Recibiendo datos...', data);
      this.us.push(data);
    } )
  }

  abrirLogin() {
    this.mostrarRegister = false;
    this.mostrarLogin = this.mostrarLogin ? false : true;
  }

  abrirRegister() {
    this.mostrarLogin = false;
    this.mostrarRegister = this.mostrarRegister ? false : true;
  }

  quitarBoton() {
    this.mostrarLogin = false;
    this.mostrarRegister = false;
    this.botonLogin = this.botonLogin ? true : false;
  }

}
