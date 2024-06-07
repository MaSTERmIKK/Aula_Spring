@Controller
public class RicettaController {
    @Autowired
    private RicettaRepository ricettaRepository;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("ricette", ricettaRepository.findAll());
        return "home";
    }

    @GetMapping("/aggiungi")
    public String mostraFormAggiungi(Model model) {
        model.addAttribute("ricetta", new Ricetta());
        return "aggiungi";
    }

    @PostMapping("/aggiungi")
    public String aggiungiRicetta(@ModelAttribute Ricetta ricetta) {
        ricettaRepository.save(ricetta);
        return "redirect:/";
    }
}
