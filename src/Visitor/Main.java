package Visitor;

import Visitor.Services.Camera;
import Visitor.Services.Computer;
import Visitor.Services.Electronics;
import Visitor.Services.Mobile;
import Visitor.Visitors.BlackFridayPolicyVisitor;
import Visitor.Visitors.NormalPolicyVisitor;
import Visitor.Visitors.OfferPolicyVisitor;

public class Main {
    public static void main(String[] args) throws Exception {
        Electronics mobileSamusungS24 = new Mobile("Samsung S23", 800);
        Electronics cameraNikonZfc = new Camera("Nikon Z fc", 956);
        Electronics computerLenovoThinkPad = new Computer("Lenovo ThinkPad", 730);

        System.out.println(mobileSamusungS24.toString(new NormalPolicyVisitor()));
        System.out.println(mobileSamusungS24.toString(new OfferPolicyVisitor()));
        System.out.println(mobileSamusungS24.toString(new BlackFridayPolicyVisitor()));

        System.out.println(cameraNikonZfc.toString(new NormalPolicyVisitor()));
        System.out.println(cameraNikonZfc.toString(new OfferPolicyVisitor()));
        System.out.println(cameraNikonZfc.toString(new BlackFridayPolicyVisitor()));

        System.out.println(computerLenovoThinkPad.toString(new NormalPolicyVisitor()));
        System.out.println(computerLenovoThinkPad.toString(new OfferPolicyVisitor()));
        System.out.println(computerLenovoThinkPad.toString(new BlackFridayPolicyVisitor()));

    }
}
