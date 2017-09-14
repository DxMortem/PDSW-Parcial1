/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.batchpasswordvalidator.test;

import edu.eci.arsw.batchpasswordvalidator.services.ISO3892PasswordValidator;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 * Diseño de pruebas:
 * 
 * Clases de equivalencia:
 *  
 *      CE1: Contrasena con uno o mas espacios 
 *           Resultado esperado: False.
 *          
 *      CE2: Contrasena con mas de 10 caracteres 
 *           Resultado esperado: True.
 * 
 *      CE3: Contrasena con menos de 10 caracteres y un caracter especial 
 *           Resultado esperado: True.
 * 
 *      CE4: Contrasena con mas de 10 caracteres y un caracter especial
 *           Resultado esperado: True.
 * 
 *      CE5: Contrasena con menos de 10 caracteres 
 *           Resultado esperado: False.
 * 
 *  
 * Condiciones de frontera:
 * 
 *      CF1: Contrasena con exactamente 10 caracteres.
 *           Clases de equivalencia relacionadas: CE5 y CE2
 *           Resultado esperado: False.
 * 
 *      CF2: Contrasena con exactamente 10 caracteres incluyendo un caracter especial.
 *           Clases de equivalencia relacionadas: CE3 y CE4
 *           Resultado esperado: True.
 * 
 * 
 */
public class ISO3892PasswordValidatorTest {
    
    static ISO3892PasswordValidator validator;
    
    public ISO3892PasswordValidatorTest() {
    }
    
    @BeforeClass
    public static void setUp() {
        validator = new ISO3892PasswordValidator();
    }
    
    @Test
    public void testCE1(){
        assertFalse("Se estan aceptando contrasenas con 1 espacio.",validator.validatePassword("asdf sdf"));        
        assertFalse("Se estan aceptando contrasenas con mas de 1 espacio.",validator.validatePassword("asdf sdf asdf sdf"));   
    } 
    
    @Test
    public void testCE2(){
        assertTrue("No se estan aceptando contrasenas con mas de 10 caracteres.",validator.validatePassword("12345678910"));        
    } 
    
    @Test
    public void testCE3(){
        assertTrue("No se estan aceptando contrasenas con menos de 10 caracteres y un caracter especial.",validator.validatePassword("123456@"));      
    } 
    
    @Test
    public void testCE4(){
        assertTrue("No se estan aceptando contrasenas con mas de 10 caracteres y un caracter especial.",validator.validatePassword("12345678910@"));      
    }
    
    @Test
    public void testCE5(){
        assertFalse("Se estan aceptando contrasenas con menos de 10 caracteres.",validator.validatePassword("123456"));      
    }
    
    @Test
    public void testCF1(){
        assertFalse("Se estan aceptando contrasenas con exactamente 10 caracteres.",validator.validatePassword("1234567891"));      
    }
    
    @Test
    public void testCF2(){
        assertTrue("No se estan aceptando contrasenas con exactamente 10 caracteres incluyendo un caracter especial.",validator.validatePassword("123456789@"));      
    }
}
