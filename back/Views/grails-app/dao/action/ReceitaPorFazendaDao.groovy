package action

import action.DTO.ProducaoAgricolaDTO
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository
import tabela.ProducaoAgricola

@Repository
@Component
class ReceitaPorFazendaDao {

    List<ProducaoAgricolaDTO> receitaFazendaA() {
        String hql = """
                   SELECT
                       producaoAgricola.unidade,
                       SUM(producaoAgricola.custoPorHectare) AS totalCustoPorHectare,
                       SUM(producaoAgricola.valorFaturado) AS totalValorFaturado,
                       SUM(producaoAgricola.receita) AS totalReceita
                   FROM ProducaoAgricola AS producaoAgricola
                   WHERE producaoAgricola.regiao = 'fazenda A'
                   GROUP BY producaoAgricola.unidade
                     """
        List<ProducaoAgricolaDTO> resultado = ProducaoAgricola.executeQuery(hql)
        return resultado
    }

    List<ProducaoAgricolaDTO> receitaFazendaB() {
        String hql = """
                   SELECT
                       producaoAgricola.unidade,
                       SUM(producaoAgricola.custoPorHectare) AS totalCustoPorHectare,
                       SUM(producaoAgricola.valorFaturado) AS totalValorFaturado,
                       SUM(producaoAgricola.receita) AS totalReceita
                   FROM ProducaoAgricola AS producaoAgricola
                   WHERE producaoAgricola.regiao = 'fazenda B'
                   GROUP BY producaoAgricola.unidade
                     """
        List<ProducaoAgricolaDTO> resultado = ProducaoAgricola.executeQuery(hql)
        return resultado
    }

    List<ProducaoAgricolaDTO> receitaFazendaC() {
        String hql = """
                    SELECT
                       producaoAgricola.unidade,
                       SUM(producaoAgricola.custoPorHectare) AS totalCustoPorHectare,
                       SUM(producaoAgricola.valorFaturado) AS totalValorFaturado,
                       SUM(producaoAgricola.receita) AS totalReceita
                   FROM ProducaoAgricola AS producaoAgricola
                   WHERE producaoAgricola.regiao = 'fazenda C'
                   GROUP BY producaoAgricola.unidade
                     """
        List<ProducaoAgricolaDTO> resultado = ProducaoAgricola.executeQuery(hql)
        return resultado
    }

}
