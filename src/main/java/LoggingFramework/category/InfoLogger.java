package LoggingFramework.category;

import LoggingFramework.sink.LogSubject;

public class InfoLogger extends AbstractLogger{

    public InfoLogger(int level){
        this.level = level;
    }
    @Override
    protected void display(String msg, LogSubject logSubject) {
        logSubject.notifyAllObservers(1, msg);
//        System.out.println("INFO " + msg);
    }
}
