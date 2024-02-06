package action.controller

import action.CustoPorHectareController
import action.CustoPorHectareService
import action.DTO.ProducaoAgricolaDTO
import grails.testing.gorm.DataTest
import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class CustoPorHectareControllerSpec extends Specification implements ControllerUnitTest<CustoPorHectareController>, DataTest {

    def "teste do método retornaCustoSojaPorHectare" () {
        given:
        CustoPorHectareController custoPorHectareController =  new CustoPorHectareController()
        CustoPorHectareService custoPorHectareServiceMock = Mock(CustoPorHectareService)
        custoPorHectareController.custoPorHectareService = custoPorHectareServiceMock

        when:
        List<ProducaoAgricolaDTO> result = custoPorHectareController.retornaCustoSojaPorHectare()

        then:
        1 * custoPorHectareServiceMock.retornaCustoSojaPorHectare() >> null
        assert result == null || result.isEmpty()
    }

    def "teste do método retornaCustoCafePorHectare" () {
        given:
        CustoPorHectareController custoPorHectareController =  new CustoPorHectareController()
        CustoPorHectareService custoPorHectareServiceMock = Mock(CustoPorHectareService)
        custoPorHectareController.custoPorHectareService = custoPorHectareServiceMock

        when:
        List<ProducaoAgricolaDTO> result = custoPorHectareController.retornaCustoCafePorHectare()

        then:
        1 * custoPorHectareServiceMock.retornaCustoCafePorHectare() >> null
        assert result == null || result.isEmpty()
    }

    def "teste do método retornaCustoAlgodaoPorHectare" () {
        given:
        CustoPorHectareController custoPorHectareController =  new CustoPorHectareController()
        CustoPorHectareService custoPorHectareServiceMock = Mock(CustoPorHectareService)
        custoPorHectareController.custoPorHectareService = custoPorHectareServiceMock

        when:
        List<ProducaoAgricolaDTO> result = custoPorHectareController.retornaCustoAlgodaoPorHectare()

        then:
        1 * custoPorHectareServiceMock.retornaCustoAlgodaoPorHectare() >> null
        assert result == null || result.isEmpty()
    }

    def "teste do método retornaCustoUvaPorHectare" () {
        given:
        CustoPorHectareController custoPorHectareController =  new CustoPorHectareController()
        CustoPorHectareService custoPorHectareServiceMock = Mock(CustoPorHectareService)
        custoPorHectareController.custoPorHectareService = custoPorHectareServiceMock

        when:
        List<ProducaoAgricolaDTO> result = custoPorHectareController.retornaCustoUvaPorHectare()

        then:
        1 * custoPorHectareServiceMock.retornaCustoUvaPorHectare() >> null
        assert result == null || result.isEmpty()
    }

    def "teste do método retornaCustoCanaDeAcucarPorHectare" () {
        given:
        CustoPorHectareController custoPorHectareController =  new CustoPorHectareController()
        CustoPorHectareService custoPorHectareServiceMock = Mock(CustoPorHectareService)
        custoPorHectareController.custoPorHectareService = custoPorHectareServiceMock

        when:
        List<ProducaoAgricolaDTO> result = custoPorHectareController.retornaCustoCanaDeAcucarPorHectare()

        then:
        1 * custoPorHectareServiceMock.retornaCustoCanaDeAcucarPorHectare() >> null
        assert result == null || result.isEmpty()
    }

    def "teste do método retornaCustoFeijaoPorHectare" () {
        given:
        CustoPorHectareController custoPorHectareController =  new CustoPorHectareController()
        CustoPorHectareService custoPorHectareServiceMock = Mock(CustoPorHectareService)
        custoPorHectareController.custoPorHectareService = custoPorHectareServiceMock

        when:
        List<ProducaoAgricolaDTO> result = custoPorHectareController.retornaCustoFeijaoPorHectare()

        then:
        1 * custoPorHectareServiceMock.retornaCustoFeijaoPorHectare() >> null
        assert result == null || result.isEmpty()
    }

    def "teste do método retornaCustoTomatePorHectare" () {
        given:
        CustoPorHectareController custoPorHectareController =  new CustoPorHectareController()
        CustoPorHectareService custoPorHectareServiceMock = Mock(CustoPorHectareService)
        custoPorHectareController.custoPorHectareService = custoPorHectareServiceMock

        when:
        List<ProducaoAgricolaDTO> result = custoPorHectareController.retornaCustoTomatePorHectare()

        then:
        1 * custoPorHectareServiceMock.retornaCustoTomatePorHectare() >> null
        assert result == null || result.isEmpty()
    }

    def "teste do método retornaCustoCacauPorHectare" () {
        given:
        CustoPorHectareController custoPorHectareController =  new CustoPorHectareController()
        CustoPorHectareService custoPorHectareServiceMock = Mock(CustoPorHectareService)
        custoPorHectareController.custoPorHectareService = custoPorHectareServiceMock

        when:
        List<ProducaoAgricolaDTO> result = custoPorHectareController.retornaCustoCacauPorHectare()

        then:
        1 * custoPorHectareServiceMock.retornaCustoCacauPorHectare() >> null
        assert result == null || result.isEmpty()
    }

    def "teste do método retornaCustoArrozPorHectare" () {
        given:
        CustoPorHectareController custoPorHectareController =  new CustoPorHectareController()
        CustoPorHectareService custoPorHectareServiceMock = Mock(CustoPorHectareService)
        custoPorHectareController.custoPorHectareService = custoPorHectareServiceMock

        when:
        List<ProducaoAgricolaDTO> result = custoPorHectareController.retornaCustoArrozPorHectare()

        then:
        1 * custoPorHectareServiceMock.retornaCustoArrozPorHectare() >> null
        assert result == null || result.isEmpty()
    }

    def "teste do método retornaCustoAbacaxiPorHectare" () {
        given:
        CustoPorHectareController custoPorHectareController =  new CustoPorHectareController()
        CustoPorHectareService custoPorHectareServiceMock = Mock(CustoPorHectareService)
        custoPorHectareController.custoPorHectareService = custoPorHectareServiceMock

        when:
        List<ProducaoAgricolaDTO> result = custoPorHectareController.retornaCustoAbacaxiPorHectare()

        then:
        1 * custoPorHectareServiceMock.retornaCustoAbacaxiPorHectare() >> null
        assert result == null || result.isEmpty()
    }



}
