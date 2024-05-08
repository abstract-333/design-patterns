package Visitor.Visitors;

import Visitor.Services.Camera;
import Visitor.Services.Computer;
import Visitor.Services.Mobile;

public class NormalPolicyVisitor implements IOfferVisitor {

    @Override
    public double getPriceMobile(Mobile electronics) {
        return electronics.getPrice();
    }

    @Override
    public double getPriceCamera(Camera electronics) {
        return electronics.getPrice();
    }

    @Override
    public double getPriceComputer(Computer electronics) {
        return electronics.getPrice();
    }

}
