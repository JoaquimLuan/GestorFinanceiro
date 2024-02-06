package action.service

import action.CustoPorHectareDao
import action.CustoPorHectareService
import grails.testing.gorm.DataTest
import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification
import spock.lang.Subject

class CustoPorHectareServiceSpec extends Specification implements ControllerUnitTest<CustoPorHectareService>, DataTest {


    @Subject
    CustoPorHectareService custoPorHectareService

    CustoPorHectareDao custoPorHectareDao = Mock()

    def setup() {
        custoPorHectareService = new CustoPorHectareService()
        custoPorHectareService.custoPorHectareDao = custoPorHectareDao
    }

    def " Teste do método retornaCustoSojaPorHectare" () {

        when:
        def result = custoPorHectareService.retornaCustoSojaPorHectare()

        then:
        1 * custoPorHectareDao.retornaCustoSojaPorHectare()
    }

    def " Teste do método retornaCustoCafePorHectare" () {

        when:
        def result = custoPorHectareService.retornaCustoCafePorHectare()

        then:
        1 * custoPorHectareDao.retornaCustoCafePorHectare()
    }

    def " Teste do método retornaCustoAlgodaoPorHectare" () {

        when:
        def result = custoPorHectareService.retornaCustoAlgodaoPorHectare()

        then:
        1 * custoPorHectareDao.retornaCustoAlgodaoPorHectare()
    }

    def " Teste do método retornaCustoUvaPorHectare" () {

        when:
        def result = custoPorHectareService.retornaCustoUvaPorHectare()

        then:
        1 * custoPorHectareDao.retornaCustoUvaPorHectare()
    }

    def " Teste do método retornaCustoCanaDeAcucarPorHectare" () {

        when:
        def result = custoPorHectareService.retornaCustoCanaDeAcucarPorHectare()

        then:
        1 * custoPorHectareDao.retornaCustoCanaDeAcucarPorHectare()
    }

    def " Teste do método retornaCustoFeijaoPorHectare" () {

        when:
        def result = custoPorHectareService.retornaCustoFeijaoPorHectare()

        then:
        1 * custoPorHectareDao.retornaCustoFeijaoPorHectare()
    }

    def " Teste do método retornaCustoTomatePorHectare" () {

        when:
        def result = custoPorHectareService.retornaCustoTomatePorHectare()

        then:
        1 * custoPorHectareDao.retornaCustoTomatePorHectare()
    }

    def " Teste do método retornaCustoCacauPorHectare" () {

        when:
        def result = custoPorHectareService.retornaCustoCacauPorHectare()

        then:
        1 * custoPorHectareDao.retornaCustoCacauPorHectare()
    }

    def " Teste do método retornaCustoArrozPorHectare" () {

        when:
        def result = custoPorHectareService.retornaCustoArrozPorHectare()

        then:
        1 * custoPorHectareDao.retornaCustoArrozPorHectare()
    }

    def " Teste do método retornaCustoAbacaxiPorHectare" () {

        when:
        def result = custoPorHectareService.retornaCustoAbacaxiPorHectare()

        then:
        1 * custoPorHectareDao.retornaCustoAbacaxiPorHectare()
    }




}
