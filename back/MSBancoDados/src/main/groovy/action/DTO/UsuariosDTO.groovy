package action.DTO

import groovy.transform.CompileStatic
import groovy.transform.TupleConstructor

@CompileStatic
@TupleConstructor
class UsuariosDTO {

    String email
    String senha
    String status
    String message

    UsuariosDTO() {}

    UsuariosDTO(String email, String senha) {
        this.email = email
        this.senha = senha
    }

    UsuariosDTO(String email, String senha, String status, String message) {
        this.email = email
        this.senha = senha
        this.status = status
        this.message = message
    }
}
