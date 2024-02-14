package action.service

import action.ReceitaPorRegiaoDao
import action.ReceitaPorRegiaoService
import grails.testing.gorm.DataTest
import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification
import spock.lang.Subject

class ReceitaPorRegiaoServiceSpec extends Specification implements ControllerUnitTest<ReceitaPorRegiaoService>, DataTest {

    @Subject
    ReceitaPorRegiaoService receitaPorRegiaoService
    ReceitaPorRegiaoDao receitaPorRegiaoDao = Mock()

    def setup() {
        receitaPorRegiaoService = new ReceitaPorRegiaoService()
        receitaPorRegiaoService.receitaPorRegiaoDao = receitaPorRegiaoDao
    }

    def " Teste do método receitaRegiaoCentroOeste" () {

        when:
        def result = receitaPorRegiaoService.receitaRegiaoCentroOeste()

        then:
        1 * receitaPorRegiaoDao.receitaRegiaoCentroOeste()
    }

    def " Teste do método receitaRegiaoSudeste" () {

        when:
        def result = receitaPorRegiaoService.receitaRegiaoSudeste()

        then:
        1 * receitaPorRegiaoDao.receitaRegiaoSudeste()
    }

    def " Teste do método receitaRegiaoNorte" () {

        when:
        def result = receitaPorRegiaoService.receitaRegiaoNorte()

        then:
        1 * receitaPorRegiaoDao.receitaRegiaoNorte()
    }

    def " Teste do método receitaRegiaoSul" () {

        when:
        def result = receitaPorRegiaoService.receitaRegiaoSul()

        then:
        1 * receitaPorRegiaoDao.receitaRegiaoSul()
    }

    def " Teste do método receitaRegiaoNordeste" () {

        when:
        def result = receitaPorRegiaoService.receitaRegiaoNordeste()

        then:
        1 * receitaPorRegiaoDao.receitaRegiaoNordeste()
    }

}
