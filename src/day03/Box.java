package day03;

public class Box implements Damagable{

    private int integrity = 3;

    public int getIntegrity() {
        return integrity;
    }

    public void setIntegrity(int integrity) {
        this.integrity = integrity;
    }

    @Override
    public void damage(int damage) {
        this.integrity -= 1;
    }

    @Override
    public int getDamage() {
        //
        return this.integrity;
    }

    
    
    
}
