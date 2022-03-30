import { state, trigger, style } from '@angular/animations';
import { Component, OnInit } from '@angular/core';
import { LoginService } from '../servicios/login.service';

@Component({
  selector: 'app-perfil',
  templateUrl: './perfil.component.html',
  styleUrls: ['./perfil.component.css'],
  animations: [
    trigger('escalar',[
      state('si', style({
        transform: 'scale(2)',
      })),
      state('no', style({
        transform: 'scale(1)',
      }))
    ])
  ]
})
export class PerfilComponent implements OnInit {

  constructor(private loginService: LoginService) { }
  user:any
  ape:any
  ngOnInit(): void {
    this.user = this.loginService.getUser$();

    this.loginService.getByName(this.user.username).subscribe(
      data => {
        this.ape = data;
        console.log(this.ape);
      }
    )
  }

}
