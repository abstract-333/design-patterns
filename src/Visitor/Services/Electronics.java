package Visitor.Services;

import Visitor.Visitors.IOfferVisitor;

abstract public class Electronics {
    protected String name;
    protected double price;

    protected Electronics(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    };

    public abstract double accept(IOfferVisitor visitor);

    public String toString(IOfferVisitor visitor) {
        return String.format("%1$s (%2$s): %3$.2f $", this.getClass().getSimpleName(),
                visitor.getClass().getSimpleName(), this.accept(visitor));

    };

}
