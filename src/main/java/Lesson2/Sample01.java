package Lesson2;

import java.util.ArrayList;

public class Sample01 {

    public String data = """
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

abstract class LogReader{

    private Integer currentPosition = 0;

    public Integer getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(Integer currentPosition) {
        this.currentPosition = currentPosition;
    }

    public Iterable<LogEntry> readEntry(){
        ArrayList<LogEntry> logList= new ArrayList<>();

        for (String s:readEntries(currentPosition)) {
            logList.add(parseLogEntry(s));
        }


        return logList;
    }

    protected abstract Iterable<String> readEntries(Integer position);

    protected abstract LogEntry parseLogEntry(String stringEntry);

}

class PoemReader extends LogReader {  // наследование от LogReader

    private String data;

    public PoemReader(String data) {
        this.data = data;
    }

    @Override
    protected Iterable<String> readEntries(Integer position) {
        return null;
    }

    @Override
    protected LogEntry parseLogEntry(String stringEntry) {
        return null;
    }
}
