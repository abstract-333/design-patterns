package Visitor.Visitors;

import Visitor.Services.Camera;
import Visitor.Services.Computer;
import Visitor.Services.Mobile;

public interface IOfferVisitor {
    abstract public double getPriceMobile(Mobile electronics);

    abstract public double getPriceCamera(Camera electronics);

    abstract public double getPriceComputer(Computer electronics);
}
