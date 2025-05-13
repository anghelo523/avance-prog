package pe.edu.upeu.sysventas.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.sysventas.modelo.Categoria;
import pe.edu.upeu.sysventas.modelo.Marca;
import pe.edu.upeu.sysventas.repositorio.CategoriaRepository;
import pe.edu.upeu.sysventas.repositorio.MarcaRepository;

import java.util.List;

@Service
public class MarcaService {
    @Autowired
    private MarcaRepository marcaRepository;

    //create
    public Marca guardarEntidad(Marca to){return marcaRepository.save(to);}
    //report
    public List<Marca> listarEntidad(){return marcaRepository.findAll();}
    //update
    public Marca actualizarEntidad(Marca to){return marcaRepository.save(to);}
    //delete
    public void eliminarEntidad(Long id){marcaRepository.deleteById(id);}
    //buscar por id
    public Marca buscarEntidad(Long id){return marcaRepository.findById(id).orElse(null);}
}
