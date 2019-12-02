package page168to183;

import java.io.*;
import java.util.*;

public class GameHelper {

    private static final String alphabet = "abcdefg";
    private int gridLength = 7;
    private int gridSize = 49;
    private int [] grid = new int[gridSize];
    private int comCount = 0;

    public String getUserInput (String promt){
        String inputLine = null;
        System.out.print(promt + " ");
        try{
            BufferedReader is = new BufferedReader(
                    new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) return null;
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
        return inputLine.toLowerCase();
    }

    public ArrayList<String> placeDotCom (int comSize){
        ArrayList<String> alphaCells = new ArrayList<String>();
        String [] alphacoords = new String [comSize];   // хранит координаты типа f6
        String temp = null;                             // временная строка для конкатенации
        int [] coords = new int[comSize];               // координаты текущего сайта
        int attempts = 0;                               // счетчик текущих попыток
        boolean success = false;                        // нашли подходящее местоположение?
        int location = 0;                               // текущее начальное местоположение

        comCount++;                                     // энный сайт для размещения
        int incr = 1;                                   // устанавливаем горизонтальный инкремент
        if ((comCount % 2) == 1){                       // если нечетный ...
            incr = gridLength;                          // ... устанавливаем вертикальный инкремент
        }

        while (!success && attempts++ < 200){           // главный поисковый цикл
            location = (int) (Math.random() * gridSize); // получаем случайную стартовую позицию
            //System.out.println("try " + location);     // выводим тестовые начальные координаты
            int x = 0;                                  // энная позиция в сайте, которую надо разместить
            success = true;                             // предполагаем успех
            while (success && x < comSize) {            // ищем соседнюю неиспользованную ячейку
                if (grid[location] == 0) {              // если еще не используется
                    coords[x++] = location;             // сохраняем местоположение
                    location += incr;                   // пробуем следующую соседнюю ячейку
                    if (location >= gridSize) {          // вышли за рамки - низ
                        success = false;                // неудача
                    }
                } else {
                    //System.out.println("is used " + location); // выводим сообщение о неудаче
                    success = false;                    // неудача
                }
            }
        }

        int x = 0;                                      // переводим местоположение в символьные координаты
        int row = 0;
        int column = 0;
        //System.out.println("\n");
        while (x < comSize){
            grid[coords[x]] = 1;                        // помечаем ячейка главной сетки как использованные
            row = (int) (coords[x] / gridLength);       // получаем значение строки
            column = coords[x] % gridLength;            // получаем значение столбца
            temp = String.valueOf(alphabet.charAt(column)); // преобразуем столбец в строковый символ

            alphaCells.add(temp.concat(Integer.toString(row)));
            x++;
            System.out.println(" coord " + x + " = " + alphaCells.get(x-1)); // где именно находится сайт
        }
        //System.out.print("\n");
        return alphaCells;
    }
}