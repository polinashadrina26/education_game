package factory;

public abstract class Character {

    protected String name;        
    protected String roomNumber;  


    public Character(String name) {
        this.name = name; 
    }

  
    public String getRoomNumber() {
        return roomNumber;
    }

  
    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

 
    public void setName(String playerName) {
        this.name = playerName;
    }

  
    public String getName() {
        return name; 
    }


    public void setHp(int hp) {
        // TODO: 
    }

  
    public void setIntelligence(int intelligence) {
        // TODO: 
    }


    public void setPower(int power) {
        // TODO: 
    }


    protected abstract void setDefence(int defence);
}