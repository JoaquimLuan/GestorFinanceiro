package tabela

import grails.gorm.annotation.Entity

@Entity
class Usuarios {

    String email
    String senha

    static constraints = {
        email(email: true, unique: true)
        senha(nullable: false)
    }

}
