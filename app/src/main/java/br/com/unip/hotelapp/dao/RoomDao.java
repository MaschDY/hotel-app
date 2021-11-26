package br.com.unip.hotelapp.dao;

import android.util.Log;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.unip.hotelapp.model.Room;
import br.com.unip.hotelapp.utils.ConnectionHelper;

public class RoomDao {

    public List<Room> selectRoom() {
        List<Room> returnList = new ArrayList<>();
        Connection connection = new ConnectionHelper().connect();
        try {
            if (connection != null) {
                String sql = "Select * from [dbo].[Quartos]";
                Statement statement = null;
                statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);

                while (resultSet.next()) {
                    Room room = new Room();
                    room.setId(resultSet.getInt(1));
                    room.setNumber(resultSet.getString(2));
                    room.setCellphone(resultSet.getString(3));
                    room.setType(resultSet.getString(4));
                    room.setStatus(resultSet.getString(5));
                    room.setPrice(resultSet.getBigDecimal(6));

                    returnList.add(room);
                }
                connection.close();
                return returnList;
            }
        } catch (Exception e) {
            Log.e("SQL Rooms", e.getMessage());
        }
        return null;
    }
}
