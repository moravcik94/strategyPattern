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
public class Game {
    public static void main(String[] args) {
        Character cs = new King();
        Character as = new Knight();
        Character ass = new Troll();
        Character ase = new Queen();
        cs.fight();
        as.fight();
        ass.fight();
        ase.fight();
        ase.setWapeonBeh(new AxeBehavior());
        ase.fight();
        
    }
}
