/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juang.servlet.project.service;

import com.juang.servlet.project.entity.Person;
import java.util.List;

/**
 *
 * @author juang
 */
public interface PersonService {
    List<Person> getAll();
}
