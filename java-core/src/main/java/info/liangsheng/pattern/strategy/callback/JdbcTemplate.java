package info.liangsheng.pattern.strategy.callback;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by zhong on 7/13/16.
 */
public class JdbcTemplate {

    public void query(String sql, RowCallbackHandler handler) throws JdbcSqlExeception{

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;

        try{

            //... get connection
            preparedStatement = connection.prepareStatement(sql);
            rs = preparedStatement.executeQuery();
            while (rs.next()){
                handler.processRow(rs);
            }
            preparedStatement.close();
            rs.close();
            connection.close();
        }catch (SQLException ex){
            throw new JdbcSqlExeception("cound't not execute sql "+ sql, ex);
        }finally {

        }
    }
}
