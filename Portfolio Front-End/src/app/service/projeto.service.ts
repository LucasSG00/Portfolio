import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Projeto } from '../model/Projeto';

@Injectable({
  providedIn: 'root'
})
export class ProjetoService {

  constructor(private http: HttpClient) { }

  // https://lucassg.herokuapp.com

  getAllProjeto(): Observable<Projeto[]>{
    return this.http.get<Projeto[]>('http://localhost:8080/projeto')
  }

  getByIdProjeto(id: number):Observable<Projeto>{
    return this.http.get<Projeto>(`http://localhost:8080/projeto/id/${id}`)
  }

}
