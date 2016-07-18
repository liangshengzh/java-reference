package info.liangsheng.pattern.strategy.callback;

/**
 * Created by zhong on 7/13/16.
 */
public class JdbcSqlExeception extends RuntimeException {

    public JdbcSqlExeception(String message, Throwable cause) {
        super(message, cause);
    }
}
