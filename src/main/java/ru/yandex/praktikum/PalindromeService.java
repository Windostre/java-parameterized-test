package ru.yandex.praktikum;
/** Для этого в коде используют методы класса String — они помогают работать со строками. О них ты узнаешь дальше в уроках: пока что детально разбираться не нужно.
    Напиши параметризованные тесты на метод isPalindrome:
     Напиши аннотацию @RunWith.
    Добавь поля класса: поле checkedText для проверяемой строки и поле expected для ожидаемого результата типа boolean.
    Добавь конструктор с параметрами.
    Напиши метод для получения тестовых данных getTestData() и тестовый метод shouldCheckPalindrome().
    В качестве тестовых данных используй такой набор:*/
public class PalindromeService {
    public boolean isPalindrome(String text) {
        String reversedText = new StringBuilder(text).reverse().toString();
        return text.equals(reversedText);
    }
}
