import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Imagem } from '../model/Imagem';
import { Linguagem } from '../model/Linguagem';
import { Projeto } from '../model/Projeto';
import { ProjetoService } from '../service/projeto.service';

@Component({
  selector: 'app-projeto',
  templateUrl: './projeto.component.html',
  styleUrls: ['./projeto.component.css']
})

export class ProjetoComponent implements OnInit {

  projeto: Projeto = new Projeto()
  listaProjetos: Projeto[]
  listaImagens: Imagem[]
  listaLinguagens: Linguagem[]

  constructor(
    private router: Router,
    private projetoService: ProjetoService
  ) { }

  ngOnInit(): void {
    this.findAll()

    

  }

  findAll(){
    this.projetoService.getAllProjeto().subscribe((resp: Projeto[]) => {
      this.listaProjetos = resp
      console.log(this.listaProjetos)
    })
  }

  mostraModal(id: number){
    this.projetoService.getByIdProjeto(id).subscribe((resp: Projeto) => {
      this.listaImagens = resp.imagens
      this.listaLinguagens = resp.linguagens
      this.projeto = resp
      console.log(this.projeto)
    })
  }

}
