package ch13.bankapp;

import ch13.bankapp.model.JointAccount;
import ch13.bankapp.model.OverdraftAccount;

import static ch13.bankapp.model.JointAccount.printOwners;

public class Main {

    public static void main(String[] args) throws Exception {

        JointAccount bob = new JointAccount("Bob" , "M.", "1234");
        JointAccount petros = new JointAccount("Petros", "K." , "1234");
        JointAccount mary = new JointAccount("Mary", "S.", "5678");
        JointAccount kelly = new JointAccount("Kelly", "B.", "8522");

        OverdraftAccount account = new OverdraftAccount("8585", 1000);

        try {
            bob.insertOwner();
          //  petros.insertOwner();
          //  mary.insertOwner();
            kelly.insertOwner();
            printOwners();

            System.out.println(bob.contactToString());
            bob.setLastname("Lo.");
            bob.updateOwner();
            System.out.println(bob.contactToString());

            printOwners();

            account.withdraw(1500);
            System.out.println(account.getAccountBalance());

            account.deposit(2000);
            System.out.println(account.getAccountBalance());

            bob.deleteOwner();
            printOwners();

            mary.insertOwner();
            printOwners();

            petros.insertOwner();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
