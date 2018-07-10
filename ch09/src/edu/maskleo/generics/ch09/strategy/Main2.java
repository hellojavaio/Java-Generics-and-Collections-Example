package edu.maskleo.generics.ch09.strategy;

public class Main2 {
    interface Strategy {
        /**
         * 策略方法
         */
        void strategyInterface();
    }
    static class ConcreteStrategyA implements Strategy {
        @Override
        public void strategyInterface() {
            //相关的业务
        }
    }
    static class ConcreteStrategyB implements Strategy {
        @Override
        public void strategyInterface() {
            //相关的业务
        }
    }
    static class Context {
        //持有一个具体策略的对象
        private Strategy strategy;
        /**
         * 构造函数，传入一个具体策略对象
         * @param strategy    具体策略对象
         */
        public Context(Strategy strategy){
            this.strategy = strategy;
        }
        /**
         * 策略方法
         */
        public void contextInterface(){
            strategy.strategyInterface();
        }

    }
}
