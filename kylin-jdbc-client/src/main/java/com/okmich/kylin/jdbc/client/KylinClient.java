/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.okmich.kylin.jdbc.client;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author michael.enudi
 */
class KylinClient {

    private Connection connection;

    KylinClient(String db, String username, String password) {
        try {
            Driver driver = (Driver) Class.forName("org.apache.kylin.jdbc.Driver").newInstance();

            Properties info = new Properties();
            info.put("user", username);
            info.put("password", password);
            this.connection = driver.connect("jdbc:kylin://localhost:7070/" + db, info);

        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(KylinClient.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Error occured instantiating Kylin Client", ex);
        }
    }

    void runQuery(String query) throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(query);
        ResultSetMetaData rsmd = rs.getMetaData();

        int colCount = rsmd.getColumnCount();
        int[] colTypes = new int[colCount];
        StringBuilder columns = new StringBuilder("|");
        for (int i = 1; i <= colCount; i++) {
            columns.append(rsmd.getColumnName(i)).append('|');
            colTypes[i - 1] = rsmd.getColumnType(i);
        }
        System.out.println("\n" + columns.toString());

        StringBuilder rowValues = new StringBuilder("|");
        while (rs.next()) {
            rowValues.delete(0, rowValues.length()).append("|");
            for (int i = 1; i <= colCount; i++) {
                rowValues.append(readColumn(rs, i, colTypes));
            }
            System.out.println(rowValues);
        }

    }

    private String readColumn(ResultSet rs, int i, int[] colTypes) throws SQLException {

        switch (colTypes[i]) {
            case Types.BOOLEAN:
                return ret(rs.getBoolean(i + 1));
            case Types.BIGINT:
                return ret(rs.getLong(i + 1));
            case Types.TINYINT:
                return ret(rs.getByte(i + 1));
            case Types.SMALLINT:
                return ret(rs.getShort(i + 1));
            case Types.INTEGER:
                return ret(rs.getInt(i + 1));
            case Types.DECIMAL:
                return ret(rs.getBigDecimal(i + 1));
            case Types.DOUBLE:
                return ret(rs.getDouble(i + 1));
            case Types.FLOAT:
                return ret(rs.getFloat(i + 1));
            case Types.VARCHAR:
            case Types.CHAR:
            case Types.CLOB:
            case Types.NVARCHAR:
            case Types.NCHAR:
            case Types.NCLOB:
                return ret(rs.getString(i + 1));
            case Types.DATE:
                return ret(rs.getDate(i + 1));
            case Types.TIMESTAMP:
                return ret(rs.getTimestamp(i + 1));
            case Types.NULL:
                return "";
            default:
                throw new UnsupportedOperationException("Data type not yet supported");
        }
    }

    private String ret(Object obj) {
        return (obj == null) ? "" : obj.toString();
    }

}
