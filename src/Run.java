public class Run {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.setAcc_no(1234567890);
        ba.setName("LR Creations");
        ba.setEmail("lrcreations@gmail.com");
        ba.setAmount(24567.987);
        System.out.println(ba.getAcc_no() + " " + ba.getName() + " " + ba.getEmail() + " " + ba.getAmount());
    }
}