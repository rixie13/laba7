package org.example;

import weapons.*;

public class Player {
    // Указываем тип данных Weapon, который будет храниться в "слотах игрока"
    public static Weapon[] weaponSlots;

    public Player() {
        // Снаряжаем нашего игрока
        weaponSlots = new Weapon[] {
            new Pistol("Пистолет Макарова","30 патронов"),
            new RPG("Ручной переносной гранатомет РПГ-7","1 граната"),
            new Rifle("Автомат Калашникова Модернизированный","30 патронов"),
            new Rogatka("Самодельная рогатка","Косточки от вишни"),
            new WaterGun("Черный ватерган","1 литр воды")
        };
    }

    public int getSlotsCount() {
        // length - позволяет узнать, сколько всего слотов с оружием у игрока
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        // TODO проверить на выход за границы
        if(slot> weaponSlots.length){
            System.out.println("Значение некорректно");
            System.exit(1);
        }
        // если значение slot некорректно, то
        // выйти из метода написав об этом в консоль

        // Получаем оружие из выбранного слота
        Weapon weapon = weaponSlots[slot];
        // Огонь!
        weapon.shot();
    }
}


