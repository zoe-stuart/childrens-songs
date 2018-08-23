/**
 * This program sings the song "Ants Go Marching."
 * lyrics: http://kids.niehs.nih.gov/lyrics/antsgo.htm
 *
 * @author  Zoe
 * @version 2018-08-22
 */

public class AntsGoMarching 
{
    /**
     * Sings the first two lines.
     *
     * @param number (as a word) for how the ants march
     */
    public static void goMarching(String number) 
    {
        System.out.println("The ants go marching " + number + " by " + number);
        System.out.println("Hurrah, hurrah");
    }
    
    /**
     * Sings the third line.
     *
     * @param number (as a word) for how the ants march
     */ 
    public static void noHurrah(String number)
    {
        System.out.println("The ants go marching " + number + " by " + number);
    }
    
    /**
     * Sings the 4th line about the little ant.
     *
     * @param action What the little one stops to do
     */
    public static void littleAnt(String action)
    {   
        System.out.println("The little one stops to " + action);
    }
    
    /**
     * Sings the last two lines of each verse.
     */ 
    public static void rain() 
    {
        System.out.println("And they all go marching down, to the ground, to get out, of the rain");
        System.out.println("Boom boom boom");
    }

    /**
     * Sings a verse of Ants Go Marching.
     * 
     * @param number Number (as a word) for how the ants march
     * @param action What the little one stops to do
     */
    public static void singIt(String n, String action) 
    {
        goMarching(n);
        goMarching(n);
        noHurrah(n);
        littleAnt(action);
        rain();
        
    }

    /**
     * Calls the singIt() for each verse.
     */
    public static void main(String[] args) 
    {
        System.out.println("Ants Go Marching\n");
        
        singIt("one","suck his thumb");
        singIt("two", "tie his shoe");
        singIt("three", "climb a tree");
        singIt("four", "shut the door");
        singIt("five", "take a dive");
        singIt("six", "pick up sticks");
        singIt("seven", "pray to heaven");
        singIt("eight", "roller skate");
        singIt("nine", "check the time");
        singIt("ten", "shout, 'The End'");
    }
   
}
