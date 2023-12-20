import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //informacije o studentu
        System.out.println("Unesite svoje ime: ");
        String ime = scanner.nextLine();
        System.out.println("Unesite svoje prezime: ");
        String prezime = scanner.nextLine();
        System.out.println("Unesite broj vaseg indeksa: ");
        String brojIndeksa = scanner.nextLine();
        Student student = new Student(ime, prezime, brojIndeksa);

        //informacije o predmetu
        System.out.println("Unesite naziv predmeta: ");
        String nazivPredmeta = scanner.nextLine();
        Predmet predmet = new Predmet(nazivPredmeta);

        //informacije o ispitu
        System.out.println("Unesite datum odrzavanja ispita: ");
        String datumOdrzavanja = scanner.nextLine();
        Ispit ispit = new Ispit(datumOdrzavanja);

        //ispis svih informacija
        System.out.println(student.getInformacijeOStudentu());
        System.out.println("Naziv predmeta:" + predmet.getNazivPredmeta());
        System.out.println("Datum odrzavanja ispita:" + ispit.getDatumOdrzavanja());

    }
}