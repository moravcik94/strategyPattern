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
public class FlyLikeARocket implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("Flying like a rocket");
    }
    
}
