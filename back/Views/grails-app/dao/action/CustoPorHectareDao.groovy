package action

import action.DTO.ProducaoAgricolaDTO
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository
import tabela.ProducaoAgricola

@Repository
@Component
class CustoPorHectareDao {

    List<ProducaoAgricolaDTO> retornaCustoSojaPorHectare() {
        String hql = """
                    SELECT 
                        producaoAgricola.cultura, 
                        producaoAgricola.unidade, 
                        producaoAgricola.custoPorHectare, 
                        producaoAgricola.safraAno, 
                        producaoAgricola.valorFaturado
                    FROM ProducaoAgricola AS producaoAgricola
                    WHERE producaoAgricola.cultura = 'Soja'
                    """
        List<ProducaoAgricolaDTO> resultado = ProducaoAgricola.executeQuery(hql)
        return resultado
    }

    List <ProducaoAgricolaDTO> retornaCustoCafePorHectare() {
        String hql = """
                     SELECT 
                        producaoAgricola.cultura, 
                        producaoAgricola.unidade, 
                        producaoAgricola.custoPorHectare, 
                        producaoAgricola.safraAno, 
                        producaoAgricola.valorFaturado
                    FROM ProducaoAgricola AS producaoAgricola
                    WHERE producaoAgricola.cultura = 'Café'
                     """
        List<ProducaoAgricolaDTO> resultado = ProducaoAgricola.executeQuery(hql)
        return resultado
    }

    List<ProducaoAgricolaDTO> retornaCustoAlgodaoPorHectare() {
        String hql = """
                     SELECT 
                        producaoAgricola.cultura, 
                        producaoAgricola.unidade, 
                        producaoAgricola.custoPorHectare, 
                        producaoAgricola.safraAno, 
                        producaoAgricola.valorFaturado
                    FROM ProducaoAgricola AS producaoAgricola
                    WHERE producaoAgricola.cultura = 'Algodão'
                     """
        List<ProducaoAgricolaDTO> resultado = ProducaoAgricola.executeQuery(hql)
        return resultado
    }

    List<ProducaoAgricolaDTO> retornaCustoUvaPorHectare(){
        String hql = """
                     SELECT 
                        producaoAgricola.cultura, 
                        producaoAgricola.unidade, 
                        producaoAgricola.custoPorHectare, 
                        producaoAgricola.safraAno, 
                        producaoAgricola.valorFaturado
                    FROM ProducaoAgricola AS producaoAgricola
                    WHERE producaoAgricola.cultura = 'Uva'
                     """
        List<ProducaoAgricolaDTO> resultado = ProducaoAgricola.executeQuery(hql)
        return resultado
    }

    List<ProducaoAgricolaDTO> retornaCustoCanaDeAcucarPorHectare(){
        String hql = """
                    SELECT 
                        producaoAgricola.cultura, 
                        producaoAgricola.unidade, 
                        producaoAgricola.custoPorHectare, 
                        producaoAgricola.safraAno, 
                        producaoAgricola.valorFaturado
                    FROM ProducaoAgricola AS producaoAgricola
                    WHERE producaoAgricola.cultura = 'Cana-de-Açúcar'
                    """
        List<ProducaoAgricolaDTO> resultado = ProducaoAgricola.executeQuery(hql)
        return resultado
    }

    List<ProducaoAgricolaDTO> retornaCustoFeijaoPorHectare(){
        String hql = """
                   SELECT 
                        producaoAgricola.cultura, 
                        producaoAgricola.unidade, 
                        producaoAgricola.custoPorHectare, 
                        producaoAgricola.safraAno, 
                        producaoAgricola.valorFaturado
                    FROM ProducaoAgricola AS producaoAgricola
                    WHERE producaoAgricola.cultura = 'Feijão'
                   """
        List<ProducaoAgricolaDTO> resultado = ProducaoAgricola.executeQuery(hql)
        return resultado
    }

    List<ProducaoAgricolaDTO> retornaCustoTomatePorHectare() {
        String hql = """
                   SELECT 
                        producaoAgricola.cultura, 
                        producaoAgricola.unidade, 
                        producaoAgricola.custoPorHectare, 
                        producaoAgricola.safraAno, 
                        producaoAgricola.valorFaturado
                    FROM ProducaoAgricola AS producaoAgricola
                    WHERE producaoAgricola.cultura = 'Tomate'
                   """
        List<ProducaoAgricolaDTO> resultado = ProducaoAgricola.executeQuery(hql)
        return resultado
    }

    List<ProducaoAgricolaDTO> retornaCustoCacauPorHectare() {
        String hql = """
                   SELECT 
                        producaoAgricola.cultura, 
                        producaoAgricola.unidade, 
                        producaoAgricola.custoPorHectare, 
                        producaoAgricola.safraAno, 
                        producaoAgricola.valorFaturado
                    FROM ProducaoAgricola AS producaoAgricola
                    WHERE producaoAgricola.cultura = 'Cacau'
                   """
        List<ProducaoAgricolaDTO> resultado = ProducaoAgricola.executeQuery(hql)
        return resultado
    }

    List<ProducaoAgricolaDTO> retornaCustoArrozPorHectare() {
        String hql = """
                   SELECT 
                        producaoAgricola.cultura, 
                        producaoAgricola.unidade, 
                        producaoAgricola.custoPorHectare, 
                        producaoAgricola.safraAno, 
                        producaoAgricola.valorFaturado
                    FROM ProducaoAgricola AS producaoAgricola
                    WHERE producaoAgricola.cultura = 'Arroz'
                   """
        List<ProducaoAgricolaDTO> resultado = ProducaoAgricola.executeQuery(hql)
        return resultado
    }

    List<ProducaoAgricolaDTO> retornaCustoAbacaxiPorHectare() {
        String hql = """
                   SELECT 
                        producaoAgricola.cultura, 
                        producaoAgricola.unidade, 
                        producaoAgricola.custoPorHectare, 
                        producaoAgricola.safraAno, 
                        producaoAgricola.valorFaturado
                    FROM ProducaoAgricola AS producaoAgricola
                    WHERE producaoAgricola.cultura = 'Abacaxi'
                   """
        List<ProducaoAgricolaDTO> resultado = ProducaoAgricola.executeQuery(hql)
        return resultado
    }
}
