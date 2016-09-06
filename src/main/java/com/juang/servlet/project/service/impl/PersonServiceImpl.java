/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juang.servlet.project.service.impl;

import com.juang.servlet.project.entity.Person;
import com.juang.servlet.project.service.PersonService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juang
 */
public class PersonServiceImpl implements PersonService {

    @Override
    public List<Person> getAll() {
        List<Person> listPerson = new ArrayList<Person>();
        Person person1 = new Person();
        person1.setId(1);
        person1.setNama("Paijo");
        person1.setAlamat("Surabaya");
        person1.setPekerjaan("Chief Technologi Officer");
        listPerson.add(person1);

        Person person2 = new Person();
        person2.setId(2);
        person2.setNama("Poniman");
        person2.setAlamat("Lamongan");
        person2.setPekerjaan("Manager Script");
        listPerson.add(person2);

        Person person3 = new Person();
        person3.setId(3);
        person3.setNama("Ponirin");
        person3.setAlamat("Jombang");
        person3.setPekerjaan("General Manager");
        listPerson.add(person3);

        return listPerson;
    }

}
