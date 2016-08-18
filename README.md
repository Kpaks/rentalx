# rentalx

- Inicializar o repositorio local
git init

- Adicione o repositorio remoro 
git remote add origin [url do github]
git remote set-url origin [url] (mudar url)
- Comitando localmente
git add --all
git commit -m "comment"

- Add proxy no git
git config --add https.proxy https://[user:senha]@urlempresa:porta

- Commitar no github
git push origin master
git pull origin master

  |CONTROLLER|
    |SPRING|
 |JPA PROVIDER| - Hibernate/eclipse link       controller
     |JPA|                               service/model/business
     |JDBC|                                      dao
     |DB|                                       jdbc
                                                 bd
                                                
  ------------------------------------------------------------
  Back end - Projeto Spring 
  -JDBC
  --DATA SOURCE-Provido pelo container(jndi - acessar recursos do servidor através de um nome(container provides))
  ---xml configured
  ----application-context-datasource: 
  
  ------------------------------------------------------------
  
  obs:
   framework de pull de informações - c3po
   Toda classe gerenciada pelo spring é uma bean
