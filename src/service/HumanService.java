package service;

import model.Human;

public class HumanService {

    public static Human[] convert(String[] arrayHuman) {
        Human[] humans = new Human[arrayHuman.length];
        for (int i = 0; i < arrayHuman.length; i++) {
            Human human = new Human(arrayHuman[i]);
            humans[i] = human;
        }
        return humans;
    }

    public static void sort(Human[] humans) {
        Human newHumans;
        for (int i = 0; i < humans.length; i++) {
            for (int j = 1; j < humans.length - i; j++) {
                if (humans[i].getAge() < humans[j - 1].getAge()) {
                    newHumans = humans[j];
                    humans[j] = humans[j - 1];
                    humans[j - 1] = newHumans;
                }
            }
        }
        for (Human human : humans) {
            System.out.print(human);
        }
    }
}
