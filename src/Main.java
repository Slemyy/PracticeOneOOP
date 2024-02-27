public class Main {
    public static void main(String[] args) {
        System.out.println("=== Счет пинтестера в Кибер-банке ===");
        Check Slemyy = new Check("Slemyy", 20359);
        Check Dister = new Check("Dister", 12035);
        Check Kuzaka = new Check("Kuzaka", 56000);

        System.out.println(Slemyy);
        System.out.println(Dister);
        System.out.println(Kuzaka);

        System.out.print("Slemyy: ");
        Slemyy.deposit(65800);
        System.out.println("Баланс Slemyy: " + Slemyy.getBalance());
        System.out.println("Имя аккаунта Dister: " + Dister.getAccountName());
        Dister.setAccountName("Drister");
        System.out.println("Имя аккаунта Dister: " + Dister.getAccountName());

        System.out.println("Баланс Kuzaka: " + Kuzaka.getBalance());
        Kuzaka.debit(6000);
        System.out.println("Баланс Kuzaka: " + Kuzaka.getBalance());

    }
}