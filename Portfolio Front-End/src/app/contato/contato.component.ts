import { Component, OnInit } from '@angular/core';
import { Contato } from '../model/Contato';
import { Projeto } from '../model/Projeto';
import { ContatoService } from '../service/contato.service';

@Component({
  selector: 'app-contato',
  templateUrl: './contato.component.html',
  styleUrls: ['./contato.component.css']
})
export class ContatoComponent implements OnInit {

  contato: Contato = new Contato()
  
  constructor(
    private contatoService: ContatoService
  ) {}

  ngOnInit(): void {
  }

  postContato() {
    this.contatoService.postContato(this.contato).subscribe(() => {
      alert("Mensagem enviada com sucesso!")
    })
  }
}
