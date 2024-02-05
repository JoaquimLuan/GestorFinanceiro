package action

import grails.gorm.transactions.Transactional
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import action.DTO.ProducaoAgricolaDTO

@Transactional
@Service
class CustoPorHectareService {

    @Autowired
    CustoPorHectareDao custoPorHectareDao

    List<ProducaoAgricolaDTO> retornaCustoSojaPorHectare() {
        return custoPorHectareDao.retornaCustoSojaPorHectare()
    }

    List<ProducaoAgricolaDTO> retornaCustoCafePorHectare() {
        return custoPorHectareDao.retornaCustoCafePorHectare()
    }

    List<ProducaoAgricolaDTO> retornaCustoAlgodaoPorHectare() {
        return custoPorHectareDao.retornaCustoAlgodaoPorHectare()
    }

    List<ProducaoAgricolaDTO> retornaCustoUvaPorHectare() {
        return custoPorHectareDao.retornaCustoUvaPorHectare()
    }

    List<ProducaoAgricolaDTO> retornaCustoCanaDeAcucarPorHectare() {
        return custoPorHectareDao.retornaCustoCanaDeAcucarPorHectare()
    }

    List<ProducaoAgricolaDTO> retornaCustoFeijaoPorHectare() {
        return custoPorHectareDao.retornaCustoFeijaoPorHectare()
    }

    List<ProducaoAgricolaDTO> retornaCustoTomatePorHectare() {
        return custoPorHectareDao.retornaCustoTomatePorHectare()
    }

    List<ProducaoAgricolaDTO> retornaCustoCacauPorHectare() {
        return custoPorHectareDao.retornaCustoCacauPorHectare()
    }

    List<ProducaoAgricolaDTO> retornaCustoArrozPorHectare() {
        return custoPorHectareDao.retornaCustoArrozPorHectare()
    }

    List<ProducaoAgricolaDTO> retornaCustoAbacaxiPorHectare() {
        return custoPorHectareDao.retornaCustoAbacaxiPorHectare()
    }

}
