package br.univille.vitorsouza.service;

import java.util.List;
import org.springframework.stereotype.Service;
import br.univille.vitorsouza.model.Categoria;

/***
 * CategoriaService serve como interface que
 * expõe para a aplicação os métodos que esse serviço
 * é capaz de fazer.
 */
@Service
public interface CategoriaService {
    public List<Categoria> getAllCategorias();
    public Categoria save(Categoria categoria);
    public void delete(Categoria categoria);
}