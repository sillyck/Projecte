import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './izquierda/login/login.component';
import { RegisterComponent } from './izquierda/register/register.component';
import { MapaComponent } from './mapa/mapa.component';
import { AboutComponent } from './about/about.component';
import { PerfilComponent } from './perfil/perfil.component';

const routes: Routes = [

  {
    path:'register',
    component:RegisterComponent
  },
  {
    path:'about',
    component:AboutComponent
  },
  {
    path:'home',
    component:MapaComponent
  },
  {
    path:'perfil',
    component:PerfilComponent
  },
  {
    path:'',
    component:LoginComponent
  }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
