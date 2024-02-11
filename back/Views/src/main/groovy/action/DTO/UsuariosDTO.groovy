package action.DTO

import groovy.transform.CompileStatic
import groovy.transform.TupleConstructor

@CompileStatic
@TupleConstructor
class UsuariosDTO {

    String email
    String senha


    UsuariosDTO (String email,
                 String senha
    ) {
        this.email= email
        this.senha = senha
    }
}
