@Entity
public class Ricetta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    @Column(length = 1000)
    private String ingredienti;
    @Column(length = 2000)
    private String procedimento;

    // Getters e setters
}
