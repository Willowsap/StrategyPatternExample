package rpg;

/**
 * Warrior rpg class.
 * 
 * @author Willow Sapphire
 * @version 06/08/2023
 */
public class Warrior extends Player
{
    /**
     * Constructs a warrior.
     * 
     * @param name the warrior's name.
     */
    public Warrior(String name)
    {
        super(name);
    }

    /**
     * Defends by raising a shield.
     * So basic.
     */
    @Override
    public void defend()
    {
        System.out.println("*raises shield*");
    }

    /**
     * Attacks with a sword.
     * So basic.
     */
    @Override
    public void attack()
    {
        System.out.println("*swings sword*");
    }
}