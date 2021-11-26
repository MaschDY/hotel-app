package br.com.unip.hotelapp.dao;

import android.util.Log;

import java.sql.Connection;
import java.sql.PreparedStatement;

import br.com.unip.hotelapp.model.Client;
import br.com.unip.hotelapp.utils.ConnectionHelper;

public class ClientDao {

    public static int selectClient(Client client) {
        Connection connection = new ConnectionHelper().connect();
        int response = 0;
        try {
            if (connection != null) {
                String sql = "insert into [dbo].[Clientes](cnome, ctel, cnacionalidade, cgen, ddn, idc, cend, chegada, saida, id)"
                        + "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement preparedStatement = null;
                preparedStatement = connection.prepareStatement(sql);

                preparedStatement.setString(1, client.getName());
                preparedStatement.setObject(2, client.getTelephone());
                preparedStatement.setString(3, client.getNationality());
                preparedStatement.setString(4, client.getGender());
                preparedStatement.setString(5, client.getBirthday());
                preparedStatement.setString(6, client.getDocument());
                preparedStatement.setString(7, client.getAddress());
                preparedStatement.setString(8, client.getArrival());
                preparedStatement.setString(9, client.getExit());
                preparedStatement.setInt(10, client.getIdRoom());

                response = preparedStatement.executeUpdate();

                connection.close();
            }
        } catch (Exception e) {
            Log.e("SQL Clients", e.getMessage());
        }
        return response;
    }
}
