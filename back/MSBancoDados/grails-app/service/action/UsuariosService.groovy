package action

import grails.gorm.transactions.Transactional
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import action.DTO.UsuariosDTO
import action.UsuariosDao
import tabela.Usuarios

@Transactional
@Service
class UsuariosService {

    @Autowired
    UsuariosDao usuariosDao


    boolean validarLogin(String email, String senha) {
        List<Usuarios> usuarios = usuariosDao.buscarUsuarioPorEmail(email)
        if (usuarios && !usuarios.isEmpty()) {
            Usuarios usuario = usuarios[0]
            if (senha == usuario.senha) {
                return true
            }
        }
        return false
    }



    List buscarUsuarioPorEmail(email) {
        return usuariosDao.buscarUsuarioPorEmail(email)
    }

    Usuarios salvarUsuario(UsuariosDTO usuariosDTO) {
        return usuariosDao.salvarUsuario(usuariosDTO.email, usuariosDTO.senha)
    }

    List<UsuariosDTO> listarUsuarios() {
        return usuariosDao.listarUsuarios()
    }

    Usuarios atualizarUsuario(String email, String senha) {
        return usuariosDao.atualizarUsuario(email, senha)
    }

    Usuarios deletarUsuario(String email) {
        return usuariosDao.deletarUsuario(email)
    }
}
