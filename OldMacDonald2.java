/**
 * This program sings the song Old MacDonald Had a Farm.
 *
 * Version 2 - singIt() method eliminates duplicate code and make it easier to add more animals.
 * 
 * @author Jon Cooper
 * @version August 18, 2016 (v0)
 */


public class OldMacDonald2 
{
    /**
     * This function sings the first line
     */
    public static void eieio() 
    { 
        System.out.println("Old MacDonald had a farm, E I E I O.");
    }

    /**
     * This function sings the second line, with the animal that gets passed in
     */
    public static void hadA(String animal) 
    { 
        System.out.println("And on that farm he had a " + animal + ", E I E I O.");
    }

    /**
     * This function sings the third and fourth lines, with the sound that gets passed in
     */
    public static void withA(String sound) 
    { 
        System.out.println("With a " + sound + " " + sound +  " here and a " + sound + " " + sound +  " there.");
        System.out.println("Here a " + sound + ", there a " + sound + ", everywhere a " + sound + ", " + sound + ".");  
    }

    /**
     * This function calls each of the lines to sing a verse, and passes on the animal/sound
     */    
    public static void singIt(String animal, String sound) 
    {
        eieio();
        hadA(animal);
        withA(sound);
        eieio();
        System.out.println();
    }

    /**
     * This function calls the singIt function, and takes/passes in the animal and sound for each verse
     */    
    public static void main(String[] args) 
    {
        System.out.println("Old MacDonald Had A Farm\n"); // Give our        song a title

        singIt("duck", "quack");
        singIt("cow", "moo");
        singIt("horse", "neigh");
        singIt("platypus","gdggdggddgdg");
        
        // now see how easy it is to add some more animals  
        
        
        // modify the methods above to get quotation marks around the animal sounds
    }
    
}
