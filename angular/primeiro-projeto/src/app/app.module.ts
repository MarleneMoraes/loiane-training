import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { MeuPrimeiroComponent } from './meu-primeiro/meu-primeiro.component';
import { MeuPrimeiro2Component } from './meu-primeiro2/meu-primeiro2.component';

import { CursosModule } from './cursos/cursos.module';

@NgModule({ // Decorator
  // Metadados
  declarations: [ // todos os componentes, diretivas e pipes que serao utilizadas nesse modulo
    AppComponent,
    MeuPrimeiroComponent,
    MeuPrimeiro2Component
  ],
  imports: [ // outros modulos a serem utilizados neste modulo
    BrowserModule,
    AppRoutingModule,
    CursosModule
  ],
  providers: [], // servicos disponiveis declarados nesse modulo
  bootstrap: [AppComponent] // qual e o componente que deve ser instanciado na aplicacao (o componente container)
})
export class AppModule { }
