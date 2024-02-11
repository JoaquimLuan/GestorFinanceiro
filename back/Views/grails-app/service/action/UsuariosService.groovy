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
        // Faça a validação do login sem a verificação do PasswordEncoder
        // Aqui você pode fazer a comparação direta entre as senhas,
        // mas certifique-se de que está armazenando as senhas de forma segura
        if (usuarios && senha == usuarios.senha) {
            return true
        } else {
            return false
        }
    }

    Usuarios buscarUsuarioPorEmail(String email) {
        return usuariosDao.buscarUsuarioPorEmail(email)
    }

    Usuarios salvarUsuario(UsuariosDTO usuariosDTO) {
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
