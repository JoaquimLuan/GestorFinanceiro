package action

import grails.gorm.transactions.Transactional
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import action.DTO.ProducaoAgricolaDTO

@Transactional
@Service
class ReceitaPorFazendaService {

    @Autowired
    ReceitaPorFazendaDao receitaPorFazendaDao

    List<ProducaoAgricolaDTO> receitaFazendaA() {
        return receitaPorFazendaDao.receitaFazendaA()
    }

    List<ProducaoAgricolaDTO> receitaFazendaB() {
        return receitaPorFazendaDao.receitaFazendaB()
    }

    List<ProducaoAgricolaDTO> receitaFazendaC() {
        return receitaPorFazendaDao.receitaFazendaC()
    }

}
