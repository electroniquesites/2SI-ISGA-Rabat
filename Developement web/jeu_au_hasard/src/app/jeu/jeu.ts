import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms'; 
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-jeu',
  imports: [FormsModule, CommonModule],
  templateUrl: './jeu.html',
  styleUrl: './jeu.css',
})
export class Jeu implements OnInit {

  nombreSecret : number = 0;
  nombreSaisi : number | null   = null;
  nombreEssaies : number = 5 ;
  message : String ='' ;
  jeuTermine : boolean = false;

  ngOnInit(): void {this.initialiserJeu();}

  initialiserJeu(): void {

    this.nombreSecret = Math.floor(Math.random() * 101);
    this.nombreSaisi = null;
    this.message = '';
    this.nombreEssaies = 5;
    this.jeuTermine = false;
  }
  verifierNombre() : void {
    if (this.jeuTermine || this.nombreSaisi === null) { 
      return;
    }

    this.nombreEssaies--;

    if(this.nombreSaisi == this.nombreSecret){
      this.message = 'Félicitation !!!';
      this.jeuTermine = true ;
      return;
    }
    else if (this.nombreSaisi > this.nombreSecret) {
      this.message = 'le nombre saisi est supérieur au nombre secret!!!';

    }
    else if (this.nombreSaisi < this.nombreSecret){
      this.message = 'le nombre saisi est inferieur au nombre secret!!!';
    }

    if (!this.jeuTermine && this.nombreEssaies === 0){
      this.message = 'oohhhhh !!! vous avez perdu le match .'
      this.jeuTermine = true ;
    }

    
  }

}
