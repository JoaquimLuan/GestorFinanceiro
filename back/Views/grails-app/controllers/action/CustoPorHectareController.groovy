package action

import action.DTO.ProducaoAgricolaDTO
import grails.gorm.transactions.Transactional

class CustoPorHectareController {

    CustoPorHectareService custoPorHectareService

    static allowedMethods = [
            retornaCustoSojaPorHectare                      : "GET",
            retornaCustoCafePorHectare                      : "GET",
            retornaCustoAlgodaoPorHectare                   : "GET",
            retornaCustoUvaPorHectare                       : "GET",
            retornaCustoCanaDeAcucarPorHectare              : "GET",
            retornaCustoFeijaoPorHectare                    : "GET",
            retornaCustoTomatePorHectare                    : "GET",
            retornaCustoCacauPorHectare                     : "GET",
            retornaCustoArrozPorHectare                     : "GET",
            retornaCustoAbacaxiPorHectare                   : "GET"
    ]

    @Transactional
    List<ProducaoAgricolaDTO> retornaCustoSojaPorHectare() {
       respond (custoPorHectareService.retornaCustoSojaPorHectare()) as ProducaoAgricolaDTO
    }

    @Transactional
    List<ProducaoAgricolaDTO> retornaCustoCafePorHectare() {
        respond (custoPorHectareService.retornaCustoCafePorHectare()) as ProducaoAgricolaDTO
    }

    @Transactional
    List<ProducaoAgricolaDTO> retornaCustoAlgodaoPorHectare() {
        respond (custoPorHectareService.retornaCustoAlgodaoPorHectare()) as ProducaoAgricolaDTO
    }

    @Transactional
    List<ProducaoAgricolaDTO> retornaCustoUvaPorHectare() {
        respond (custoPorHectareService.retornaCustoUvaPorHectare()) as ProducaoAgricolaDTO
    }

    @Transactional
    List<ProducaoAgricolaDTO> retornaCustoCanaDeAcucarPorHectare() {
        respond (custoPorHectareService.retornaCustoCanaDeAcucarPorHectare()) as ProducaoAgricolaDTO
    }

    @Transactional
    List<ProducaoAgricolaDTO> retornaCustoFeijaoPorHectare() {
        respond (custoPorHectareService.retornaCustoFeijaoPorHectare()) as ProducaoAgricolaDTO
    }

    @Transactional
    List<ProducaoAgricolaDTO> retornaCustoTomatePorHectare() {
        respond (custoPorHectareService.retornaCustoTomatePorHectare()) as ProducaoAgricolaDTO
    }

    @Transactional
    List<ProducaoAgricolaDTO> retornaCustoCacauPorHectare() {
        respond (custoPorHectareService.retornaCustoCacauPorHectare()) as ProducaoAgricolaDTO
    }
    @Transactional
    List<ProducaoAgricolaDTO> retornaCustoArrozPorHectare() {
        respond (custoPorHectareService.retornaCustoArrozPorHectare()) as ProducaoAgricolaDTO
    }

    @Transactional
    List<ProducaoAgricolaDTO> retornaCustoAbacaxiPorHectare() {
        respond (custoPorHectareService.retornaCustoAbacaxiPorHectare()) as ProducaoAgricolaDTO
    }

}
