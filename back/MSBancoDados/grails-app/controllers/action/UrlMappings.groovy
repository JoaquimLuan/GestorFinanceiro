package action

class UrlMappings {

    static mappings = {

        group("/usuarios") {
            get "/listar"(controller: 'usuarios', action: 'listarUsuarios')
            get "/$email"(controller: 'usuarios', action: 'buscarUsuario')
            post "/salvar/$email/$senha"(controller: 'usuarios', action: 'salvarUsuario')
            put "/atualizar/$email/$senha"(controller: 'usuarios', action: 'atualizarUsuario')
            delete "/deletar/$email"(controller: 'usuarios', action: 'deletarUsuario')
            post "/login/$email/$senha"(controller: 'usuarios', action: 'loginUsuario')
        }

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')

    }
}
