import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MapaComponent } from './mapa/mapa.component';
import { IzquierdaComponent } from './izquierda/izquierda.component';
import { LoginComponent } from './izquierda/login/login.component';
import { RegisterComponent } from './izquierda/register/register.component';
import { FiltrosComponent } from './izquierda/filtros/filtros.component';
import { FormsModule } from '@angular/forms';

import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NavbarComponent } from './navbar/navbar.component';
import { AboutComponent } from './about/about.component';
import { MatSliderModule } from '@angular/material/slider';
import { NgxStarRatingModule } from 'ngx-star-rating';
import { MatCheckboxModule } from '@angular/material/checkbox';
import { AgmCoreModule } from '@agm/core';

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
    MatCheckboxModule,
    FormsModule,
    MatSliderModule,
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    NgxStarRatingModule,
    AgmCoreModule.forRoot({
      apiKey: 'AIzaSyD59cw4fBvhvtRTgPoyQ5HcSy_6RXuh2uU'
    })
  ],
  providers: [],
  bootstrap: [AppComponent]
})


export class AppModule { }
