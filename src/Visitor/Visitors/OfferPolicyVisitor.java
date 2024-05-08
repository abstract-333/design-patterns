package Visitor.Visitors;

import Visitor.Services.Camera;
import Visitor.Services.Computer;
import Visitor.Services.Electronics;
import Visitor.Services.Mobile;

public class OfferPolicyVisitor implements IOfferVisitor {

    @Override
    public double getPriceMobile(Mobile electronics) {
        return electronics.getPrice() * 0.8;
    }

    @Override
    public double getPriceCamera(Camera electronics) {
        return electronics.getPrice() * 0.9;
    }

    @Override
    public double getPriceComputer(Computer electronics) {
        return electronics.getPrice() * 0.95;
    }

}
