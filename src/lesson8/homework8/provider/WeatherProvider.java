package lesson8.homework8.provider;

import lesson8.homework8.entity.WeatherData;
import lesson8.homework8.enums.Periods;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface WeatherProvider {

    void getWeather(Periods periods) throws IOException, SQLException;

    List<WeatherData> getAllFromDb() throws IOException, SQLException;
}
