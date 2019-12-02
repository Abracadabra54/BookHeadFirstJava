package page128to142;

public class SimpleDotComTestDrive {
    public static void main (String[] args) {
        SimpleDotCom dot = new SimpleDotCom();// Создаем экземпляр SimpleDotCom

        // Присваиваем ему местоположение
        int [] locations = {2,3,4};
        dot.setLocationCells(locations);

        String userGuess = "2";// Создаем строку хода пользователя

        String result = dot.chekYourself(userGuess);// Вызываем метод checkYourself

        // Выводим на экран результат
        String testResult = "fail";
        if (result.equals("hit")){
            testResult = "done";
        }
        System.out.println(testResult);
    }
}
