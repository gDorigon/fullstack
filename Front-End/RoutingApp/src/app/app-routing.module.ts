import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CardElementsComponent } from './elements/card-elements/card-elements.component';
import { HomeComponentComponent } from './home-component/home-component.component';
import { NotFoundComponent } from './not-found/not-found.component';

const routes: Routes = [
  { path: 'home', component: HomeComponentComponent},
  { path: 'cards', component: CardElementsComponent},
  { path: "", redirectTo: "/home", pathMatch: "full"},
  { path: '**', component: NotFoundComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
