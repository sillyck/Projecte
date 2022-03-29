import { Injectable, Output, EventEmitter } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserPerfilService {
@Output() disPerfil: EventEmitter<any> = new EventEmitter();
  constructor() { }
}
