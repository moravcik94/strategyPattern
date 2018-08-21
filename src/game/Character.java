/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author jakub.moravcik
 */
public abstract class Character {
    protected WeaponBehavior weaponBehavior;
    
    public void setWapeonBeh(WeaponBehavior wb){
        weaponBehavior = wb;
    }
    
    public void fight(){
        weaponBehavior.useWeapon();
    }
}
