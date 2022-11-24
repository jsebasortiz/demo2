package co.edu.uceva.demo.model.dao;

import co.edu.uceva.demo.model.entities.Estudiante;
import org.springframework.data.repository.CrudRepository;
//  Data Access Objects
public interface IEstudianteDao extends CrudRepository<Estudiante, Long> {
}
