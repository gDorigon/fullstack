import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  private title:String = 'Testeeeeeee';
  private data: PADOInterface[] = [
    { 
      id: 1,
      title: 'Teste 1',
      imageUrl: 'assets/pado.png'
    },
    { 
      id: 2,
      title: 'Teste 2',
      imageUrl: 'assets/pado.png'
    },
    { 
      id: 3,
      title: 'Teste 3',
      imageUrl: 'assets/pado.png'
    }
  ] 

  constructor(){}

  //GETTERS & SETTERS //////////////////////////////////

  protected getTitle(){
    return this.title;
  }

  protected setTitle(event:any){
    this.title = event.target.value
  }

  protected getData(): PADOInterface[]
  {
    return this.data;
  }

}

// Interfaces //////////////////////////////////

interface PADOInterface {

  id:number;
  title:string;
  imageUrl:string;

}
