package OOPs.BankApplication.sbi.model;

public class Account {
    private String name;
    private long accountNumber;
    private int accountPin;
    private String branchName;
    private long mobileNumber;
    private String panNumber;
    private long adharNumber;
    private float balance;
    private String gmail;
    private String address;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public long getAdharNumber() {
        return adharNumber;
    }

    public void setAdharNumber(long adharNumber) {
        this.adharNumber = adharNumber;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float newBalance) {
        this.balance = newBalance;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAccountPin() {
        return accountPin;
    }

    public void setAccountPin(int accountPin) {
        this.accountPin = accountPin;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    @Override
    public String toString() {
        return "Account Holder Name=" + name + " \nAccount Number=" + accountNumber + " \nAccount Pin=" + accountPin
                + " \nBranch Name=" + branchName + " \nMobile Number=" + mobileNumber + "\nPanNumber=" + panNumber
                + "\nAdhar Number=" + adharNumber + "\nBalanced=" + balance + "\nEmail I'd=" + gmail + "\nAddress="
                + address + "\nAccount Type=" + type + "";
    }
}
