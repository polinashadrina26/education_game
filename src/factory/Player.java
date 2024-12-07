package factory;

public class Player extends Fighter {
    private int intelligence; 

    public Player(String name, int hp) {
        super(name, hp); 
        this.intelligence = 0; 
    }

    public int getIntelligence() { 
        return intelligence;
    }

    public void setIntelligence(int intelligence) { 
        this.intelligence = intelligence;
    }

    @Override
    public String toString() {
        return "Player [intelligence=" + intelligence + ", hp=" + hp + ", power=" + power + ", defence=" + defence + ", name="
                + name + ", roomNumber=" + roomNumber + "]"; 
    }

    public void setHp(int hp) { 
        this.hp = hp; 
    }

    public void setPower(int power) { 
        this.power = power; 
    }

    public void setDefence(int defence) { 
        this.defence = defence; 
    }

    public int attack() {

        return power; 
    }

    public void takeDamage(int monsterDamage) {
        this.hp -= monsterDamage; 
        if (this.hp < 0) {
            this.hp = 0; 
        }
    }
}