package com.kodilla.jdbc;

import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.Assert.assertEquals;

public class StoredProcTestSuite {

    @Test
    public void testUpdateVipLevels() throws SQLException {

        //Given
        DbManager dbManager = DbManager.getInstance();

        String sqlUpdate = "UPDATE READERS SET VIP_LEVEL=\"Not set\"";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);

        //when
        String sqlProcedureCall = "CALL UpdateVipLevels()";
        statement.execute(sqlProcedureCall);

        //Then

        String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY FROM READERS WHERE VIP_LEVEL=\"Not set\"";
        ResultSet rs = statement.executeQuery(sqlCheckTable);

        int howmany=-1;

        if(rs.next()) {
            howmany = rs.getInt("HOW_MANY");
        }
        assertEquals(0,howmany);

    }

    @Test
    public void testUpdateBestsellers() throws SQLException {

        //Given
        DbManager dbManager = DbManager.getInstance();

        String sqlUpdate = "UPDATE BOOKS SET BESTSELLER=null ";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);

        //when
        String sqlProcedureCall = "CALL UpdateBestsellers()";
        statement.execute(sqlProcedureCall);

        //Then

        String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY FROM BOOKS WHERE BESTSELLER=null";
        ResultSet rs = statement.executeQuery(sqlCheckTable);

        int howmany=-1;

        if(rs.next()) {
            howmany = rs.getInt("HOW_MANY");
        }
        assertEquals(0,howmany);

    }

}