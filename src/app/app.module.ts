import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MapaComponent } from './mapa/mapa.component';
import { IzquierdaComponent } from './izquierda/izquierda.component';
import { LoginComponent } from './izquierda/login/login.component';
import { RegisterComponent } from './izquierda/register/register.component';
import { FiltrosComponent } from './izquierda/filtros/filtros.component';
import { BotonesLoginRegisterComponent } from './izquierda/botones-login-register/botones-login-register.component';

@NgModule({
  declarations: [
    AppComponent,
    MapaComponent,
    IzquierdaComponent,
    LoginComponent,
    RegisterComponent,
    FiltrosComponent,
    BotonesLoginRegisterComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
