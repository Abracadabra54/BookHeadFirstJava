package page128to142;

public class SimpleDotComGame {
    public static void main(String[] args){
        int numOfGuesses = 0; // Объявляем переменную для хранения кол-ва ходов пользователя
        // ??Объявляем переменную с длинной поля
        GameHelper helper = new GameHelper ();
        SimpleDotCom theDotCom = new SimpleDotCom();// Создаем экземпляр сайта
        // Генерируем для него расположение
        int randomNum = (int) (Math.random() * 5);// Вычисляем случайное число от 0 до 4 для начальной позиции
        int [] locations = {randomNum, randomNum+1, randomNum +2};// Добавляем ещё 2 ячейки
        theDotCom.setLocationCells(locations);// Вызываем метод установки адреса

        boolean isAlive = true;// Обявляем переменную для хранения состояния игры
        while (isAlive == true) { // Повторяем, пока сайт не потоплен
            // Предлагаем пользователю сделать ход
            // Получаем ввод пользователя
            String guess = helper.getUserInput("Make guess");
            String result = theDotCom.chekYourself(guess);// Вызываем метод проверки попадания
            numOfGuesses++;// Инкрементирем кол-во ходов
            // Если ПОТОПЛЕН конец
            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("you made " + numOfGuesses + " guesses");// Выводим кол-во ходов
            }
        }
    }
}
