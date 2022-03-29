import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class HotelesService {

  constructor(private http: HttpClient) { }

  retornar() {
    return this.http.get("https://reshotel.herokuapp.com/Hoteles");
  }

}
