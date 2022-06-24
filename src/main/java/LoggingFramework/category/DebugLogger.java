package LoggingFramework.category;

import LoggingFramework.sink.LogSubject;

public class DebugLogger extends AbstractLogger{

    public DebugLogger(int level){
        this.level = level;
    }
    @Override
    protected void display(String msg, LogSubject logSubject) {
        logSubject.notifyAllObservers(3, msg);
//        System.out.println("DEBUG: " + msg);
    }
}
