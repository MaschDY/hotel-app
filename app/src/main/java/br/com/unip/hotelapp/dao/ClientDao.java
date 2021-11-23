package br.com.unip.hotelapp.dao;

import android.util.Log;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import br.com.unip.hotelapp.model.Client;
import br.com.unip.hotelapp.utils.ConnectionHelper;

public class ClientDao {

//    public Client selectClient() {
//        try {
//            Connection connection = new ConnectionHelper().connect();
//            if (connection != null) {
//                String sql = "Select * from CLIENTE";
//                Statement statement = null;
//                statement = connection.createStatement();
//
//                ResultSet resultSet = statement.executeQuery(sql);
//                while (resultSet.next()) {
//                    Client client = new Client();
//                    client.setId(resultSet.getInt(1));
//                    client.setName(resultSet.getString(2));
//                    client.setCpf(resultSet.getString(3));
//                    client.setEmail(resultSet.getString(4));
//                    client.setCep(resultSet.getString(5));
//                    client.setAddress(resultSet.getString(6));
//                    client.setDistrict(resultSet.getString(7));
//                    client.setCity(resultSet.getString(8));
//                    client.setState(resultSet.getString(9));
//                    client.setTelephone(resultSet.getString(10));
//
//                    connection.close();
//                    return client;
//                }
//            }
//        } catch (Exception e) {
//            Log.e("SQL Client", e.getMessage());
//        }
//
//        return null;
//    }
}
