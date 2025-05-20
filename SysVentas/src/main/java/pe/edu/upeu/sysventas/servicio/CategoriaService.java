package pe.edu.upeu.sysventas.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.upeu.sysventas.modelo.Marca;
import pe.edu.upeu.sysventas.repositorio.CategoriaRepository;

import java.util.List;

public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    //create
    public Marca guardarEntidad(Marca to){return categoriaRepository.save(to);}
    //report
    public List<Marca> listarEntidad(){return categoriaRepository.findAll();}
    //update
    public Marca actualizarEntidad(Marca to){return categoriaRepository.save(to);}
    //delete
    public void eliminarEntidad(Long id){categoriaRepository.deleteById(id);}
    //buscar por id
    public Marca buscarEntidad(Long id){return categoriaRepository.findById(id).orElse(null);}
}
