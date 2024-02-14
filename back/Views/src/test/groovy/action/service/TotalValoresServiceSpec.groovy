package action.service

import action.TotalValoresDao
import action.TotalValoresService
import grails.testing.gorm.DataTest
import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification
import spock.lang.Subject

class TotalValoresServiceSpec extends Specification implements ControllerUnitTest<TotalValoresService>, DataTest {

    @Subject
    TotalValoresService totalValoresService
    TotalValoresDao totalValoresDao = Mock()

    def setup() {
        totalValoresService = new TotalValoresService()
        totalValoresService.totalValoresDao = totalValoresDao
    }

    def " Teste do método receitaTotal" () {

        when:
        def result = totalValoresService.ReceitaTotal()

        then:
        1 * totalValoresDao.ReceitaTotal()
    }

    def " Teste do método custoTotal" () {

        when:
        def result = totalValoresService.CustoTotal()

        then:
        1 * totalValoresDao.CustoTotal()
    }

}
