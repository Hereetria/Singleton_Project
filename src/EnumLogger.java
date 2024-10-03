import java.util.ArrayList;
import java.util.List;

public enum EnumLogger {
    INSTANCE;

    private static int count;
    private String name;
    private List<String> logEntries;

    EnumLogger(){
        logEntries = new ArrayList<>();
    }

    public void log(String message){
        logEntries.add(message);
    }

    public List<String> getLogEntries(){
        return logEntries;
    }

    @Override
    public String toString() {
        return "EnumLogger{" +
                "logEntries=" + logEntries +
                '}';
    }
}
