package Game.Hero;

/**
 * Created by lureyn on 06.05.17.
 */
public class Hero {
    private Content content;
    private HeroEngine heroengine;
    Hero ()
    {
        content = new Content();
        heroengine = new HeroEngine(content);
    }
}
