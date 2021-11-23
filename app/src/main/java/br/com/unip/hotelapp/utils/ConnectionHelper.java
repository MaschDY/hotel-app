package br.com.unip.hotelapp.utils;

import android.os.StrictMode;
import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionHelper {
    public Connection connect() {
        Connection connection = null;
        String ip = "192.168.1.215:1433", db = "dbhotelariareal", user = "sa", password = "123456";
        try {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
            String connectURL;
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            connectURL = "jdbc:jtds:sqlserver://" + ip + ";databasename=" + db + ";user=" + user + ";password=" + password + ";";
            connection = DriverManager.getConnection(connectURL);
        } catch (Exception e) {
            Log.e("Error :", e.getMessage());
        }

        return connection;
    }
}
