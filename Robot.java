public class Robot extends Traveller{

    private int health=100;

    public void die()
    {
        //robot dies
        Game.travellers.remove(this);
    }

    public void Damage()
    {
        health-=50;
    }

    public int getDamage()
    {
        return health;
    }


}