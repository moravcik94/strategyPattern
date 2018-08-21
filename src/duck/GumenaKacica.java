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
public class GumenaKacica extends Duck{

    public GumenaKacica() {
        quackBehavior = new Squack();
        flyBehavior = new FlyNoWay();
    }


    @Override
    public void display() {
        System.out.println("Som gumena kacka a plavam");
    }
    
}
