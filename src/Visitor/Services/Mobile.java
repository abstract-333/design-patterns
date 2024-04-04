package Visitor.Services;

import Visitor.Visitors.IOfferVisitor;

public class Mobile extends Electronics {

    public Mobile(String name, double price) {
        super(name, price);
    }

    @Override
    public double accept(IOfferVisitor visitor) {
        return visitor.getPriceMobile(this);
    }

}
