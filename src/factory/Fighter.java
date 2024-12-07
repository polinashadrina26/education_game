package factory;


public abstract class Fighter extends Character {

    protected int hp;      
    protected int power;   
    protected int defence; 

    public Fighter(String name, int hp) {
        super(name); 
        this.hp = hp; 
        this.power = 0; 
        this.defence = 0; 
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp; 
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power; 
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence; 
    }
}
