package page128to142;

public class SimpleDotCom {
    int[] locationCells; // массив для хранения адреса ячеек
    int numOfHits = 0; // переменная для хранения количества попаданий

    String chekYourself (String userGuess){
        String result = "miss";

        // Получаем ход пользователя
        // Преобразуем данные в int
        int guess = Integer.parseInt(userGuess);

        /*
        Цикл переработан, не как в книге.
        Для исключения из массива потопленных ячеек.
         */
        for (int x = 0; x<locationCells.length; x++) {// Повторяем с каждой ячейкой массива
            // Сравниваем ход пользователя с положением ячейки
            if (guess == locationCells[x]) {// Если угадал
                locationCells[x] = -1;
                result = "hit";
                numOfHits++;// Инкрементируем количество попаданий
                break;
            }
        }

         if (numOfHits == locationCells.length) {  // Была ли это последняя ячейка?
             result = "kill";// Если попаданий = 3, возвращаем ПОТОПИЛ
         }

         System.out.println(result);
         return result;
    }

    public void setLocationCells(int[] locs) {
        locationCells = locs; // Получаем адреса ячеек, присваем параметр полю, хранящему адреса
    }

}
