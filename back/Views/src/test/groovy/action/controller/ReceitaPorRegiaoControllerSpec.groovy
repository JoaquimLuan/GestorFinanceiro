package action.controller

import action.DTO.ProducaoAgricolaDTO
import action.ReceitaPorFazendaController
import action.ReceitaPorRegiaoController
import action.ReceitaPorRegiaoService
import grails.testing.gorm.DataTest
import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class ReceitaPorRegiaoControllerSpec extends Specification implements ControllerUnitTest<ReceitaPorRegiaoController>, DataTest {

    def "teste do método receitaRegiaoCentroOeste" () {
        given:
        ReceitaPorRegiaoController receitaPorRegiaoController =  new ReceitaPorRegiaoController()
        ReceitaPorRegiaoService receitaPorRegiaoServiceMock = Mock(ReceitaPorRegiaoService)
        receitaPorRegiaoController.receitaPorRegiaoService = receitaPorRegiaoServiceMock

        when:
        List<ProducaoAgricolaDTO> result = receitaPorRegiaoController.receitaRegiaoCentroOeste()

        then:
        1 * receitaPorRegiaoServiceMock.receitaRegiaoCentroOeste() >> null
        assert result == null || result.isEmpty()
    }

    def "teste do método receitaRegiaoSudeste" () {
        given:
        ReceitaPorRegiaoController receitaPorRegiaoController =  new ReceitaPorRegiaoController()
        ReceitaPorRegiaoService receitaPorRegiaoServiceMock = Mock(ReceitaPorRegiaoService)
        receitaPorRegiaoController.receitaPorRegiaoService = receitaPorRegiaoServiceMock

        when:
        List<ProducaoAgricolaDTO> result = receitaPorRegiaoController.receitaRegiaoSudeste()

        then:
        1 * receitaPorRegiaoServiceMock.receitaRegiaoSudeste() >> null
        assert result == null || result.isEmpty()
    }

    def "teste do método receitaRegiaoNorte" () {
        given:
        ReceitaPorRegiaoController receitaPorRegiaoController =  new ReceitaPorRegiaoController()
        ReceitaPorRegiaoService receitaPorRegiaoServiceMock = Mock(ReceitaPorRegiaoService)
        receitaPorRegiaoController.receitaPorRegiaoService = receitaPorRegiaoServiceMock

        when:
        List<ProducaoAgricolaDTO> result = receitaPorRegiaoController.receitaRegiaoNorte()

        then:
        1 * receitaPorRegiaoServiceMock.receitaRegiaoNorte() >> null
        assert result == null || result.isEmpty()
    }

    def "teste do método receitaRegiaoSul" () {
        given:
        ReceitaPorRegiaoController receitaPorRegiaoController =  new ReceitaPorRegiaoController()
        ReceitaPorRegiaoService receitaPorRegiaoServiceMock = Mock(ReceitaPorRegiaoService)
        receitaPorRegiaoController.receitaPorRegiaoService = receitaPorRegiaoServiceMock

        when:
        List<ProducaoAgricolaDTO> result = receitaPorRegiaoController.receitaRegiaoSul()

        then:
        1 * receitaPorRegiaoServiceMock.receitaRegiaoSul() >> null
        assert result == null || result.isEmpty()
    }

    def "teste do método receitaRegiaoNordeste" () {
        given:
        ReceitaPorRegiaoController receitaPorRegiaoController =  new ReceitaPorRegiaoController()
        ReceitaPorRegiaoService receitaPorRegiaoServiceMock = Mock(ReceitaPorRegiaoService)
        receitaPorRegiaoController.receitaPorRegiaoService = receitaPorRegiaoServiceMock

        when:
        List<ProducaoAgricolaDTO> result = receitaPorRegiaoController.receitaRegiaoNordeste()

        then:
        1 * receitaPorRegiaoServiceMock.receitaRegiaoNordeste() >> null
        assert result == null || result.isEmpty()
    }
}
