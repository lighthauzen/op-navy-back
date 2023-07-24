package br.com.oscaralthausen.opnavyback.pirates.pirate;

import br.com.oscaralthausen.opnavyback.pirates.pirate.models.Pirate;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface PirateRepository extends MongoRepository<Pirate, String> {

    Optional<Pirate> findById(String id);

}
