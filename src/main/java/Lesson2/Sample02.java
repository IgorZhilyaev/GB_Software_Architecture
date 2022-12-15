package Lesson2;

public class Sample02 {

    public static void main(String[] args) {

    ConcreteReaderCreator concreteReaderCreator = new ConcreteReaderCreator();
    LogReader logReader = concreteReaderCreator.createLogReader(LogType.Poem);
    logReader.setDatasource(Sample01.data);

        for (LogEntry log: logReader.readLogEntry()) {
            System.out.println(log.getText());

        }

    }
}

enum LogType{
    Text,
    Poem,
    DataBase,
    System
}

abstract class BaseLogReaderCreater{

    public LogReader createLogReader(LogType logType){

        LogReader logReader = createLogReaderInstance(logType);

        return logReader;
    }

    // фабричный метод, может создавать экземпляры типа LogReader
    protected abstract LogReader createLogReaderInstance(LogType logType);

}

class ConcreteReaderCreator extends BaseLogReaderCreater{

    @Override
    protected LogReader createLogReaderInstance(LogType logType) {
        return switch (logType){
            case Poem -> new PoemReader();
            case Text -> new TextFileReader();
            case DataBase -> new DatabaseReader();
            case System -> new OperationSystemLogEventReader();
        };
    }

}



class TextFileReader extends LogReader{


    @Override
    public void setDatasource(Object data) {

    }

    @Override
    public Object getDatasource() {
        return null;
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

class DatabaseReader extends LogReader{


    @Override
    public void setDatasource(Object data) {

    }

    @Override
    public Object getDatasource() {
        return null;
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

class OperationSystemLogEventReader extends LogReader{

    @Override
    public void setDatasource(Object data) {

    }

    @Override
    public Object getDatasource() {
        return null;
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
