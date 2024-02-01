package action

class UrlMappings {
    static mappings = {

        group("/custo/") {
            get "/hectare"(controller: 'producaoAgricolaController', action: 'retornaCustoSojaPorHectare')
        }

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')

    }
}
