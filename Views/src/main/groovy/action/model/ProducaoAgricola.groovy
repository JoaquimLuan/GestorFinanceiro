package action.model

import grails.compiler.GrailsCompileStatic
import groovy.transform.CompileStatic
import groovy.transform.TupleConstructor

@CompileStatic
@TupleConstructor
class ProducaoAgricola {
    String regiao
    String manejo
    String cultura
    String unidade
    String discriminacao
    BigDecimal custoPorHectare
    BigDecimal custoPor60kg
    BigDecimal outros
    BigDecimal receita
    BigDecimal participacaoCv
    BigDecimal participacaoCt
    Integer safraAno
    BigDecimal valorFaturado
}
