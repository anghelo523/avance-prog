package pe.edu.upeu.sysventas.servicio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.sysventas.modelo.Producto;
import pe.edu.upeu.sysventas.repositorio.ProductoRepository;

import java.util.List;

@Service
public class ProductoService {
    private static final Logger logger = LoggerFactory.getLogger(ProductoService.class);
    @Autowired
    ProductoRepository productoRepository;
    // Create
    public Producto guardarEntidad(Producto producto) {
        return productoRepository.save(producto);
    }
    // Report
    public List<Producto> listarEntidad() {
        return productoRepository.findAll();
    }
    // Update
    public Producto actualizarEntidad(Producto producto) {
        return productoRepository.save(producto);
    }
    // Delete
    public void eliminarRegEntidad(Long idProducto) {
        productoRepository.deleteById(idProducto);
    }
    // Buscar por ID
    public Producto buscarProducto(Long idProducto) {
        return productoRepository.findById(idProducto).orElse(null);
    }


}