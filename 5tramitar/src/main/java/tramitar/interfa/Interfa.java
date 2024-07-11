package tramitar.interfa;

import org.springframework.data.jpa.repository.JpaRepository;

import tramitar.modelo.Modelo;

public interface Interfa extends JpaRepository<Modelo, Long> {

}
