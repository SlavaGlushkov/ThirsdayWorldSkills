import com.mysql.cj.jdbc.Driver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class Application {
    public static void main(String[] args) throws IOException {
        working_withDataBase();
    }
    static void working_withDataBase (){
        try {
            //Создание объекта драйвера
            Driver driver = new Driver();
            //Регистрация драйвера
            DriverManager.registerDriver(driver);
            //Создание соединения
           // Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/thirsday_worldskills_database","root","MySQL");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/many_to_one","root","MySQL");
            //Объект для управления БД. Создание объекта через соединение.
            Statement statement = connection.createStatement();
           // statement.execute(("INSERT INTO artyom_table(first_name, last_name) VALUES('name', 'desk');"));
           //statement.execute("CREATE TABLE `thirsday_worldskills_database`.`table_from_java` (`id` INT NOT NULL AUTO_INCREMENT,`name` VARCHAR(45) NOT NULL,`last_name` VARCHAR(45) NOT NULL,PRIMARY KEY (`id`));  ");
//            for (int i = 0; i < 31; i++) {
//              statement.execute(String.format("INSERT INTO `thirsday_worldskills_database`.`table_from_java` (`name`, `last_name`) VALUES('Joe%d', 'Dannny%d');", i, i));
//            }
//            statement.execute("CREATE SCHEMA `many_to_one`");
           // statement.execute("CREATE TABLE `many_to_one`.`engines` (`id` INT NOT NULL AUTO_INCREMENT, `model` VARCHAR(45) NOT NULL , `power` INT NOT NULL, PRIMARY KEY (`id`)); ");
           // statement.execute("CREATE TABLE `many_to_one`.`cars` (`id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,`mark` VARCHAR(45) NOT NULL,  `model` VARCHAR(45) NOT NULL , `engine_id` INTEGER NOT NULL , FOREIGN KEY (`engine_id`) REFERENCES engines (id)); ");
           // statement.execute("CREATE TABLE `many_to_one`.`cars` (id, mark, model, engine_id)");
//            for (int i = 1; i < 101; i++) {
//              statement.execute(String.format("INSERT INTO `many_to_one`.`engines` (`model`, `power`) VALUES('lamborgini%d', '%d');", i, i));
//            }
//            for (int i = 1; i < 101; i++) {
//                statement.execute(String.format("INSERT INTO `many_to_one`.`cars` (`mark`, `model`, `engine_id`) VALUES ('lamborgini%d','urus%d','%d');", i, i + 900 ,i));
//            }



//          statement.execute("DELETE FROM `thirsday_worldskills_database`.`table_from_java` WHERE (`id` = '3');");
            //ResultSet res = statement.executeQuery("SELECT * FROM table_from_java");
            if(!connection.isClosed()){
                System.out.println("Соеденение с БД установленно ");
            }
            connection.close();
            if(connection.isClosed()){
                System.out.println("Соеденение с БД закрыто ");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Ошибка");
        }
    }
}
