import { Injectable } from '@angular/core';
import { PADOLabsMassage } from '../models/padolabsMessage';

@Injectable({
  providedIn: 'root'
})
export class SocketService {

  private padoLabsMessage: PADOLabsMassage[] =[];
  private socket: WebSocket | undefined;

  constructor() {}


   public openConnection(){
    this.socket = new WebSocket("ws://localhost:7000/chat/Dorigon");

    this.socket.onopen = (event) => {
      console.log(event)
    }

    this.socket.onmessage = (event) => {
      console.log(event)
    }

   }

   public getMessages(): PADOLabsMassage[] {
    return this.padoLabsMessages;
   }

   public onmessage(){
    console.log(event.data)
    const padoMassage = JSON.parse(event.data);
    this.padoLabsMessage.push(padoMassage);
   }

   public sendMessage(padolabsMessage: PADOLabsMassage){

    this.socket?.send(JSON.stringify(padolabsMessage));
   }

   public closeConnection(){
    this.socket?.close();

   }

}
