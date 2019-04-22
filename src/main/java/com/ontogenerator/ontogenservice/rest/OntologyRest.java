/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ontogenerator.ontogenservice.rest;

import java.net.InetAddress;
import java.net.UnknownHostException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Aspire2 Student
 */
@RestController
public class OntologyRest {

    public OntologyRest() {

      
    }

    @Value("${ontology.genfilepath}")
    String genFilePath;

    @GetMapping(path = "/hello/{path}")
    String getAllOntologies(@PathVariable(name="path") String path) throws UnknownHostException {
        
               System.out.println("Received request with path  "+path);

             return " Openshift Platform You have sent the path "+path;

    }

   

}
