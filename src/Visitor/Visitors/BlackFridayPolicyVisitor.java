package Visitor.Visitors;

import Visitor.Services.Camera;
import Visitor.Services.Computer;
import Visitor.Services.Mobile;

public class BlackFridayPolicyVisitor implements IOfferVisitor {

    @Override
    public double getPriceMobile(Mobile electronics) {
        return electronics.getPrice() * 0.5;
    }

    @Override
    public double getPriceCamera(Camera electronics) {
        return electronics.getPrice() * 0.5;
    }

    @Override
    public double getPriceComputer(Computer electronics) {
        return electronics.getPrice() * 0.5;
    }

}
