package Game;

/**
 * Created by lureyn on 06.05.17.
 */
public class Game {
   private World world;
   private Hero hero;
   Game()
   {
       hero = new Hero();
       world = new World(hero); //world loading relatively hero
   }
}
