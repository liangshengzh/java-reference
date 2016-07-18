package info.liangsheng.pattern.strategy.callback;

import java.sql.ResultSet;

/**
 * Created by zhong on 7/13/16.
 */
public interface RowCallbackHandler {
    void  processRow(ResultSet rs);
}
