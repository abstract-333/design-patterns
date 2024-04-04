package Visitor.Services;

import Visitor.Visitors.IOfferVisitor;

public class Computer extends Electronics {

    public Computer(String name, double price) {
        super(name, price);
    }

    @Override
    public double accept(IOfferVisitor visitor) {
        return visitor.getPriceComputer(this);
    }

}