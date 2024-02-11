package action

import grails.gorm.transactions.Transactional
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import action.DTO.ProducaoAgricolaDTO

@Transactional
@Service
class TotalValoresService {

    @Autowired
    TotalValoresDao totalValoresDao

    List<ProducaoAgricolaDTO> CustoTotal() {
        return totalValoresDao.CustoTotal()
    }

    List<ProducaoAgricolaDTO> ReceitaTotal() {
        return totalValoresDao.ReceitaTotal()
    }


}
