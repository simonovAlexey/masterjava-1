package ru.javaops.masterjava.service.mail;

import ru.javaops.web.handler.SoapLoggingHandlers;
import ru.javaops.web.handler.SoapServerSecurityHandler;

public class MailHandlers {
    public static class SecurityHandler extends SoapServerSecurityHandler {
        public SecurityHandler() {
            super(MailWSClient.getHostConfig().authHeader);
        }
    }

    public static class LoggingHandler extends SoapLoggingHandlers.ServerHandler {
        public LoggingHandler() {
            super(MailWSClient.getHostConfig().serverDebugLevel);
        }
    }
}
