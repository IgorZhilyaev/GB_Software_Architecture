package Lesson2;

import java.util.ArrayList;
import java.util.Scanner;

public class Sample01 {

    public static String data = """
            У лукоморья дуб зеленый;
            Златая цепь на дубе том:
            И днем и ночью кот ученый
            Все ходит по цепи кругом;
            Идет направо - песнь заводит,
            Налево - сказку говорит.
                        
            Там чудеса: там леший бродит,
            Русалка на ветвях сидит;
            Там на неведомых дорожках
            Следы невиданных зверей;
            Избушка там на курьих ножках
            Стоит без окон, без дверей;
            Там лес и дол видений полны;
            Там о заре прихлынут волны
            На брег песчаный и пустой,
            И тридцать витязей прекрасных
            Чредой из вод выходят ясных,
            И с ними дядька их морской;
            Там королевич мимоходом
            Пленяет грозного царя;
            Там в облаках перед народом
            Через леса, через моря
            Колдун несет богатыря;
            В темнице там царевна тужит,
            А бурый волк ей верно служит;
            Там ступа с Бабою Ягой
            Идет, бредет сама собой;
            Там царь Кащей над златом чахнет;
            Там русской дух... там Русью пахнет!
            И там я был, и мед я пил;
            У моря видел дуб зеленый;
            Под ним сидел, и кот ученый
            Свои мне сказки говорил.
            Одну я помню: сказку эту
            Поведаю теперь я свету...
            """;

    public static void main(String[] args) {

        LogReader logReader = new PoemReader(data);

        //logReader.setCurrentPosition(30); // изменяем позицию

        for (LogEntry log:logReader.readLogEntry()) {
            System.out.println(log.getText()); // обращаемся к логу и применяем метод getText
        }
         // возвращает коллекцию типа logEntry, перечисляем коллекцию

    }

}

// Запись лога

class LogEntry{

    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public LogEntry(String text) {
        this.text = text;
    }
}

abstract class LogReader{ // абстрактный класс который будет считывать откуда нибудь логи, наш каркас

    private Integer currentPosition = 0; // текущая позиция

    public Integer getCurrentPosition() {
        return currentPosition;
    }

    public abstract void setDatasource(Object data);
    public abstract Object getDatasource();
    public void setCurrentPosition(Integer currentPosition) {
        this.currentPosition = currentPosition;
    }

    public Iterable<LogEntry> readLogEntry(){ // шаблонный метод, некий каркасс в который наследники могут подскавлять реализацию недостающих элементов
        ArrayList<LogEntry> logList= new ArrayList<>(); // пустая коллекция

        for (String s:readEntries(currentPosition)) { // возвращает лог в виде строки
            logList.add(parseLogEntry(s)); // помещаем объект типа lpgEntry в коллекцию logList
        }


        return logList;
    }

    // метод будет считывать данные из какого-то источника и возвращать коллекцию типа String
    protected abstract Iterable<String> readEntries(Integer position); // position - с какой строки лога будет считываться

    // метод преобразующий строку в объект logEntry
    protected abstract LogEntry parseLogEntry(String stringEntry); // на вход подаётся строка

}

class PoemReader extends LogReader {  // наследование от LogReader, класс который млжет читать поэмы и т.д.

    private String data; // вспомогательная переменная

    public void setData(String data) {
        this.data = data;
    }

    // конструктор для инициализации данных
    public PoemReader(String data) {
        this.data = data;
    }

    // конструктор по умолчанию
    public PoemReader() {
    }


    @Override
    public void setDatasource(Object data) {
        this.data = data.toString();
    }

    @Override
    public Object getDatasource() {
        return data;
    }

    // имплементировали абстрактные методы из LogReader
    @Override
    protected Iterable<String> readEntries(Integer position) {
        Scanner scanner = new Scanner(data);
        ArrayList<String> logEntry = new ArrayList<>();// коллекция которая будет содержать все наши считанные cтроки
        int counter = 0; // вспомогательная переменная
        while (scanner.hasNextLine()){ // возвращает булевое значение и отвечает на вопрос существуе ли строка в потоке данных сканер которую можно считать
            if(counter >= position){
                position = counter;
                String line = scanner.nextLine(); // считать строку
                logEntry.add(line); // сохранить строку в коллекцию ljgEntry
            } else {
                scanner.nextLine(); // просто считываем данные но никуда не сохраняем
            }
            counter++;
        }
        return logEntry;
    }

    @Override
    protected LogEntry parseLogEntry(String stringEntry) {
        return new LogEntry(stringEntry);
    } // возвращаем объект типа logEntry, передаём в качестве параметра ссылку на саму строку
}

// шаблонный метод определяет основу алгоритма и позволяет подклассам переопределять некоторые шаги алгоритма,
// т.е. должен быть метод который определяет какой- то базовый адгоритм
