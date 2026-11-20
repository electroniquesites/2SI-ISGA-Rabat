import { Component, signal } from '@angular/core'; // 'Pipe' retiré d'ici
import { RouterOutlet } from '@angular/router';
import { Databinding } from './databinding/databinding';
import { Calcul } from './calcul/calcul';
import { Dirictives } from './dirictives/dirictives';
// Importez votre composant Pipe depuis votre dossier local (vérifiez le nom exact du dossier/fichier) :
import { Pipe } from './pipe/pipe'; 

@Component({
  selector: 'app-root',
  // Ajoutez Databinding et votre composant Pipe dans ce tableau :
  imports: [Pipe],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('demo1');
}