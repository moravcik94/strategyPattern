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
public class MalardDuck extends Duck{

    public MalardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    
    
    @Override
    public void display() {
        System.out.println("Som malard duck");
    }
    
}
