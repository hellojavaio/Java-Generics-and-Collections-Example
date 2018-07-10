package edu.maskleo.generics.ch09.strategy;

public class Main {

    static class TaxPayer<P extends TaxPayer<P>> {
        private TaxStrategy<P> strategy;
        public long income; // in cents
        public TaxPayer(long income, TaxStrategy<P> strategy) {
            this.income = income;
            this.strategy = strategy;
        }
        public long computeTax() {
            return strategy.computeTax((P)this);
        }
    }
    interface TaxStrategy<P extends TaxPayer<P>> {
        long computeTax(P p);
    }
    static class DefaultTaxStrategy implements TaxStrategy {
        @Override
        public long computeTax(TaxPayer taxPayer) {
            return (long)(taxPayer.income * 0.04);
        }
    }

    public static void main(String[] args) {
        TaxStrategy strategy = new DefaultTaxStrategy();
        TaxPayer payer = new TaxPayer(100000, strategy);
        System.out.println(payer.computeTax());
    }
}
