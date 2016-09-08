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

 ------------------------------------------------------------

  |CONTROLLER|
    |SPRING|
 |JPA PROVIDER| - Hibernate/eclipse link       controller
     |JPA|                               service/model/business
     |JDBC|                                      dao
     |DB|                                       jdbc
                                                 bd
                                                
 
  Back end - Projeto Spring 
  -JDBC
  -DATA SOURCE-Provido pelo container(jndi - acessar recursos do servidor através de um nome(container provides))
  --xml configured
  ---application-context-datasource:  <bean id="dataSource" class="org.apache.commons.dbcp2.BasicDataSource"> irá usar esse datasource
                                      <property name="url" value="${db.url}"/> propert configurada
                                      <property name="initialSize" value="10"/>		config de num. de configurações	
	                                  	<property name="maxTotal" value="30"/>
	---application-context-jpa: Config 
	  --persistenceUnitManager: falar para o spring que existe uma jpa
	  ---<property name="packagesToScan" value="com.rentalx"/> escaneia onde estão os jpas
	  ---entityManagerFactory:ligado diretamente com a persistenceUnit
	  ---vendorAdapter:
	  
	---application-context-db:  
	
	-JPA
	-Persistence.xml(src/meta-inf) - Mapeamento de BD 
	 --Especifica provider
	                                  	
	                                  	
	                                  	
  ------------------------------------------------------------
  
  obs:
   framework de pull de conexões - c3po
   Toda classe gerenciada pelo spring é uma bean
   
   ------------------
   
   FrontController(Estratégia do MVC)
   -Gerenciar uma pilha de comandos	
   	-authCheck
   	-validator
   	-checkInController
   	
@ResponseBody - Por default o retorno é em json   	
-------------------------------------------------------------------
@manytoone(fetch=fetchtype.eager) join com
e lazy
