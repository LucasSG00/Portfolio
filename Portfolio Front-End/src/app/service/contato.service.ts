import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Contato } from '../model/Contato';

@Injectable({
  providedIn: 'root'
})
export class ContatoService {

  constructor(private http: HttpClient) { }

  getAllContato(): Observable<Contato[]>{
    return this.http.get<Contato[]>('http://localhost:8080/contato/all')
  }

  postContato(contato: Contato){
    return this.http.post('http://localhost:8080/contato', contato)
  }

}
