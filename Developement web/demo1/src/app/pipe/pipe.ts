import { DatePipe } from '@angular/common';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pipe',
  imports: [DatePipe],
  templateUrl: './pipe.html',
  styleUrl: './pipe.css',
})
export class Pipe {

  public dateAujourd = new Date() ;

  public school : number  = 100;




}
