package ch13.bankapp.model;

public class JointAccount {
    private static int pivot = -1;
    private String firstname;
    private String lastname;
    private String ssn;

    private final static JointAccount[] owners = new JointAccount[2];

    public JointAccount() {

    }

    public JointAccount(String firstname, String lastname, String ssn) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    // CRUD API

    public boolean insertOwner() {
        if (isFull()) {
            System.out.println("There are already two owners.");
            return false;
        }

        if (getIndexBySsn() != -1) {
            System.out.println("Owner with this SSN already exists!");
            return false;
        }

        pivot++;
        owners[pivot] = new JointAccount();
        owners[pivot].setFirstname(firstname);
        owners[pivot].setLastname(lastname);
        owners[pivot].setSsn(ssn);
        return true;
    }

    public boolean updateOwner() {
        int positionToUpdate = getIndexBySsn();

        if (positionToUpdate == -1) {
            return false;
        }

        owners[positionToUpdate].setFirstname(firstname);
        owners[positionToUpdate].setLastname(lastname);
        owners[positionToUpdate].setSsn(ssn);
        return true;
    }

    public boolean deleteOwner() {
        int positionToDelete = getIndexBySsn();

        if (positionToDelete == -1) {
            return false;
        }

        owners[positionToDelete].setFirstname(null);
        owners[positionToDelete].setLastname(null);
        owners[positionToDelete].setSsn(null);

        if (positionToDelete == 0) {
            System.arraycopy(owners, 1, owners, 0, 1);
        }

        pivot--;
        return true;
    }

    private boolean isFull() {
        return pivot == 1;
    }

    private int getIndexBySsn() {
        for (int i = 0; i <= pivot; i++) {
            if (owners[i].getSsn().equals(ssn)) {
                return i;
            }
        }
        return -1;
    }

    public String contactToString() {
        return firstname + ", " + lastname + ", " + ssn;
    }

    public static void printOwners() {
        System.out.println("The owners of the account are: ");
        for (int i = 0; i <= owners.length - 1; i++) {
            System.out.println(owners[i].getFirstname()+ ", " + owners[i].getLastname()
                    + ", " + owners[i].getSsn());
        }
    }
}


