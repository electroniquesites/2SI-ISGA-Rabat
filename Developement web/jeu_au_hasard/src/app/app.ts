import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Jeu } from './jeu/jeu';

@Component({
  selector: 'app-root',
  imports: [ Jeu],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('jeu_au_hasard');
}
