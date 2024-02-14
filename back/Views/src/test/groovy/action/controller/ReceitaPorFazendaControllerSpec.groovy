package action.controller

import action.ReceitaPorFazendaController
import action.ReceitaPorFazendaService
import action.DTO.ProducaoAgricolaDTO
import grails.testing.gorm.DataTest
import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class ReceitaPorFazendaControllerSpec extends Specification implements ControllerUnitTest<ReceitaPorFazendaController>, DataTest {

    def "teste do método receitaFazendaA" () {
        given:
        ReceitaPorFazendaController receitaPorFazendaController =  new ReceitaPorFazendaController()
        ReceitaPorFazendaService receitaPorFazendaServiceMock = Mock(ReceitaPorFazendaService)
        receitaPorFazendaController.receitaPorFazendaService = receitaPorFazendaServiceMock

        when:
        List<ProducaoAgricolaDTO> result = receitaPorFazendaController.receitaFazendaA()

        then:
        1 * receitaPorFazendaServiceMock.receitaFazendaA() >> null
        assert result == null || result.isEmpty()
    }

    def "teste do método receitaFazendaB" () {
        given:
        ReceitaPorFazendaController receitaPorFazendaController =  new ReceitaPorFazendaController()
        ReceitaPorFazendaService receitaPorFazendaServiceMock = Mock(ReceitaPorFazendaService)
        receitaPorFazendaController.receitaPorFazendaService = receitaPorFazendaServiceMock

        when:
        List<ProducaoAgricolaDTO> result = receitaPorFazendaController.receitaFazendaB()

        then:
        1 * receitaPorFazendaServiceMock.receitaFazendaB() >> null
        assert result == null || result.isEmpty()
    }

    def "teste do método receitaFazendaC" () {
        given:
        ReceitaPorFazendaController receitaPorFazendaController =  new ReceitaPorFazendaController()
        ReceitaPorFazendaService receitaPorFazendaServiceMock = Mock(ReceitaPorFazendaService)
        receitaPorFazendaController.receitaPorFazendaService = receitaPorFazendaServiceMock

        when:
        List<ProducaoAgricolaDTO> result = receitaPorFazendaController.receitaFazendaC()

        then:
        1 * receitaPorFazendaServiceMock.receitaFazendaC() >> null
        assert result == null || result.isEmpty()
    }


}



