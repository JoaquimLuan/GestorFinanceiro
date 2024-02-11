package action

import action.DTO.ProducaoAgricolaDTO
import grails.gorm.transactions.Transactional

class ReceitaPorFazendaController {

    ReceitaPorFazendaService receitaPorFazendaService

    static allowedMethods = [
            receitaFacendaA                       : "GET",
            receitaFacendaB                       : "GET",
            receitaFacendaC                       : "GET"
    ]

    @Transactional
    List<ProducaoAgricolaDTO> receitaFazendaA() {
        respond (receitaPorFazendaService.receitaFazendaA()) as ProducaoAgricolaDTO
    }

    @Transactional
    List<ProducaoAgricolaDTO> receitaFazendaB() {
        respond (receitaPorFazendaService.receitaFazendaB()) as ProducaoAgricolaDTO
    }

    @Transactional
    List<ProducaoAgricolaDTO> receitaFazendaC() {
        respond (receitaPorFazendaService.receitaFazendaC()) as ProducaoAgricolaDTO
    }
}
