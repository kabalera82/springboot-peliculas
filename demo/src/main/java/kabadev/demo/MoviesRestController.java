package kabadev.demo;

import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@CrossOrigin // Permite solicitudes desde cualquier origen
public class MoviesRestController {

    @GetMapping("/")
    public String home() {
        return "Backend funcionando";
    }

    @GetMapping("/movies")
    public List<Movies> getMovies() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        InputStream is = getClass().getResourceAsStream("/movies.json");
        Movies[] movie = mapper.readValue(is, Movies[].class);
        return Arrays.asList(movie);
    }
}
