package action

class UrlMappings {
    static mappings = {

        group("/producao/agricola") {
            get "/hectare"(controller: 'producaoAgricola', action: 'retornaCustoSojaPorHectare')
        }

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')

    }
}
