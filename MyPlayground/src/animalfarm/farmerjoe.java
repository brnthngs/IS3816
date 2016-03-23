/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalfarm;

/**
 *
 * @author wetteb
 */
public class farmerjoe
{

    public static void main(String[] args)
    {
        animal animal = new animal();
        bird bird = new bird();
        dog dog = new dog();

        System.out.println();

        animal.sleep();
        animal.eat();

        bird.sleep();
        bird.eat();

        dog.sleep();
        dog.eat();
    }
}
