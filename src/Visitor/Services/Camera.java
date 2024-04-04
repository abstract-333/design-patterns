package Visitor.Services;

import Visitor.Visitors.IOfferVisitor;

public class Camera extends Electronics {

    public Camera(String name, double price) {
        super(name, price);
    }

    @Override
    public double accept(IOfferVisitor visitor) {
        return visitor.getPriceCamera(this);
    }
}
