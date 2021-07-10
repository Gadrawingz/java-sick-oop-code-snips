package com.gadrawingz3;

class MainBank {
    float getRateOfInterest() {
        return 0;
    }
}

class EquityBank extends MainBank {
    float getRateOfInterest() {
        return 5.9F;
    }
}

class CogeBank extends MainBank {
    float getRateOfInterest() {
        return 10.1F;
    }
}

class EcoBank extends MainBank {
    float getRateOfInterest() {
        return 7.3F;
    }
}

public class PolymorphismRuntime2Bank {
    public static void main(String[] args) {

        MainBank bank;

        bank = new EquityBank();
        System.out.println("EguityBank rate of interest is: "+bank.getRateOfInterest());

        bank = new CogeBank();
        System.out.println("CogeBank rate of interest is: "+bank.getRateOfInterest());

        bank = new EcoBank();
        System.out.println("Eco Bank rate of interest is: "+bank.getRateOfInterest());
    }
}
