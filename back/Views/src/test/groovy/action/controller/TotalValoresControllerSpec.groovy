package action.controller

import action.DTO.ProducaoAgricolaDTO
import action.TotalValoresController
import action.TotalValoresService
import grails.testing.gorm.DataTest
import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class TotalValoresControllerSpec extends Specification implements ControllerUnitTest<TotalValoresController>, DataTest {

    def "teste do método CustoTotal" () {
        given:
        TotalValoresController totalValoresController =  new TotalValoresController()
        TotalValoresService totalValoresServiceMock = Mock(TotalValoresService)
        totalValoresController.totalValoresService = totalValoresServiceMock

        when:
        List<ProducaoAgricolaDTO> result = totalValoresController.CustoTotal()

        then:
        1 * totalValoresServiceMock.CustoTotal() >> null
        assert result == null || result.isEmpty()
    }

    def "teste do método ReceitaTotal" () {
        given:
        TotalValoresController totalValoresController =  new TotalValoresController()
        TotalValoresService totalValoresServiceMock = Mock(TotalValoresService)
        totalValoresController.totalValoresService = totalValoresServiceMock

        when:
        List<ProducaoAgricolaDTO> result = totalValoresController.ReceitaTotal()

        then:
        1 * totalValoresServiceMock.ReceitaTotal() >> null
        assert result == null || result.isEmpty()
    }

}
