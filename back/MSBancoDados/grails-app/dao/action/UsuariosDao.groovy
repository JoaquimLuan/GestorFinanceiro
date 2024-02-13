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

    Usuarios salvarUsuario(usuariosDTO) {
        Usuarios usuario = new Usuarios(email: usuariosDTO.email, senha: usuariosDTO.senha)
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

    Usuarios atualizarUsuario(UsuariosDTO usuariosDTO) {
        Usuarios usuarios = buscarUsuarioPorEmail(usuariosDTO.email)
        if (usuarios) {
            usuarios.senha = usuariosDTO.senha
            usuarios.save(flush: true)
        }
        return usuarios
    }

    void deletarUsuario(UsuariosDTO usuariosDTO) {
        Usuarios usuarios = buscarUsuarioPorEmail(usuariosDTO.email)
        if (usuarios) {
            usuarios.delete(flush: true)
        }
    }

}
