package action

import action.DTO.ProducaoAgricolaDTO
import grails.gorm.transactions.Transactional

class ReceitaPorRegiaoController {

    ReceitaPorRegiaoService receitaPorRegiaoService

    static allowedMethods = [
            receitaRegiaoCentroOeste                   : "GET",
            receitaRegiaoSudeste                       : "GET",
            receitaRegiaoNorte                         : "GET",
            receitaRegiaoSul                           : "GET",
            receitaRegiaoNordeste                      : "GET"
    ]

    @Transactional
    List<ProducaoAgricolaDTO> receitaRegiaoCentroOeste() {
        respond (receitaPorRegiaoService.receitaRegiaoCentroOeste()) as ProducaoAgricolaDTO
    }

    @Transactional
    List<ProducaoAgricolaDTO> receitaRegiaoSudeste() {
        respond (receitaPorRegiaoService.receitaRegiaoSudeste()) as ProducaoAgricolaDTO
    }

    @Transactional
    List<ProducaoAgricolaDTO> receitaRegiaoNorte() {
        respond (receitaPorRegiaoService.receitaRegiaoNorte()) as ProducaoAgricolaDTO
    }

    @Transactional
    List<ProducaoAgricolaDTO> receitaRegiaoSul() {
        respond (receitaPorRegiaoService.receitaRegiaoSul()) as ProducaoAgricolaDTO
    }

    @Transactional
    List<ProducaoAgricolaDTO> receitaRegiaoNordeste() {
        respond (receitaPorRegiaoService.receitaRegiaoNordeste()) as ProducaoAgricolaDTO
    }
}
