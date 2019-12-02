package page168to183;

import java.util.*;

public class DotComBust {
    // объявляем и инициируем переменные, которые нам понадобятся
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    private void setUpGame (){
        // создадим несколько сайтов и присвоим им адреса
        // Создаем 3 объекта DotCom
        // даем им имена
        // помещаем в ArrayList
        DotCom one = new DotCom();
        one.setName ("Pets.com");
        DotCom two = new DotCom();
        two.setName ("eToys.com");
        DotCom three = new DotCom();
        three.setName ("Go2.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        // выводим краткие инструкции для пользвоателя
        System.out.println("You need kill 3 \"sites\".");
        System.out.println("Pets.com, eToy.com, Go2.com");
        System.out.println("Try to do it in minimal guesses.");

        for (DotCom dotComToSet : dotComsList){
            // запрашиваем у вспомогательного объекта адрес сайта
            ArrayList<String> newLocation = helper.placeDotCom (3);
            // вызываем сеттер из объекта DotCom,   чтобы передать ему местоположение,
            // которое только что получили от вспомогательного объекта
            dotComToSet.setLocationCells(newLocation);
        }
    }

    private void startPlaing (){
        while (!dotComsList.isEmpty()){ // до тех пор. пока список DotCom не станет пустым
            String userGuess = helper.getUserInput("Make your guess"); // получаем пользовательский ввод
            checkUserGuesses(userGuess); // вызываем наш метод checkUserGuesses
        }
        finishGame(); // вызываем наш метод finishGame
    }

    private void checkUserGuesses (String userGuess) {
        numOfGuesses++; // инкрементируем количество попыток пользователя
        String result = "miss"; // предполагаем промах, пока не выяснили обратного

        for (DotCom dotComToTest : dotComsList){ // повторяем это для всех объектов DotCom в списке
            result = dotComToTest.checkYourself(userGuess); // просим DotCom проверить ход пользователя
            // выбираемся из цикла раньше времени, нет смысла проверять остальные сайты
            if (result.equals("hit")){
                break;
            }
            // ему конец, так что удалем его из списка сайтов и выходим из цикла
            if (result.equals("kill")) {
                dotComsList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame(){
        System.out.println("Game over.");
        // выводим сообщение о том, как пользователь прошел игру
        if (numOfGuesses >20){
            System.out.println("It takes you " + numOfGuesses + " guesses"); // выводим результат
            System.out.println("You can play better");
        } else {
            System.out.println("It takes you " + numOfGuesses + " guesses"); // выводим результат
            System.out.println("You are great");
        }
    }

    public static void main (String [] args){
        DotComBust game = new DotComBust(); // создаем игровой объект
        game.setUpGame(); // говорим игровому объекту, подготовить игру
        game.startPlaing(); // говорим главному игровому объекту начать главный игровой цикл
    }
}
