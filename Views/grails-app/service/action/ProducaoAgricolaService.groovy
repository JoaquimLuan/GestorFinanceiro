package action

import grails.gorm.transactions.Transactional
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Transactional
@Service
class ProducaoAgricolaService {

    @Autowired
    ProducaoAgricolaDao producaoAgricolaDao

    List retornaCustoSojaPorHectare(){
        return producaoAgricolaDao.retornaCustoSojaPorHectare()
    }

}
