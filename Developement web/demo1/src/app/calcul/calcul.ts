import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { JsonPipe } from '@angular/common';

@Component({
  selector: 'app-calcul',
  imports: [JsonPipe , FormsModule],
  templateUrl: './calcul.html',
  styleUrl: './calcul.css',
})
export class Calcul {

op1 : number = 0;
op2  : number = 0;
rslt :number = 0;

add() : void{
  this.rslt = this.op1 + this.op2
}

div() : void{
  this.rslt = this.op1 / this.op2 
}

mul() : void{
  this.rslt = this.op1 * this.op2
}

sub() : void{
  this.rslt = this.op1 - this.op2
}


}
