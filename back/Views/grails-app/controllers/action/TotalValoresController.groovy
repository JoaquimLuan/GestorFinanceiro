package action

import action.DTO.ProducaoAgricolaDTO
import grails.gorm.transactions.Transactional

class TotalValoresController {

    TotalValoresService totalValoresService

    static allowedMethods = [
            Receitatotal                :"GET",
            CustoTotal                  :"GET"
    ]

    @Transactional
    List<ProducaoAgricolaDTO> ReceitaTotal() {
        respond (totalValoresService.ReceitaTotal()) as ProducaoAgricolaDTO
    }

    @Transactional
    List<ProducaoAgricolaDTO> CustoTotal() {
        respond (totalValoresService.CustoTotal()) as ProducaoAgricolaDTO
    }

}
