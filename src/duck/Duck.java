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
public abstract class Duck {
    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;

    public Duck() {
    }
    
    public abstract void display();
    
    public void performFly(){
        flyBehavior.fly();
    }
    
    public void performQuack(){
        quackBehavior.quack();
    }
    
    public void swim(){
        System.out.println("Plavam ");
    }
    
    public void setQuackBehavior(QuackBehavior q){
        quackBehavior = q;
    }
    
    public void setFlyBehavior(FlyBehavior f){
        flyBehavior = f;
    }
}
