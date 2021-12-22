/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.assessment.Assessment;

import java.util.ArrayList;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Acer
 */
@Controller
public class dbController {
    @CrossOrigin
    @RequestMapping(value ="/data/json", produces = {
        MediaType.APPLICATION_JSON_VALUE
    })
    @ResponseBody
    public List<Datamahasiswa> getDataMahasiswaJson(){
        
        List<Datamahasiswa> dataMhs = new ArrayList<>();
        
        DatamahasiswaJpaController controller =new DatamahasiswaJpaController();
        
        try{
            dataMhs = controller.findDatamahasiswaEntities();
        }catch(Exception e){
            
        } 
        
        return dataMhs;
    }
    
    @CrossOrigin
    @RequestMapping(value ="/data/xml", produces = {
        MediaType.APPLICATION_XML_VALUE
    })
    @ResponseBody
    public List<Datamahasiswa> getDataMahasiswaXml(){
        
        List<Datamahasiswa> dataMhs = new ArrayList<>();
        
        DatamahasiswaJpaController controller = new DatamahasiswaJpaController();
        
        try{
            dataMhs = controller.findDatamahasiswaEntities();
        }catch(Exception e){
            
        } 
        
        return dataMhs;
    }
}