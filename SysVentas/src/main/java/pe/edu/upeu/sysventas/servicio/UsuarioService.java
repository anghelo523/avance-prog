package pe.edu.upeu.sysventas.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.sysventas.modelo.Usuario;
import pe.edu.upeu.sysventas.repositorio.UsuarioRepository;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository UsuarioRepository;
    // Create
    public Usuario guardarEntidad(Usuario to) {return UsuarioRepository.save(to);}
    // Report
    public List<Usuario> listarEntidad() { return UsuarioRepository.findAll(); }
    // Update
    public Usuario actualizarEntidad(Usuario to) { return UsuarioRepository.save(to); }
    // Delete
    public void eliminarRegEntidad(Long id) { UsuarioRepository.deleteById(id); }
    // Buscar por ID
    public Usuario buscarEntidad(Long id) { return UsuarioRepository.findById(id).orElse(null); }

}