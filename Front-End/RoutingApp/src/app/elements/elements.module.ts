import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ElementsRoutingModule } from './elements-routing.module';
import { ElementsHomeComponent } from './elements-home/elements-home.component';
import { CardElementsComponent } from './card-elements/card-elements.component';


@NgModule({
  declarations: [
    ElementsHomeComponent,
    CardElementsComponent
  ],
  imports: [
    CommonModule,
    ElementsRoutingModule
  ]
})
export class ElementsModule { }
