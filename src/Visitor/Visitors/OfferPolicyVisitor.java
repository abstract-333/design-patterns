package Visitor.Visitors;

import Visitor.Services.Electronics;

public class OfferPolicyVisitor implements IOfferVisitor {

    @Override
    public double getPriceMobile(Electronics electronics) {
        return electronics.getPrice() * 0.8;
    }

    @Override
    public double getPriceCamera(Electronics electronics) {
        return electronics.getPrice() * 0.9;
    }

    @Override
    public double getPriceComputer(Electronics electronics) {
        return electronics.getPrice() * 0.95;
    }

}
