import { state, trigger, style } from '@angular/animations';
import { Component, OnInit } from '@angular/core';

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

  constructor() { }

  ngOnInit(): void {
  }

  escalar(){

  }

}
