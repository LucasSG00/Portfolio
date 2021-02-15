use portfolio;

select * from tb_imagem;
select * from tb_linguagem;
select * from tb_projeto;
select * from tb_contato;

insert into tb_projeto values (default, 'O projeto consiste em um loja fictícia de jogos eletrônicos na qual possibilita ver mais informações sobre os jogos e também assistir o trailer do jogo que será lançado em breve.', 'https://i.imgur.com/HZxxryZ.png', 'Landing Page');
insert into tb_linguagem values (default, 'HTML', 1);
insert into tb_linguagem values (default, 'CSS', 1);
insert into tb_linguagem values (default, 'JavaScript', 1);
insert into tb_imagem values (default, 'https://i.imgur.com/2bkLwaZ.png', 'Promotions', 1);
insert into tb_imagem values (default, 'https://i.imgur.com/UB7tYbQ.png', 'Free', 1);
insert into tb_imagem values (default, 'https://i.imgur.com/LxljdFw.png', 'Coming Soon', 1);
insert into tb_imagem values (default, 'https://i.imgur.com/gA6N1vs.png', 'Trailer Coming Soon', 1);
insert into tb_imagem values (default, 'https://i.imgur.com/0Z3eZcF.png', 'Contact', 1);

insert into tb_projeto values (default, 'O projeto consiste em um blog para que as pessoas possam se cadastrar e publicarem cards de acordo com os temas inseridos pelos administradores, na qual podem ver todas as publicações, as que eles postaram e poderem ver postagens só por determinado tema.', 'https://i.imgur.com/xZwkQN0.png', 'Blog Pessoal');
insert into tb_linguagem values (default, 'HTML', 2);
insert into tb_linguagem values (default, 'CSS', 2);
insert into tb_linguagem values (default, 'Angular', 2);
insert into tb_linguagem values (default, 'TypeScript', 2);
insert into tb_linguagem values (default, 'Java', 2);
insert into tb_linguagem values (default, 'Spring Boot', 2);
insert into tb_linguagem values (default, 'MySQL', 2);
insert into tb_imagem values (default, 'https://i.imgur.com/IFTVDlj.png', 'Inicio', 2);
insert into tb_imagem values (default, 'https://i.imgur.com/X310BSB.png', 'Cadastrar', 2);
insert into tb_imagem values (default, 'https://i.imgur.com/rB6F2t5.png', 'Minhas Postagens', 2);
insert into tb_imagem values (default, 'https://i.imgur.com/GFwThQS.png', 'Filtro Postagens', 2);
insert into tb_imagem values (default, 'https://i.imgur.com/3bcGhbr.png', 'Atualizar', 2);
insert into tb_imagem values (default, 'https://i.imgur.com/68uj8Pw.png', 'Deletar', 2);

insert into tb_projeto values (default, 'O projeto consiste em uma aplicação Web que gerencia pedidos de pizzas para um determinada localização utilizando o mapeamento através da biblioteca Leaflet do React.', 'https://i.imgur.com/s2xfdbS.png', 'DsDeliver');
insert into tb_linguagem values (default, 'HTML', 3);
insert into tb_linguagem values (default, 'CSS', 3);
insert into tb_linguagem values (default, 'React', 3);
insert into tb_linguagem values (default, 'TypeScript', 3);
insert into tb_linguagem values (default, 'Java', 3);
insert into tb_linguagem values (default, 'Spring Boot', 3);
insert into tb_linguagem values (default, 'Maven', 3);
insert into tb_linguagem values (default, 'PostgreSQL', 3);
insert into tb_imagem values (default, 'https://i.imgur.com/RWE75LD.png', 'Home', 3);
insert into tb_imagem values (default, 'https://i.imgur.com/9q324w3.png', 'Order', 3);

insert into tb_projeto values (default, 'Projeto desenvolvido durante a 11ª Semana OminiStack da Rocketseat. O projeto consiste em uma aplicação Web que gerencia anotações (idéias) criativas para poder ser feita durante a quarentena. Na qual a possiblidade de criar nova anotações de idéias e ver mais detalhadamente as idéias já criadas.', 'https://i.imgur.com/RWE75LD.png', 'Casa Criativa');
insert into tb_linguagem values (default, 'HTML', 4);
insert into tb_linguagem values (default, 'CSS', 4);
insert into tb_linguagem values (default, 'JavaScript', 4);
insert into tb_linguagem values (default, 'Node.js', 4);
insert into tb_linguagem values (default, 'SQLite 3', 4);
insert into tb_imagem values (default, 'https://i.imgur.com/EzK3t1d.png', 'New Ideas', 4);
insert into tb_imagem values (default, 'https://i.imgur.com/AFUfBve.png', 'Ideas', 4);

insert into tb_projeto values (default, 'Desenvolvimento de uma Interface de Academia Projeto elaborado usando o Adobe XD para a criação de uma Interface de Academia desenvolvido para a matéria de Interface Humano-Computador do 3º semestre do curso de TADS do Centro Universitário Senac. Com o intuito da utilização das ferramentas de interação com o usuário ao selecionar determinados botões e praticando conhecimentos adquiridos da ferramente Adobe XD.', 'https://i.imgur.com/HBpTfuF.png', 'Interface Academia');
insert into tb_linguagem values (default, 'Adobe XD', 5);
insert into tb_imagem values (default, 'https://i.imgur.com/xSsgUdi.png', 'Catálogo ', 5);
insert into tb_imagem values (default, 'https://i.imgur.com/lys4eYC.png', 'Calories', 5);
insert into tb_imagem values (default, 'https://i.imgur.com/VEMfj90.png', 'Password', 5);
insert into tb_imagem values (default, 'https://i.imgur.com/2Io7stp.png', 'Config - Options', 5);
insert into tb_imagem values (default, 'https://i.imgur.com/Gwuuuqy.png', 'Config', 5);

insert into tb_projeto values (default, 'Desenvolvimento de uma Página Web de Academia elaborado usando o Adobe XD para a criação de uma interface de academia desenvolvido para a matéria de Interface Humano-Computador do 3º semestre do curso de TADS do Centro Universitário Senac. Com o intuito da utilização das ferramentas de interação com o usuário e praticando o menu ao selecionar a função.', 'https://i.imgur.com/s2xfdbS.png', 'Web Site - Boa Forma');
insert into tb_linguagem values (default, 'Adobe XD', 6);
insert into tb_imagem values (default, 'https://i.imgur.com/GgjMFQ5.png', 'Schedule', 6);
insert into tb_imagem values (default, 'https://i.imgur.com/ZqmtDYW.png', 'Download', 6);
insert into tb_imagem values (default, 'https://i.imgur.com/EcIwUs0.png', 'Location', 6);

insert into tb_projeto values (default, 'Projeto de E-commerce fictício desenvolvido durante o curso da matéria de Programação Web do 2º semestre do curso de TADS no Centro Universitário Senac Santo Amaro. Com o intuito de praticar sobre as ferramentas utilizadas no mercado e aprender as linguagens voltadas para o Front-End.', 'https://i.imgur.com/i7YpxFD.png', 'Mirror Fashion');
insert into tb_linguagem values (default, 'HTML', 7);
insert into tb_linguagem values (default, 'CSS', 7);
insert into tb_imagem values (default, 'https://i.imgur.com/KbFdsQx.png', 'about', 7);
insert into tb_imagem values (default, 'https://i.imgur.com/E7WrGJz.png', 'history', 7);
insert into tb_imagem values (default, 'https://i.imgur.com/IgeVhkf.png', 'product', 7);


