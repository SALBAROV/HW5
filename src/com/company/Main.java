package com.company;

public class Main {

    private static Object Boss;

    public static void main(String[] args) {
	Boss boss = new Boss();
	boss.setHeals(150);
	boss.setDamage(50);
	boss.setWeapon(new Weapon("typeWeapon","nameWepon"));


        System.out.println("Boss heals: " +boss.getHeals()+ "" +
                " BossDamage " +boss.getDamage()+ boss.weapon.getTypeWeapon() + boss.weapon.getNameWepon());
    }
}
