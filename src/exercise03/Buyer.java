package exercise03;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

class Buyer {
    private static final int LEGAL_AGE = 18;

    private final String name;
    private final String RG;
    private final String CPF;
    private final LocalDate birthday;
    private final boolean minor;

    static Buyer getBuyerInstance() {
        System.out.println("Será necessária a apresentação dos documentos do comprador: ");

        return new Buyer();
    }

    private Buyer() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nome: ");
        this.name = scanner.nextLine();

        System.out.print("RG: ");
        this.RG = scanner.nextLine();

        System.out.print("CPF: ");
        this.CPF = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("data de nascimento (dd/mm/aaaa): ");
        this.birthday = LocalDate.parse(scanner.nextLine(), formatter);

        this.minor = isBuyerAMinor();
    }

    private boolean isBuyerAMinor() {
        return LocalDate.from(this.birthday).until(LocalDate.now(), ChronoUnit.YEARS) < LEGAL_AGE;
    }

    LocalDate getBirthday() {
        return this.birthday;
    }

    boolean getMinor() {
        return this.minor;
    }
}
