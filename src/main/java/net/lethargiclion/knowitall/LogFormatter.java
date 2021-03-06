package net.lethargiclion.knowitall;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class LogFormatter extends Formatter {
    
    private java.util.Date dat;
    private java.text.DateFormat formatter;
    private static final java.lang.String format = "yyyy-MM-dd HH:mm:ss";
    
    public LogFormatter() {
        dat = new java.util.Date();
    }
    
    @Override
    public String format(LogRecord record) {
        
        if(formatter==null) formatter = new java.text.SimpleDateFormat(format);
        
        dat.setTime(record.getMillis());
        
        return String.format("%s %s%n", formatter.format(dat), record.getMessage());
    }

}
