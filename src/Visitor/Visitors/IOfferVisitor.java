package Visitor.Visitors;

import Visitor.Services.Electronics;

public interface IOfferVisitor {
    abstract public double getPriceMobile(Electronics electronics);

    abstract public double getPriceCamera(Electronics electronics);

    abstract public double getPriceComputer(Electronics electronics);
}
