import java.util.ArrayList;
import java.util.List;

public class BillPughLogger {

    private static int count;
    private String name;
    private List<String> logEntries;

    private BillPughLogger(){
        name = "Logger" + count;
        count++;
        logEntries = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public void log(String message){
        logEntries.add(message);
    }

    public List<String> getLogEntries(){
        return logEntries;
    }

    private static class SingletonHelper{
        private static final BillPughLogger INSTANCE = new BillPughLogger();
    }
    public static BillPughLogger getInstance(){
        return SingletonHelper.INSTANCE;
    }

    @Override
    public String toString() {
        return "Logger{" +
                "name='" + name + '\'' +
                ", logEntries=" + logEntries +
                '}';
    }
}
