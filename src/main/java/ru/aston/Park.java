package ru.aston;

import java.util.Date;

public class Park {
    private Attraction[] cosmoPark = new Attraction[0];

    public void addNewAtr(Attraction newAtr) {
        for (Attraction atr : cosmoPark)
            if (atr.ID == newAtr.ID) {
                System.out.println("Аттракцион с таким ID уже существует");
                return;
            }
        Attraction[] tmp = new Attraction[cosmoPark.length + 1];
        for (int i = 0; i < cosmoPark.length; i++) {
            tmp[i] = cosmoPark[i];
        }
        tmp[tmp.length - 1] = newAtr;
        cosmoPark = tmp;
    }

    public void showInfo(int ID) {
        for(Attraction atr : cosmoPark) {
            if (atr.ID == ID) {
                System.out.println("Информмация об аттракционе:");
                System.out.println("Название: " + atr.atrName);
                System.out.println("Время работы: " + atr.workingHours);
                System.out.println("Стоимость: " + atr.cost);
            }
        }
    }

    public Attraction[] getCosmoPark() {
        return cosmoPark;
    }
}
