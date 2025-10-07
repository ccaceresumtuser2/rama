/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udc.topico.isoft.proyectogitdemo.dto;

/**
 *
 * @author caceresc
 */
public class DepartamentoDto {
    private String codDep;
    private String nomDep;

    public DepartamentoDto(String codDep, String nomDep) {
        this.codDep = codDep;
        this.nomDep = nomDep;
    }

    public String getCodDep() throws Exception{
        if(codDep.isEmpty()){
            throw new Exception("codigo departamento vacio 4444");
         }
         return codDep;
    }

     public void setNomDep(String nomDep) {
        this.nomDep = nomDep;
    }
    
    public String getNomDep() {
        return nomDep;
    }
    
    public void setCodDep(String codDep) {
        this.codDep = codDep;
    }

   

   
  }
