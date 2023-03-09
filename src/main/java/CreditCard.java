abstract class CreditCard {
    private int debt;

    public CreditCard(int debt) {
        this.debt = debt;
    }

    void pay(int amount) {
        this.debt += amount;
    }

    public void setDebt(int debt) {
        this.debt = debt;
    }

    public int getDebt() {
        return debt;
    }
}
