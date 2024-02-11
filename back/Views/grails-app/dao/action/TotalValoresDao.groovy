package action

import action.DTO.ProducaoAgricolaDTO
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository
import tabela.ProducaoAgricola

@Repository
@Component
class TotalValoresDao {

    List<ProducaoAgricolaDTO> CustoTotal(){
        String hql = """
                     SELECT
                         SUM(producaoAgricola.custoPorHectare) AS totalCusto
                     FROM ProducaoAgricola AS producaoAgricola
                     """
        List<ProducaoAgricolaDTO> resultado = ProducaoAgricola.executeQuery(hql)
        return resultado
    }

    List<ProducaoAgricolaDTO> ReceitaTotal() {
        String hql = """
                     SELECT
                         SUM(producaoAgricola.receita) AS totalReceita
                     FROM ProducaoAgricola AS producaoAgricola
                     """
        List<ProducaoAgricolaDTO> resultado = ProducaoAgricola.executeQuery(hql)
        return resultado
    }


}
