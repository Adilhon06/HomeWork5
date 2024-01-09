public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(900);
        boss.setDamage(250);
        boss.setDefendType("Physical");
        System.out.println("Здоровье Босса:" + boss.getHealth());
        System.out.println("Урон Босса: " + boss.getDamage());
        System.out.println("Тип защиты Босса: " + boss.getDefendType());
    }
}