import { Component, OnDestroy, OnInit } from '@angular/core';
import { SocketService } from '../services/socket.service';
import { NgForm } from '@angular/forms';
import { PADOLabsMassage } from '../models/padolabsMessage'

@Component({
  selector: 'app-chat',
  templateUrl: './chat.component.html',
  styleUrls: ['./chat.component.scss']
})

export class ChatComponent implements OnInit, OnDestroy {


  protected socketService: SocketService;


  constructor(socketService: SocketService) {
    this.socketService = socketService;
  }

  ngOnInit(): void {
    this.socketService.openConnection();
  }

  ngOnDestroy(): void {
    this.socketService.closeConnection();
  }

  public sendMessage(sendForm: NgForm) {

    const padolabsMessage = new PADOLabsMassage(sendForm.value.user, sendForm.value.message);
    this.socketService.sendMessage(padolabsMessage);
    sendForm.controls['message'].reset();

  }
}
