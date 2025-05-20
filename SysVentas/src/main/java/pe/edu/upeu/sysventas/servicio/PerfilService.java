package pe.edu.upeu.sysventas.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.sysventas.modelo.Perfil;
import pe.edu.upeu.sysventas.repositorio.PerfilRepository;

import java.util.List;

@Service
public class PerfilService {
    @Autowired
    private PerfilRepository PerfilRepository;
    // Create
    public Perfil guardarEntidad(Perfil to) {return PerfilRepository.save(to);}
    // Report
    public List<Perfil> listarEntidad() { return PerfilRepository.findAll(); }
    // Update
    public Perfil actualizarEntidad(Perfil to) { return PerfilRepository.save(to); }
    // Delete
    public void eliminarRegEntidad(Long id) { PerfilRepository.deleteById(id); }
    // Buscar por ID
    public Perfil buscarEntidad(Long id) { return PerfilRepository.findById(id).orElse(null); }


}