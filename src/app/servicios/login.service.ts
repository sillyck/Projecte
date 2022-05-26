import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import { Observable, Subject } from 'rxjs';

const baseUrl = 'https://reshotel.herokuapp.com/';



export interface User {
  username: string,
  password: any
}
@Injectable({
  providedIn: 'root'
})
export class LoginService {

  private user: any;
  private user$: Subject<any>; // Subject que emite información a componentes

  constructor(private http: HttpClient) {
    this.user$ = new Subject();
  }

  signup(data: any) {
    this.user = data;
    this.user$.next(this.user);
    return this.http.post(baseUrl + `login`, data);
  }

  getByName(name: string): Observable<any> {
    return this.http.get(baseUrl + `users/${name}`);
  }

  addUser(username: string, apellidos: string, edad: number, correo: string, telefono: string, password: any): Observable<any>
  {
    return this.http.post(baseUrl +`users/`, {
      username,
      apellidos,
      edad,
      correo,
      telefono,
      password
    });
  }

  add(data: any) {
    return this.http.post(baseUrl +`users/`, data);
  }

  // updateUser(user: any){
  //   this.user = user;
  //   this.user$.next(this.user);
  // }

  getUser$(): Observable<any>{
    return this.user;

  }

}
