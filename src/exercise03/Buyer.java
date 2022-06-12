package exercise03;

import java.time.LocalDate;
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

        this.name = scanner.nextLine();
        this.RG = scanner.nextLine();
        this.CPF = scanner.nextLine();
        this.birthday = LocalDate.parse(scanner.nextLine());
    }

    LocalDate getBirthday() {
        return this.birthday;
    }
}
