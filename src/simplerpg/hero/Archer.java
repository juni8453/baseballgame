package simplerpg.hero;

public class Archer implements HeroInterface {
    private String name;
    private int healthPoint;
    private int manaPoint;
    private int attackPoint;
    private int defencePoint;
    private int money;
    private int level;

    public Archer(String name) {
        this(200, 150, 12, 8, 50, 1);
        this.name = name;
    }

    Archer(int healthPoint, int manaPoint, int attackPoint, int defencePoint, int money, int level) {
        this.healthPoint = healthPoint;
        this.manaPoint = manaPoint;
        this.attackPoint = attackPoint;
        this.defencePoint = defencePoint;
        this.money = money;
        this.level = level;
    }


    @Override
    public void attackedMonster(int attackDamage) {
        this.healthPoint = this.healthPoint - attackDamage;
    }

    @Override
    public void buyItem() {

    }

    @Override
    public void useHealthPotion() {

    }

    @Override
    public void useManaPotion() {

    }


    public String getName() {
        return name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public int getManaPoint() {
        return manaPoint;
    }

    public int getAttackPoint() {
        return attackPoint;
    }

    public int getDefencePoint() {
        return defencePoint;
    }

    public int getMoney() {
        return money;
    }

    public int getLevel() {
        return level;
    }
}
