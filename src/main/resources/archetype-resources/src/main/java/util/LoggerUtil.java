package $

{package}.util;

  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import org.springframework.boot.logging.LogLevel;

/**
 * A logger utility class
 */

public class LoggerUtil {

  private static Class getCallerClass() {
    try {
      String callerClassName = Thread.currentThread().getStackTrace()[3].getClassName();
      return Class.forName(callerClassName);
    } catch (ClassNotFoundException e) {
      Logger logger = LoggerFactory.getLogger(LoggerUtil.class);
      logger.error("Exception ", e);
    }
    return LoggerUtil.class;
  }

  public static void logError(String message) {
    Logger logger = LoggerFactory.getLogger(getCallerClass());
    logger.error(message);
  }

  public static void logError(String message, Object... params) {
    Logger logger = LoggerFactory.getLogger(getCallerClass());
    logger.error(message, params);
  }

  public static void logInfo(String message) {
    Logger logger = LoggerFactory.getLogger(getCallerClass());
    logger.info(message);
  }

  public static void logInfo(String message, Object... params) {
    Logger logger = LoggerFactory.getLogger(getCallerClass());
    logger.info(message, params);
  }

  public static void logDebug(String message) {
    Logger logger = LoggerFactory.getLogger(getCallerClass());
    logger.debug(message);
  }

  public static void logDebug(String message, Object... params) {
    Logger logger = LoggerFactory.getLogger(getCallerClass());
    logger.debug(message, params);
  }

  public static void logError(String message, Throwable ex) {
    Logger logger = LoggerFactory.getLogger(getCallerClass());
    logger.error(message, ex);
  }

  public static void logInfo(String message, Throwable ex) {
    Logger logger = LoggerFactory.getLogger(getCallerClass());
    logger.info(message, ex);
  }

  public static void logDebug(String message, Throwable ex) {
    Logger logger = LoggerFactory.getLogger(getCallerClass());
    logger.debug(message, ex);
  }

  public static long logEnter(LogLevel logType, String methodName) {
    Logger logger = LoggerFactory.getLogger(getCallerClass());
    if (logType.equals(LogLevel.INFO)) {
      logger.info("ENTER - {}()", methodName);
    } else {
      logger.debug("ENTER - {}()", methodName);
    }
    return System.currentTimeMillis();
  }


  public static long logEnter(LogLevel logType, String methodName, Object... params) {
    Logger logger = LoggerFactory.getLogger(getCallerClass());
    if (logType.equals(LogLevel.INFO)) {
      logger.info("ENTER - {}({})", methodName, params);
    } else {
      logger.debug("ENTER - {}({})", methodName, params);
    }
    return System.currentTimeMillis();
  }

  public static void logExit(LogLevel logType, String methodName, long startTime) {
    Logger logger = LoggerFactory.getLogger(getCallerClass());
    long runTime = System.currentTimeMillis() - startTime;
    if (logType.equals(LogLevel.INFO)) {
      logger.info("EXIT - {}() in {}ms", methodName, runTime);
    } else {
      logger.debug("EXIT - {}() in {}ms", methodName, runTime);
    }
  }

  public static void logExit(LogLevel logType, String methodName) {
    Logger logger = LoggerFactory.getLogger(getCallerClass());
    if (logType.equals(LogLevel.INFO)) {
      logger.info("EXIT - {}()", methodName);
    } else {
      logger.debug("EXIT - {}()", methodName);
    }
  }

  public static void logExit(LogLevel logType, String methodName, Object returnValue, long startTime) {
    Logger logger = LoggerFactory.getLogger(getCallerClass());
    long runTime = System.currentTimeMillis() - startTime;
    if (logType.equals(LogLevel.INFO)) {
      logger.info("EXIT - {}() in {}ms > {}", methodName, runTime, returnValue);
    } else {
      logger.debug("EXIT - {}() in {}ms > ({})", methodName, runTime, returnValue);
    }
  }

  public static void logExit(LogLevel logType, String methodName, Object returnValue) {
    Logger logger = LoggerFactory.getLogger(getCallerClass());
    if (logType.equals(LogLevel.INFO)) {
      logger.info("EXIT - {}() > {}", methodName, returnValue);
    } else {
      logger.debug("EXIT - {}() > ({})", methodName, returnValue);
    }
  }
}