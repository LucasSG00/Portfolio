import { Imagem } from "./Imagem";
import { Linguagem } from "./Linguagem";

export class Projeto {
    public idProjeto: number;
    public titulo: string;
    public imgPrincipal: string;
    public descricao: string;
    public imagens: Imagem[];
    public linguagens: Linguagem[];
}