package exercise03;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Buyer {
    private final String name;
    private final String RG;
    private final String CPF;
    private final LocalDate birthday;

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
    }

    LocalDate getBirthday() {
        return this.birthday;
    }
}
