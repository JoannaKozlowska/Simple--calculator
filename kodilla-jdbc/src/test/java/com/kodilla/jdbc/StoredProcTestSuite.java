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
        String sqlUpdate = "UPDATE readers SET VIP_LEVEL=\"Not set\"";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);

        //When
        String sqlProcedureCall= "CALL UpdateVipLevels()";
        statement.execute(sqlProcedureCall);

        //Then
        String sglCheckTable = "SELECT COUNT(*) HOW_MANY FROM readers WHERE VIP_LEVEL=\"Not set\"";
        ResultSet rs= statement.executeQuery(sglCheckTable);
        int howMany = -1;
        if (rs.next()) {
            howMany = rs.getInt("HOW_MANY");
        }
        assertEquals(0, howMany);
    }
    @Test
    public void testUpdateBestsellers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE books SET BESTSELLER=false";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);
        //When
        String sqlProcedureCall= "CALL UpdateBestsellers()";
        statement.execute(sqlProcedureCall);
        //Then
        String sglCheckTable = "SELECT COUNT(*) HOW_MANY FROM books WHERE BESTSELLER=false ";
        ResultSet rs= statement.executeQuery(sglCheckTable);
        int best = -1;
        if (rs.next()) {
            best = rs.getInt("HOW_MANY");
        }
        assertEquals(1, best);


    }
}
