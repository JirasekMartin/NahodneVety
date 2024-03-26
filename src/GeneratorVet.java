import java.util.Random;
public class GeneratorVet {
    /**
     * Slovní zásoba přívlastků
     */
    private String[] privlastky = {"modrý", "velký", "hubený", "nejlepší", "automatizovaný"};
    /**
     * Slovní zásoba předmětů
     */
    private String[] podnety = {"jednorožec", "programátor", "manažer", "hroch", "T-rex"};
    /**
     * Slovní zásoba příslovcí
     */
    private String[] prislovce = {"rychle", "s oblibou", "hodně", "málo", "se zpožděním"};
    /**
     * Slovní zásoba sloves
     */
    private String[] slovesa = {"spal", "ležel", "vařil", "uklízel", "derivoval"};
    /**
     * Slovní zásoba příslovečných určení místa
     */
    private String[] mista = {"pod stolem", "v lese", "u babičky", "v práci", "na stole"};
    /**
     * Generátor náhodných čísel
     */
    private Random generator = new Random();

    /**
     * Vrátí náhodné slovo z pole
     *
     * @param pole Vstupní pole
     * @return Náhodné slovo
     */
    private String nahodneSlovo(String[] pole) {
        int index = generator.nextInt(pole.length);
        return pole[index];
    }

    /**
     * Vrátí náhodnou větu
     *
     * @return Náhodná věta
     */
    public String generuj() {
        return String.format("%s %s %s %s %s",
                nahodneSlovo(privlastky),
                nahodneSlovo(podnety),
                nahodneSlovo(prislovce),
                nahodneSlovo(slovesa),
                nahodneSlovo(mista)
        );
    }
}