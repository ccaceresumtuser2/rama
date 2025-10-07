/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udc.topico.isoft.proyectogitdemo.dto;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author caceresc
 */
public class EmpleadoDto {
    private String codigo;
    private String nomApel;
    private DepartamentoDto departamento;
    private int edad;
    public EmpleadoDto(String codigo, String nomApel, 
            DepartamentoDto departamento,int year,int month,int day) {
        this.codigo = codigo;
        this.nomApel = nomApel;
        this.departamento = departamento;
        calcularEdad(year,month,day);
     }

    public String getCodigo() throws Exception {
        if(codigo.isEmpty()){
            throw new Exception("atributo codigo vacio");
        }
        return codigo;
    }
    /**
     * valida entrada del Setter
     * @param codigo
     * @throws Exception 
     */
    public void setCodigo(String codigo) throws Exception{
           this.codigo = codigo;
    }

    public String getNomApel() {
        return nomApel;
    }

    public void setNomApel(String nomApel) throws Exception{
        if(nomApel.isEmpty()){
            throw new Exception("atributo nombre apellido vacio");
        }
          this.nomApel = nomApel;
    }

    public DepartamentoDto getDepartamento() {
        return departamento;
    }

    public void setDepartamento(DepartamentoDto departamento) {
        this.departamento = departamento;
    }
    /**
     * departamento es diferente de null
     * @return 
     */
    public boolean validarTrabajaEnDepartamento(){
        return (departamento!=null);
    }
    /**
     * metodo para calcular edad
     * @param year
     * @param month
     * @param day 
     */
    private void calcularEdad(int year,int month,int day){
        LocalDate nacimiento = LocalDate.of(year, month, day);
        LocalDate hoy = LocalDate.now();
        this.edad = Period.between(nacimiento, hoy).getYears();
        System.out.println("Edad: " + edad + " años");
    }
    /**
     * mostrar empleado
     */
    public void mostrar(){
        System.out.println(this.toString());
    }
}
