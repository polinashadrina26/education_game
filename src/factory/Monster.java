package factory;

public class Monster extends Fighter {
   
    private String name;    
    private int hp;        
    private int power;   
    private int defence;   
    private Difficulty difficulty;
	public boolean getHP; 

  
    public Monster(String name, int hp, int power, int defence, Difficulty difficulty) {
        super(name, hp); 
        this.hp = hp;
        this.power = power;
        this.defence = defence;
        this.difficulty = difficulty;
    }


    public Monster(String name, int hp) {
        super(name, hp); 
        this.hp = hp;
        this.power = 0; 
        this.defence = 0; 
        this.difficulty = Difficulty.MEDIUM; 
    }

 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public int getPower() {
        return power;
    }

    @Override
    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public int getDefence() {
        return defence;
    }

    @Override
    public void setDefence(int defence) {
        this.defence = defence;
    }

    public Difficulty getDifficulty() { 
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public static void add(Monster monster) {
        // TODO: 
    }

    public void takeDamage(int playerDamage) {
      
        int damageTaken = playerDamage - defence;
        if (damageTaken > 0) {
            hp -= damageTaken; 
        }
    }

    public int attack() {

        return power;
    }
}