/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.invistafacil.business.interfaces;

import br.com.invistafacil.dominio.Usuario;

/**
 *
 * @author George Alan
 */
public interface PerfilUserInterface {
    
    //Método responsável por fazer o update das informações pessoais do usuário na database.
    public Usuario updateUsuario(Usuario usuario);    
}
