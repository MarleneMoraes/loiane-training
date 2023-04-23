import { Injectable } from '@angular/core';

@Injectable({ // essa classe pode ser injetada em outra
  providedIn: 'root'
})
export class CursosService {

  constructor() { }

  getCursos() {
    return ['Java', 'Ext JS', 'Angular'];
  }
}
