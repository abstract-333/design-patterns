package Visitor.Visitors;

import Visitor.Services.Electronics;

public class NormalPolicyVisitor implements IOfferVisitor {

    @Override
    public double getPriceMobile(Electronics electronics) {
        return electronics.getPrice();
    }

    @Override
    public double getPriceCamera(Electronics electronics) {
        return electronics.getPrice();
    }

    @Override
    public double getPriceComputer(Electronics electronics) {
        return electronics.getPrice();
    }

}
