/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ontogenerator.ontogenservice.rest;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.File;
import java.io.Reader;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.geneontology.obographs.io.OgJsonGenerator;
import org.geneontology.obographs.model.Graph;
import org.geneontology.obographs.owlapi.FromOwl;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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
    String getAllOntologies() {

             return "Hello from spring boot in Openshift";

    }

   

}
