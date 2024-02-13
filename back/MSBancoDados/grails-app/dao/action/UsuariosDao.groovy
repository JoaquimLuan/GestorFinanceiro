package action

import action.DTO.UsuariosDTO
import org.springframework.stereotype.Component
import org.springframework.stereotype.Repository
import tabela.Usuarios

@Repository
@Component
class UsuariosDao {

    List<UsuariosDTO> buscarUsuarioPorEmail(email) {
        List<UsuariosDTO> resultado = Usuarios.where { email == email }.list()
        return resultado
    }

    Usuarios salvarUsuario(String email, String senha) {
        Usuarios usuario = new Usuarios(email: email, senha: senha)
        usuario.save()
        return usuario
    }

    List<UsuariosDTO> listarUsuarios() {
        String hql = """
                      SELECT 
                      u.email,
                      u.senha 
                      FROM Usuarios u
                     """
        List<UsuariosDTO> resultado = Usuarios.executeQuery(hql)
        return resultado
    }

    Usuarios atualizarUsuario(String email, String senha) {
        List<Usuarios> usuariosList = buscarUsuarioPorEmail(email)
        if (usuariosList && !usuariosList.isEmpty()) {
            Usuarios usuario = usuariosList[0]
            usuario.senha = senha
            usuario.save(flush: true)
            return usuario
        }
        return null
    }


    Usuarios deletarUsuario(String email) {
        List<Usuarios> usuariosList = buscarUsuarioPorEmail(email)
        if (usuariosList && !usuariosList.isEmpty()) {
            Usuarios usuario = usuariosList[0]
            usuario.delete(flush: true)
            return usuario
        }
        return null
    }


}
