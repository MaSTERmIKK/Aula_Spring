import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/80.80")
    public DatiUtente getUserData() {
        DatiFiglio figlio = new DatiFiglio("Marco", 12);
        DatiUtente utente = new DatiUtente("utente123", "utente@example.com", figlio);
        return utente;
    }
}
