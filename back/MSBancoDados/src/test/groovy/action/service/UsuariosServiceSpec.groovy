package action.service

import grails.testing.gorm.DataTest
import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification
import spock.lang.Subject
import action.UsuariosService
import action.UsuariosDao


class UsuariosServiceSpec extends Specification implements ControllerUnitTest<UsuariosService>, DataTest {


    @Subject
    UsuariosService usuariosService

    UsuariosDao usuariosDao = Mock()

    def setup() {
        usuariosService = new UsuariosService()
        usuariosService.usuariosDao = usuariosDao
    }

    def "teste buscarUsuarioPorEmail chama buscarUsuarioPorEmail da UsuariosDao" () {
        given:
        String email = "test@example.com"

        when:
        def result = usuariosService.buscarUsuarioPorEmail(email)

        then:
        1 * usuariosDao.buscarUsuarioPorEmail(email)
    }

}
