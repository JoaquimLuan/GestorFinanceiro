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
        Usuarios usuarios = usuariosDao.buscarUsuarioPorEmail(email)
        if (usuarios != null && senha == usuarios.senha) {
            return true
        } else {
            return false
        }
    }


    List buscarUsuarioPorEmail(email) {
        return usuariosDao.buscarUsuarioPorEmail(email)
    }

    Usuarios salvarUsuario(usuariosDTO) {
        return usuariosDao.salvarUsuario(usuariosDTO)
    }

    List<UsuariosDTO> listarUsuarios() {
        return usuariosDao.listarUsuarios()
    }

    Usuarios atualizarUsuario(UsuariosDTO usuariosDTO) {
        return usuariosDao.atualizarUsuario(usuariosDTO)
    }

    void deletarUsuario(String email) {
        UsuariosDTO usuariosDTO = new UsuariosDTO(email: email, senha: null)
        usuariosDao.deletarUsuario(usuariosDTO)
    }
}
