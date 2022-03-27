import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MapaComponent } from './mapa/mapa.component';
import { IzquierdaComponent } from './izquierda/izquierda.component';
import { LoginComponent } from './izquierda/login/login.component';
import { RegisterComponent } from './izquierda/register/register.component';
import { FiltrosComponent } from './izquierda/filtros/filtros.component';

import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NavbarComponent } from './navbar/navbar.component';
import { AboutComponent } from './about/about.component';
import { MatSliderModule } from '@angular/material/slider';
import { NgxStarRatingModule } from 'ngx-star-rating';

@NgModule({
  declarations: [
    AppComponent,
    MapaComponent,
    IzquierdaComponent,
    LoginComponent,
    RegisterComponent,
    FiltrosComponent,
    NavbarComponent,
    AboutComponent
  ],
  imports: [
    MatSliderModule,
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    NgxStarRatingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})


export class AppModule { }
