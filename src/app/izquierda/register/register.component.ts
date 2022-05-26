import { Component, OnInit } from '@angular/core';
import { LoginService } from 'src/app/servicios/login.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  usuario: any = {
    username:"",
    apellidos:"",
    edad: "",
    correo:"",
    telefono:"",
    password:""
  };
    constructor(private api: LoginService){}
  ngOnInit(): void {
  }

  guardarUsuario(){
    const datos = {
      username : this.usuario.username,
      apellidos : this.usuario.apellidos,
      edad : this.usuario.edad,
      correo : this.usuario.correo,
      telefono : this.usuario.telefono,
      password : this.usuario.password
    }

    this.api.addUser(datos.username, datos.apellidos, datos.edad, datos.correo, datos.telefono, datos.password)
      .subscribe(
        respuesta => {
          console.log(respuesta);
        },
        error => {
          console.log(error);
        }
      );
    // this.api.add(datos)
    //   .subscribe(
    //     response => {
    //       console.log(response);
    //     },
    //     error => {
    //       console.log(error);
    //     });
  }




}
