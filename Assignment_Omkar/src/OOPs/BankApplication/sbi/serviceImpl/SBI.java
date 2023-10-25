package OOPs.BankApplication.sbi.serviceImpl;

import OOPs.BankApplication.sbi.model.Account;
import OOPs.BankApplication.sbi.service.RBI;

import java.util.InputMismatchException;
import java.util.Scanner;


public class SBI implements RBI {
    Account ac = new Account();


    public void createAccount() {
        System.out.println(" Creating Account");
        String name = getValidName();
        ac.setName(name);

        long accNum = getValidAccountNumber();
        ac.setAccountNumber(accNum);

        int pin = getValidPin();
        ac.setAccountPin(pin);

        selectBranch();

        long mobile = getValidMobileNumber();
        ac.setMobileNumber(mobile);

        String pan = getValidPanCard();
        ac.setPanNumber(pan);

        long adharnum = getValidAdharNumber();
        ac.setAdharNumber(adharnum);

        float balance = getValidAccountBalance();
        ac.setBalance(balance);

        String mail = getValidMail();
        ac.setGmail(mail);

        String add = getValidAddress();
        ac.setAddress(add);

        getAccountType(); // call to getAccountType method for selecting account Type
    }

    private String getValidName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = sc.next();
        if (name.length() < 4) {
            System.out.println("Invalid Name.Please Enter At Least Four Character Name");
            return getValidName();
        }
        try {
            Integer i = Integer.parseInt(name);
        } catch (Exception ex) {
            return name;
        }
        System.out.println("Only Allow Characters Inputs");
        return getValidName();
    }

    private long getValidAccountNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Account Number");
        long accNum = 0;
        try {
            accNum = sc.nextLong();
            // System.out.println(accNum);
        } catch (InputMismatchException ex) {
            System.out.println("Invalid Ac.Number.Only Numbers Allowed");
            return getValidAccountNumber();
        }
        String accNumInString = String.valueOf(accNum);
        if (accNum <= 0 || accNumInString.length() != 5 || accNumInString.startsWith("0")) {
            System.out.println("Invalid Account Number.Please Enter Five Digit Account Number");
            return getValidAccountNumber();
        }
        return accNum;
    }

    private int getValidPin() {
        Scanner sc = new Scanner(System.in);
        int pin = 0;
        System.out.println("Enter Account Pin");
        try {
            pin = sc.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Only Allow Four Digit Integer Type Value");
            return getValidPin();
        }
        String stringPin = String.valueOf(pin);
        if (pin >= 0 && stringPin.length() == 4) {
            return pin;
        }
        System.out.println("Invalid Pin.Please Enter Four Digit Pin ");
        return getValidPin();
    }

    private long getValidMobileNumber() {
        Scanner sc = new Scanner(System.in);
        long mobile = 0;
        System.out.println("Enter Mobile Number");
        try {
            mobile = sc.nextLong();
        } catch (InputMismatchException ex) {
            System.out.println("Only Allow Ten Digit Integer Type Value");
            return getValidMobileNumber();
        }
        String mobileInString = String.valueOf(mobile);
        if (mobile >= 0 && mobileInString.length() == 10 && (mobileInString.startsWith("7")
                || mobileInString.startsWith("8") || mobileInString.startsWith("9"))) {
            return mobile;
        } else {
            System.out.println(
                    "Invalid Mobile Number.\nPlease Enter Ten Digit Mobile Number.It Should Be Start With 7 Or 8 Or 9");
            return getValidMobileNumber();
        }

    }

    private String getValidPanCard() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Pan Number");
        String pan = sc.next();
        if (pan.length() == 10) {
            return pan;
        }
        System.out.println("Invalid Input.Please Enter 10 Digit Alphanumeric Number");
        return getValidPanCard();
    }

    private long getValidAdharNumber() {
        Scanner sc = new Scanner(System.in);
        long adharnum = 0;
        System.out.println("Enter Aadhar Number");
        try {
            adharnum = sc.nextLong();
        } catch (InputMismatchException ex) {
            System.out.println("Only Allow Integer Type Value");
            return getValidAdharNumber();
        }
        String adharnumInString = String.valueOf(adharnum);
        if (adharnum <= 0 || adharnumInString.length() != 12 || adharnumInString.startsWith("0")) {
            System.out.println("Invalid Adhar Number.Please Enter Twelve Digit Adhar Number.");
            return getValidAdharNumber();
        }
        return adharnum;

    }

    private float getValidAccountBalance() {
        Scanner sc = new Scanner(System.in);
        float balance = 0;
        System.out.println("Enter Account Balance");
        try {
            balance = sc.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("Only Allow Integer Number.Try Again");
            return getValidAccountBalance();
        }
        if (balance <= 0) {
            System.out.println("Enter Valid Account Balance Try Again");
            return getValidAccountBalance();
        }
        return balance;
    }

    private String getValidMail() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Mail Id");
        String mail = sc.next();
        if (mail.endsWith("@gmail.com") || mail.endsWith("@yahoo.com") || mail.endsWith("@perennialsys.com")) {
            return mail;
        }
        System.out.println("Invalid Mail Id Please Enter Valid Mail ID Ends With @gmail.com OR @yahoo.com or @perennialsys.com");
        return getValidMail();
    }

    private String getValidAddress() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Address");
        String add = sc.next();
        try {
            Integer i = new Integer(add);
        } catch (Exception e) {
            return add;
        }
        System.out.println("Only Allow Character Type Input. Try Again");
        return getValidAddress();
    }

    private int selectBranch() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select Branch Name");
        System.out.println("1. Pune");
        System.out.println("2. Dharashiv");
        System.out.println("3. Mumbai");
        int branch = 0;
        try {
            branch = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input.Please Try Again");
            return selectBranch();
        }
        switch (branch) {
            case 1:
                ac.setBranchName("Pune");
                System.out.println("User Selected Branch Name " + ac.getBranchName());
                break;
            case 2:
                ac.setBranchName("Ahmednagar");
                System.out.println("User Selected Branch Name " + ac.getBranchName());
                break;
            case 3:
                ac.setBranchName("Mumbai");
                System.out.println("User Selected Branch Name " + ac.getBranchName());
                break;
            default:
                System.out.println("This is Not Valid Input Please Try Again");
                return selectBranch();

        }
        return branch;
    }

    private void getAccountType() {
        Scanner sc = new Scanner(System.in);
        System.out.println("which Account Do You Open:-\n1. Saving Account\n2. Current Account");
        int whichAcc = 0;
        try {
            whichAcc = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input.Try Again");
            getAccountType();
        }
        switch (whichAcc) {
            case 1:
                ac.setType("Saving");
                break;
            case 2:
                ac.setType("Current");
                break;
            default:
                System.out.println("This Is Not Valid Selection");
                getAccountType();
                break;
        }
    }

    public void displayBalance() {
        if (getValidAccountNumber() == ac.getAccountNumber() && getValidPin() == ac.getAccountPin()) {
            System.out.println(" Displaying Account Balance :");
            System.out.println(ac.getBalance());
        } else {
            System.out.println("This Is Invalid Account Number OR Pin");
        }
    }

    public void displayDetails() {
        if (getValidAccountNumber() == ac.getAccountNumber() && getValidPin() == ac.getAccountPin()) {
            System.out.println("Displaying Account Details :");
            System.out.println(ac.toString());
        } else {
            System.out.println("This Is Invalid Account Number Or Pin");
        }
    }

    public void depositeAmount() {
        Scanner sc = new Scanner(System.in);
        if (getValidAccountNumber() == ac.getAccountNumber() && getValidPin() == ac.getAccountPin()) {
            System.out.println("User Want To Deposit Amount ");
            System.out.println("How Much Amount Deposit ?");
            float amount = sc.nextFloat();
            float newBalance = ac.getBalance() + amount;
            System.out.println("Updated Balance Is :- " + newBalance);
            ac.setBalance(newBalance);
        } else {
            System.out.println("This Is Invalid Account Number Or Pin");
        }
    }

    public void withdrawAmount() {
        Scanner sc = new Scanner(System.in);
        if (getValidAccountNumber() == ac.getAccountNumber() && getValidPin() == ac.getAccountPin()) {
            System.out.println("User Want To Withdraw Amount");
            System.out.println("How Much Amount Withdraw :- ");
            float withdraw = sc.nextFloat();
            float newBalance = ac.getBalance() - withdraw;
            System.out.println("Remaining Balance Is :- " + newBalance);
            ac.setBalance(newBalance);
        } else {
            System.out.println("This Is Invalid Account Number Or Pin");
        }
    }

    public void updateProfile() {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do {
            if (getValidAccountNumber() == ac.getAccountNumber() && getValidPin() == ac.getAccountPin()) {
                System.out.println(" Updating Profile Details");
                System.out.println(
                        "1.Change Name\n2.Change Account Pin\n3.Change Branch Name\n4.Change Mobile Number\n5.Change Email Id \n6.Change Address\n7.Change Account Type\n8.Exit");
                System.out.println("Enter Your Choice:-");
                int update = sc.nextInt();
                switch (update) {
                    case 1:
                        String newName = getValidName();
                        ac.setName(newName);
                        System.out.println("Your Name Is Successfully Update. ");
                        break;
                    case 2:
                        boolean flag1 = true;
                        do {
                            int newPin1 = getValidPin();
                            System.out.println("Re-Enter Your New Pin");
                            int newPin2 = getValidPin();
                            if (newPin1 == newPin2) {
                                ac.setAccountPin(newPin1);
                                System.out.println("Your New Pin Successfully Update");
                                flag1 = false;
                            } else {
                                System.out.println("PIN MISMATCHED..TRY AGAIN");
                            }
                        } while (flag1);
                        break;
                    case 3:
                        selectBranch();
                        break;
                    case 4:
                        long newmob = getValidMobileNumber();
                        ac.setMobileNumber(newmob);
                        System.out.println("Your Mobile Number Successfully Update");
                        break;
                    case 5:
                        String newmail = getValidMail();
                        ac.setGmail(newmail);
                        System.out.println("Your Mail Id Successfully Update");
                        break;
                    case 6:
                        System.out.println("Enter Your New Address");
                        String newadd = getValidAddress();
                        ac.setAddress(newadd);
                        System.out.println("Your Address Successfully Update");
                        break;
                    case 7:
                        getAccountType();
                        System.out.println("Your Account Type Successfully Update");
                        break;
                    case 8:
                        flag = false;
                        break;
                    default:
                        System.out.println("This Is Not Valid Choice-");
                        break;
                }
            } else {
                System.out.println("This Invalid Account Number Or Pin");
            }
        } while (flag);
    }
}
