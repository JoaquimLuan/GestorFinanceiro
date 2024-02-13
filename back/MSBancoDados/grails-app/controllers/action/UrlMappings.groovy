package action

class UrlMappings {

    static mappings = {

        group("/usuarios") {
            get "/listar"(controller: 'usuarios', action: 'listarUsuarios')
            get "/$email"(controller: 'usuarios', action: 'buscarUsuario')
            post "/salvar"(controller: 'usuarios', action: 'salvarUsuario')
            put "/atualizar"(controller: 'usuarios', action: 'atualizarUsuario')
            delete "/deletar"(controller: 'usuarios', action: 'deletarUsuario')
            post "/login"(controller: 'usuarios', action: 'loginUsuario')
        }

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')

    }
}
