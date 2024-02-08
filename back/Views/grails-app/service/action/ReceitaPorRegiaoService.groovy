package action

import grails.gorm.transactions.Transactional
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import action.DTO.ProducaoAgricolaDTO

@Transactional
@Service

class ReceitaPorRegiaoService {

    @Autowired
    ReceitaPorRegiaoDao receitaPorRegiaoDao

    List<ProducaoAgricolaDTO> receitaRegiaoCentroOeste() {
        return receitaPorRegiaoDao.receitaRegiaoCentroOeste()
    }

    List<ProducaoAgricolaDTO> receitaRegiaoSudeste() {
        return receitaPorRegiaoDao.receitaRegiaoSudeste()
    }

    List<ProducaoAgricolaDTO> receitaRegiaoNorte() {
        return receitaPorRegiaoDao.receitaRegiaoNorte()
    }

    List<ProducaoAgricolaDTO> receitaRegiaoSul() {
        return receitaPorRegiaoDao.receitaRegiaoSul()
    }

    List<ProducaoAgricolaDTO> receitaRegiaoNordeste() {
        return receitaPorRegiaoDao.receitaRegiaoNordeste()
    }
}
