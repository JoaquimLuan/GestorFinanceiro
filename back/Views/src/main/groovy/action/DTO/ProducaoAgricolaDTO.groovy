package action.DTO

import groovy.transform.CompileStatic
import groovy.transform.TupleConstructor

@CompileStatic
@TupleConstructor
class ProducaoAgricolaDTO {


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

    ProducaoAgricolaDTO (String regiao,
            String manejo,
            String cultura,
            String unidade,
            String discriminacao,
            BigDecimal custoPorHectare,
            BigDecimal custoPorSessentakg,
            BigDecimal outros,
            BigDecimal receita,
            BigDecimal participacaoCv,
            BigDecimal participacaoCt,
            Integer safraAno,
            BigDecimal valorFaturado
    ) {
        this.manejo = manejo
        this.cultura = cultura
        this.unidade = unidade
        this.discriminacao = discriminacao
        this.custoPorHectare = custoPorHectare
        this.custoPorSessentakg = custoPorSessentakg
        this.outros = outros
        this.receita = receita
        this.participacaoCv = participacaoCv
        this.participacaoCt = participacaoCt
        this.safraAno = safraAno
        this.valorFaturado = valorFaturado
    }
}
