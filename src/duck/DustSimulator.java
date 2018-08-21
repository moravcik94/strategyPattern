/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duck;

/**
 *
 * @author jakub.moravcik
 */
public class DustSimulator {
    public static void main(String[] args) {
        Duck mallard = new MalardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();
        mallard.swim();
        
        Duck gumeDuck = new GumenaKacica();
        gumeDuck.display();
        gumeDuck.performFly();
        gumeDuck.performQuack();
        gumeDuck.swim();
        
        gumeDuck.setFlyBehavior(new FlyLikeARocket());
        gumeDuck.performFly();

    }
}
