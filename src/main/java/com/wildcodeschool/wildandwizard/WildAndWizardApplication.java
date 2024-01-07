package com.wildcodeschool.wildandwizard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



/**
 * 
 * 
 * 
 * 
Le projet s'exécute bien sur la base de données et l'utilisateur requis. >> OK
La classe Wizard contient bien tout le code nécessaire pour lier une liste de cours.>> OK
La classe Course contient bien tout le code nécessaire pour lier une liste d'élèves.>> OK
Il est possible pour un élève de s'inscrire à un ou plusieurs cours à partir du lien "courses".>> OK
Il est possible de voir la liste des cours d'un élève à partir du lien "courses".>> OK
Le code est disponible sur GitHub.>> OK



 Resultat des courses : 

Hibernate: create table wizard_course (wizard_id bigint not null, course_id bigint not null) engine=InnoDB
Hibernate: alter table wizard_course add constraint FKa8tsd7tqmyca9vcqm7k1je7fu foreign key (course_id) references course (id)
Hibernate: alter table wizard_course add constraint FK403omq5ol57tkag4s9dfjsep3 foreign key (wizard_id) references wizard (id)


 */
@SpringBootApplication
public class WildAndWizardApplication {

	public static void main(String[] args) {
		SpringApplication.run(WildAndWizardApplication.class, args);
	}

}
