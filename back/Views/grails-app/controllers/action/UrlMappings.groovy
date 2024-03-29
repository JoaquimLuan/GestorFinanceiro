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

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')

    }
}
