import { Component, Input, OnInit } from '@angular/core';
import {LoginService} from '../../servicios/login.service'

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'],
})
export class LoginComponent implements OnInit {

  token: any = 'token inicial';
  isLoggedIn = false;
  isLoginFailed = false;

  login: any = {
    username: '',
    password: ''
  };

  submitted = false;
  // @Input() usuario:any;
  constructor(private loginService: LoginService) { }

  ngOnInit(): void {
  }


  logUser(): void {
    const data = {
      username: this.login.username,
      password: this.login.password,
    };

    this.loginService.signup(data)
      .subscribe(
        response => {
          this.token = response;
          this.submitted = true;
          console.log(response);
          window.sessionStorage.setItem("auth-token", this.token.token);
          window.sessionStorage.setItem("auth-username", this.login.username);
          this.isLoginFailed = false;
          this.isLoggedIn = true;
        },
        error => {
          console.log(error);
          this.isLoginFailed = true;
        });

  }

}
