package day03;


public class Monster implements Damagable{
    
private String name;
private int hitPoints;
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public int getHitPoints() {
    return hitPoints;
}
public void setHitPoints(int hitPoints) {
    this.hitPoints = hitPoints;
}

//below one of the implementations of interface Damageable
public void damage(int damage){
    this.hitPoints -= damage;
}

//below another implementation of interface D"
public int getDamage(){
    return this.hitPoints;
}

public String toString(){
    return "monster{name=%s, hitPoints=%d}".formatted(getName(), getHitPoints());

}




}
