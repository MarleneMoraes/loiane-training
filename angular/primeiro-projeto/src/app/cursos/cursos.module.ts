import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { CursosComponent } from './cursos.component';
import { CursoDetalheComponent } from './curso-detalhe/curso-detalhe.component'; // importado apenas em um modulo de funcionalidade

// Modulo de funcionalidade
// Nao ha bootstrap, mas pode ter providers

@NgModule({
  declarations: [
    CursosComponent,
    CursoDetalheComponent // criado automaticamente quando componente e gerado. este componente permanece privado para a aplicacao
  ],
  imports: [
    CommonModule
  ],
  exports: [ // declaracoes que sao expostas para outros modulos
    CursosComponent
  ]
})
export class CursosModule { }
