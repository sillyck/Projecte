import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './izquierda/login/login.component';
import { RegisterComponent } from './izquierda/register/register.component';
import { MapaComponent } from './mapa/mapa.component';
import { AboutComponent } from './about/about.component';

const routes: Routes = [

  {
    path:'about',
    component:AboutComponent
  },
  {
    path:'',
    component:MapaComponent
  }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
