package page168to183;

import java.util.*;

public class DotCom {
    private ArrayList<String> locationCells; // список для хранения адреса ячеек
    private String name;

    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc; // Получаем адреса ячеек, присваем параметр полю, хранящему адреса
    }

    public void setName(String n){
        name = n;
    }

    public String checkYourself (String userInput){
        String result = "miss";
        int index = locationCells.indexOf(userInput); // Проверяем, содержится ли ход пользователя в списке адресов сайта

        if (index >= 0) { // Если больше 0, значит пользователь угадал одну из ячеек
            locationCells.remove(index); // удаляем угаданную ячейку из списка адресов

            if (locationCells.isEmpty()){
                result = "kill";
                System.out.println("You killed " + name);
            } else {
                result = "hit";
            }
        }
        return result;
    }
}
