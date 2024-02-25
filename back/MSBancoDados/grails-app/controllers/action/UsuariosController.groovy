package action

import action.DTO.UsuariosDTO
import grails.gorm.transactions.Transactional
import tabela.Usuarios
import grails.plugin.springsecurity.annotation.Secured

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
        respond usuariosService.listarUsuarios()
    }

    @Transactional
    List<UsuariosDTO> buscarUsuario() {
        def email = params.email
        respond usuariosService.buscarUsuarioPorEmail(email)
    }

    @Transactional
    Usuarios salvarUsuario(String email, String senha) {
        def usuariosDTO = new UsuariosDTO(email, senha)
        respond usuariosService.salvarUsuario(usuariosDTO)
    }

    @Transactional
    Usuarios atualizarUsuario(String email, String senha) {
        respond usuariosService.atualizarUsuario(email, senha)
    }

    @Transactional
    Usuarios deletarUsuario(String email) {
       respond usuariosService.deletarUsuario(email)
    }

    @Secured('permitAll')
    @Transactional
    def loginUsuario() {
        String email = params.email
        String senha = params.senha

        if (usuariosService.validarLogin(email, senha)) {
            def token = usuariosService.gerarTokenAcesso(email)
            render status: 200, contentType: "application/json", text: "{\"token\": \"$token\"}"
        } else {
            render status: 401, contentType: "application/json", text: '{"status": "Erro", "message": "Email ou senha inválidos"}'
        }
    }
}
