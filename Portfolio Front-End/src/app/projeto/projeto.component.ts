import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Projeto } from '../model/Projeto';
import { ProjetoService } from '../service/projeto.service';

@Component({
  selector: 'app-projeto',
  templateUrl: './projeto.component.html',
  styleUrls: ['./projeto.component.css']
})
export class ProjetoComponent implements OnInit {


  listaProjetos: Projeto[]

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
    })
  }

}
