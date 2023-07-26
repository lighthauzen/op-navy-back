package br.com.oscaralthausen.opnavyback.pirates.pirate;

import br.com.oscaralthausen.opnavyback.pirates.pirate.models.Pirate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PirateService {

    @Autowired
    PirateRepository pirateRepository;

    public Optional<Pirate> findById(String id) {
        Optional<Pirate> pirate = pirateRepository.findById(id);
        return pirate;
    }

    public List<Pirate> getAllPirates() {return pirateRepository.findAll();}

    public Pirate createPirate(Pirate pirate) {
        pirate.setId(UUID.randomUUID().toString());
        Pirate createdPirate = pirateRepository.save(pirate);
        return createdPirate;
    }
}
