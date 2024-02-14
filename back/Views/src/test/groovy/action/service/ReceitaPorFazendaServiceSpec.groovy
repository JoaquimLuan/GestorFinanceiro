package action.service


import action.ReceitaPorFazendaService
import action.ReceitaPorFazendaDao
import grails.testing.gorm.DataTest
import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification
import spock.lang.Subject

class ReceitaPorFazendaServiceSpec extends Specification implements ControllerUnitTest<ReceitaPorFazendaService>, DataTest{

    @Subject
    ReceitaPorFazendaService receitaPorFazendaService

    ReceitaPorFazendaDao receitaPorFazendaDao = Mock()

    def setup() {
        receitaPorFazendaService = new ReceitaPorFazendaService()
        receitaPorFazendaService.receitaPorFazendaDao = receitaPorFazendaDao
    }

    def " Teste do método receitaFazendaA" () {

        when:
        def result = receitaPorFazendaService.receitaFazendaA()

        then:
        1 * receitaPorFazendaDao.receitaFazendaA()
    }

    def " Teste do método receitaFazendaB" () {

        when:
        def result = receitaPorFazendaService.receitaFazendaB()

        then:
        1 * receitaPorFazendaDao.receitaFazendaB()
    }

    def " Teste do método receitaFazendaC" () {

        when:
        def result = receitaPorFazendaService.receitaFazendaC()

        then:
        1 * receitaPorFazendaDao.receitaFazendaC()
    }



}
