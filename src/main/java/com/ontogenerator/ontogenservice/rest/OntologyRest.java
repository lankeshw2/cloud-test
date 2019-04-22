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

    @GetMapping(path = "/hello")
    String getAllOntologies() throws UnknownHostException {

             return "Hello from spring boot in Openshift Platform"+InetAddress.getLocalHost().getHostName();

    }

   

}
