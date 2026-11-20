import { Component } from '@angular/core';
import { Personne } from '../classes/personne';
import { JsonPipe } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-databinding',
  imports: [JsonPipe , FormsModule],
  templateUrl: './databinding.html',
  styleUrl: './databinding.css',
})
export class Databinding {

  ecole : string = 'isga';


  pers : Personne = new Personne(10 ,'imane','imane');

  tab : number[] = [4,15,0,31,-4]

  direbonjour() : String {
    return 'bonjour les étudiants'
  }
  
  num : number = 10 ;

example1():void{
  alert("Data load")
}

name: string = "ali"

}
