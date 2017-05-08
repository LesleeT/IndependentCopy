/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package independentcopy;

/**
 *
 * @author ltrinastic
 */
public class AnimalFactory {
    private static AnimalFactory instance;
  
    //not as common to use static method like this, but it still works
//    static {
//        AnimalFactory.instance = new AnimalFactory();
//    }
    
    //define the constructor private, it forbids it's usage outside the class
    private AnimalFactory() {
    }
    
    public  Animal getAnimalInstance(AnimalType animalType){

        if(animalType == AnimalType.DOG){
            return new Dog();           
        }else if(animalType == AnimalType.CAT){
            return new Cat();
        }
        else if (animalType == AnimalType.DUCK){
            return new Duck();      
        }else{
            return null;
        }       
    }
    
    
    
}
