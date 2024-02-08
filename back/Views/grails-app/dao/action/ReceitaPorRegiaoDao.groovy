package action

import action.DTO.ProducaoAgricolaDTO
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository
import tabela.ProducaoAgricola

@Repository
@Component
class ReceitaPorRegiaoDao {

    List<ProducaoAgricolaDTO> receitaRegiaoCentroOeste() {
        String hql = """
                   SELECT
                       producaoAgricola.regiao,
                       SUM(producaoAgricola.custoPorHectare) AS totalCustoPorHectare,
                       SUM(producaoAgricola.valorFaturado) AS totalValorFaturado,
                       SUM(producaoAgricola.receita) AS totalReceita
                   FROM ProducaoAgricola AS producaoAgricola
                   WHERE producaoAgricola.regiao = 'Centro-Oeste'
                   GROUP BY producaoAgricola.regiao
                     """
        List<ProducaoAgricolaDTO> resultado = ProducaoAgricola.executeQuery(hql)
        return resultado
    }

    List<ProducaoAgricolaDTO> receitaRegiaoSudeste() {
        String hql = """
                     """
        List<ProducaoAgricolaDTO> resultado = ProducaoAgricola.executeQuery(hql)
        return resultado
    }

    List<ProducaoAgricolaDTO> receitaRegiaoNorte() {
        String hql = """
                     """
        List<ProducaoAgricolaDTO> resultado = ProducaoAgricola.executeQuery(hql)
        return resultado
    }

    List<ProducaoAgricolaDTO> receitaRegiaoSul() {
        String hql = """
                     """
        List<ProducaoAgricolaDTO> resultado = ProducaoAgricola.executeQuery(hql)
        return resultado
    }

    List<ProducaoAgricolaDTO> receitaRegiaoNordeste() {
        String hql = """
                     """
        List<ProducaoAgricolaDTO> resultado = ProducaoAgricola.executeQuery(hql)
        return resultado
    }
}
