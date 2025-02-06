package br.com.mramos.services;

import br.com.mramos.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {

    private final AtomicLong counter = new AtomicLong();
    private Logger loger  = Logger.getLogger(PersonServices.class.getName());

        public List<Person> findAll(){

            loger.info("Recuperando todos os registros");

            List<Person> personList = new ArrayList<>();
            for (int i = 0; i < 8; i++) {
                Person person = mockPerson();
                personList.add(person);

            }
            return personList;
        }


    public Person findById( String id){

        loger.info("Encontranto a pessoa " + id);

        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Mauro");
        person.setLastName("Ramos");
        person.setEndereco("Estrada Municipal Walter Steurer");
        person.setGenero("M");

        return person;

    }

    public Person createPerson(Person person){
            loger.info("Criando uma pessoa");

            return person;
    }

    public Person updatePerson(Person person){
        loger.info("Atualizando informacoes de uma pessoa");

        return person;
    }
    public void deletePerson(String id ){
        loger.info("Excluindo uma pessoa");


    }




    private Person mockPerson(){
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Person " + person.getId());
        person.setLastName("Lname " + person.getId());
        person.setEndereco("Endereco " + person.getEndereco());
        person.setGenero("M " + person.getId());
        return person;
    }

}
