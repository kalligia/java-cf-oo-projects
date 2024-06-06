package ch14;

import java.sql.Timestamp;

public class Logger {
    private static final Logger INSTANCE = new Logger();

    private Logger() {

    }

    public static Logger getInstance() {
        return INSTANCE;
    }

    public void logMessage(String message) {
        System.err.println(message + " " + System.currentTimeMillis() );
    }
}

