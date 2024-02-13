package action

class UrlMappings {

    static mappings = {

        group("/custo/hectare") {
            get "/soja"(controller: 'custoPorHectare', action: 'retornaCustoSojaPorHectare')
            get "/cafe"(controller: 'custoPorHectare', action: 'retornaCustoCafePorHectare')
            get "/algodao"(controller: 'custoPorHectare', action: 'retornaCustoAlgodaoPorHectare')
            get "/uva"(controller: 'custoPorHectare', action: 'retornaCustoUvaPorHectare')
            get "/canaDeAcucar"(controller: 'custoPorHectare', action: 'retornaCustoCanaDeAcucarPorHectare')
            get "/feijao"(controller: 'custoPorHectare', action: 'retornaCustoFeijaoPorHectare')
            get "/tomate"(controller: 'custoPorHectare', action: 'retornaCustoTomatePorHectare')
            get "/cacau"(controller: 'custoPorHectare', action: 'retornaCustoCacauPorHectare')
            get "/arroz"(controller: 'custoPorHectare', action: 'retornaCustoArrozPorHectare')
            get "/abacaxi"(controller: 'custoPorHectare', action: 'retornaCustoAbacaxiPorHectare')
        }

        group("/receita/regiao") {
            get "/centrooeste"(controller: 'receitaPorRegiao', action: 'receitaRegiaoCentroOeste')
            get "/sudeste"(controller: 'receitaPorRegiao', action: 'receitaRegiaoSudeste')
            get "/norte"(controller: 'receitaPorRegiao', action: 'receitaRegiaoNorte')
            get "/sul"(controller: 'receitaPorRegiao', action: 'receitaRegiaoSul')
            get "/nordeste"(controller: 'receitaPorRegiao', action: 'receitaRegiaoNordeste')
        }

        group("/receita/fazenda") {
            get "/a"(controller: 'receitaPorFazenda', action: 'receitaFazendaA')
            get "/b"(controller: 'receitaPorFazenda', action: 'receitaFazendaB')
            get "/c"(controller: 'receitaPorFazenda', action: 'receitaFazendaC')
        }

        group("/total") {
            get "/receita"(controller: 'totalValores', action: 'receitaTotal')
            get "/custo"(controller: 'totalValores', action: 'custoTotal')
        }

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')

    }
}
