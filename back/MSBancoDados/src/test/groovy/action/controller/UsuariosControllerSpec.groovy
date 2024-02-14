package action.controller

import grails.testing.gorm.DataTest
import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification
import spock.lang.Subject
import spock.mock.DetachedMockFactory
import action.UsuariosService
import action.UsuariosDao
import action.UsuariosService
import action.UsuariosController

class UsuariosControllerSpec extends Specification implements ControllerUnitTest<UsuariosController>, DataTest {

    @Subject
    UsuariosController usuariosController
    UsuariosService usuariosService = Mock()

    def setup() {
        usuariosController = new UsuariosController()
        usuariosController.usuariosService = usuariosService
    }

    def "testar se listarUsuarios chama listarUsuarios da UsuariosService"() {
        when:
        usuariosController.listarUsuarios()

        then:
        1 * usuariosService.listarUsuarios()
    }

//    def "testar se buscarUsuario chama buscarUsuarioPorEmail da UsuariosService" () {
//        given:
//        def email = "exemplo@email.com"
//
//        when:
//        usuariosController.buscarUsuario()
//
//        then:
//        1 * usuariosService.buscarUsuarioPorEmail(email)
//    }
//
//    def "testar se salvarUsuario chama salvarUsuario da UsuariosService" () {
//        given:
//        def email = "exemplo@email.com"
//        def senha = "senha123"
//
//        when:
//        usuariosController.salvarUsuario(email, senha)
//
//        then:
//        1 * usuariosService.salvarUsuario(email, senha)
//    }
//
//    def "testar se atualizarUsuario chama atualizarUsuario da UsuariosService" () {
//        given:
//        def email = "exemplo@email.com"
//        def senha = "senha123"
//
//        when:
//        usuariosController.atualizarUsuario(email, senha)
//
//        then:
//        1 * usuariosService.atualizarUsuario(email, senha)
//    }
//
//    def "testar se deletarUsuario chama deletarUsuario da UsuariosService" () {
//        given:
//        def email = "exemplo@email.com"
//
//        when:
//        usuariosController.deletarUsuario(email)
//
//        then:
//        1 * usuariosService.deletarUsuario(email)
//    }
}