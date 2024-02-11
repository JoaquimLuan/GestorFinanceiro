package action

import action.DTO.UsuariosDTO
import grails.gorm.transactions.Transactional
import tabela.Usuarios

class UsuariosController {

    UsuariosService usuariosService

    static allowedMethods = [
            listarUsuarios    : "GET",
            buscarUsuario     : "GET",
            salvarUsuario     : "POST",
            atualizarUsuario  : "PUT",
            deletarUsuario    : "DELETE",
            loginUsuario      : "POST"
    ]

    @Transactional
    List<UsuariosDTO> listarUsuarios() {
        respond (usuariosService.listarUsuarios()) as UsuariosDTO
    }

    @Transactional(readOnly = true)
    Usuarios buscarUsuario(String email) {
        usuariosService.buscarUsuarioPorEmail(email)
    }

    @Transactional
    Usuarios salvarUsuario() {
        def usuariosDTO = new UsuariosDTO(params.email, params.senha)
        respond (usuariosService.salvarUsuario(usuariosDTO)) as UsuariosDTO
    }

    @Transactional
    Usuarios atualizarUsuario() {
        def usuariosDTO = new UsuariosDTO(params.email, params.novaSenha)
        usuariosService.atualizarUsuario(usuariosDTO)
    }

    @Transactional
    void deletarUsuario() {
        usuariosService.deletarUsuario(params.email)
    }

    @Transactional
    def loginUsuario() {
        String email = params.email
        String senha = params.senha

        if (usuariosService.validarLogin(email, senha)) {
            redirect(uri: "/")
        } else {
            flash.message = "Email ou senha inválidos"
            redirect(uri: "/login")
        }
    }
}