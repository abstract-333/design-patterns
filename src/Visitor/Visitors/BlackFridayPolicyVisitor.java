package Visitor.Visitors;

import Visitor.Services.Electronics;

public class BlackFridayPolicyVisitor implements IOfferVisitor {

    @Override
    public double getPriceMobile(Electronics electronics) {
        return electronics.getPrice() * 0.5;
    }

    @Override
    public double getPriceCamera(Electronics electronics) {
        return electronics.getPrice() * 0.5;
    }

    @Override
    public double getPriceComputer(Electronics electronics) {
        return electronics.getPrice() * 0.5;
    }

}
