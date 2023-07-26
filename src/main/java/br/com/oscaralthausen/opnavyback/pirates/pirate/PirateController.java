package br.com.oscaralthausen.opnavyback.pirates.pirate;

import br.com.oscaralthausen.opnavyback.pirates.pirate.models.Pirate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/pirates")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PirateController {

    @Autowired
    PirateService pirateService;
    @GetMapping
    public ResponseEntity<List<Pirate>> getAllPirates() {
        List<Pirate> pirates = pirateService.getAllPirates();
        return ResponseEntity.status(HttpStatus.OK).body(pirates);
    }

    @PostMapping
    public ResponseEntity<Pirate> createPirate(@RequestBody Pirate pirate) {
        Pirate result = pirateService.createPirate(pirate);
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }
}
