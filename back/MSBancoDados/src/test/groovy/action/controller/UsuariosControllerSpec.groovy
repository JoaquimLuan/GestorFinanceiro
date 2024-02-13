package action.controller

import grails.testing.gorm.DataTest
import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification
import action.UsuariosService
import action.UsuariosDao
import action.UsuariosService
import action.UsuariosController
import spock.lang.Subject

class UsuariosControllerSpec extends Specification implements ControllerUnitTest<UsuariosController>, DataTest {

    @Subject
    UsuariosController usuariosController

    UsuariosService usuariosService = Mock()

    def setup() {
        usuariosController = new UsuariosController()
        usuariosController.usuariosService = usuariosService
    }

    def "teste listarUsuarios chama listarUsuarios da UsuariosService" () {
        when:
        usuariosController.listarUsuarios()

        then:
        1 * usuariosService.listarUsuarios()
    }

}
