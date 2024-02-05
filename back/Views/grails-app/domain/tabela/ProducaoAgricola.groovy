package tabela

import javax.persistence.*

@Table(name = 'producao_agricola')
class ProducaoAgricola {

    String regiao
    String manejo
    String cultura
    String unidade
    String discriminacao
    BigDecimal custoPorHectare
    BigDecimal custoPorSessentakg
    BigDecimal outros
    BigDecimal receita
    BigDecimal participacaoCv
    BigDecimal participacaoCt
    Integer safraAno
    BigDecimal valorFaturado

    static constraints = {
    }

    static mapping = {
        table name: 'producao_agricola'
        id column: 'id'
        regiao column: 'regiao'
        manejo column: 'manejo'
        cultura column: 'cultura'
        unidade column: 'unidade'
        discriminacao column: 'discriminacao'
        custoPorHectare column: 'custo_por_hectare'
        custoPorSessentakg column: 'custo_por_60kg'
        outros column: 'outros'
        receita column: 'receita'
        participacaoCv column: 'participacao_cv'
        participacaoCt column: 'participacao_ct'
        safraAno column: 'safra_ano'
        valorFaturado column: 'valor_faturado'
    }

}
