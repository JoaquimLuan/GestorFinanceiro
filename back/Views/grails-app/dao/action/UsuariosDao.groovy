package action

import action.DTO.UsuariosDTO
import org.springframework.stereotype.Component
import org.springframework.stereotype.Repository
import tabela.Usuarios

@Repository
@Component
class UsuariosDao {

    Usuarios buscarUsuarioPorEmail(String email) {
        Usuarios.findByEmail(email)
    }

    Usuarios salvarUsuario(UsuariosDTO usuariosDTO) {
        Usuarios usuarios = new Usuarios(email: usuariosDTO.email, senha: usuariosDTO.senha)
        usuarios.save(flush: true)
        return usuarios
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
