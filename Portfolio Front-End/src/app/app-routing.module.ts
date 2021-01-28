import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ContatoComponent } from './contato/contato.component';
import { HomeComponent } from './home/home.component';
import { ProjetoComponent } from './projeto/projeto.component';
import { SobreComponent } from './sobre/sobre.component';

const routes: Routes = [
  {path:'', redirectTo:'home', pathMatch:'full'},

  {path:'home', component: HomeComponent},
  {path:'contato', component: ContatoComponent},
  {path:'sobre', component: SobreComponent},
  {path:'projeto', component: ProjetoComponent},

  {path:'projeto', component: ProjetoComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
