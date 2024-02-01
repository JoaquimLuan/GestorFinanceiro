package action


import grails.gorm.transactions.Transactional

class ProducaoAgricolaController {

    ProducaoAgricolaService producaoAgricolaService

    static allowedMethods = [
            retornaCustoSojaPorHectare                      : "GET",
    ]

    @Transactional
    List<Object[]> retornaCustoSojaPorHectare(){
        List<Object[]> resultado = producaoAgricolaService.retornaCustoSojaPorHectare()
        respond(resultado) as List<Object[]>
    }

}
