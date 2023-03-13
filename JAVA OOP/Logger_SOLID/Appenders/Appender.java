package Appenders;

import Loggers.MessageLogger;
import layouts.Layout;

public interface Appender {

    void append(String timeStamp, MessageLogger.LogLevel logLevel, String message);
    Layout getLayout();
    int getMessagesCount();
}
