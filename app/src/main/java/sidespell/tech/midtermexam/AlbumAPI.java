package sidespell.tech.midtermexam;

import android.graphics.Bitmap;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import sidespell.tech.midtermexam.Entities.Album;
import sidespell.tech.midtermexam.utils.HttpUtils;

/**
 * A service class that manages weather data sent and retrieved from the server.
 */
public class AlbumAPI {

    public static final String BASE_URL     = "http://ws.audioscrobbler.com/2.0/";
    public static final String IMG_BASE_URL = "http://img2-ak.lst.fm/i/u/64s/";

    public static final int SUCCESS_CODE = 200;

    public static final String PARAM_METHOD   = "?method";
    public static final String PARAM_ALBUM    = "album";
    public static final String PARAM_FORMAT  = "format";
    public static final String PARAM_API_KEY = "appId";

    private static final String ALB_CODE        = "album";
    private static final String ALB_ARTIST  = "artist";
    private static final String ALB_IMAGE    = "image";
    private static final String ALB_MUSIC    = "music";
    private static final String ALB_SYS         = "sys";
    private static final String ALB_MAIN        = "main";

    private static final String OWM_CODE        = "cod";
    private static final String OWM_CITY_NAME   = "name";
    private static final String OWM_WEATHER     = "weather";
    private static final String OWM_DESCRIPTION = "description";
    private static final String OWM_ICON        = "icon";
    private static final String OWM_MAIN        = "main";
    private static final String OWM_TEMPERATURE = "temp";
    private static final String OWM_PRESSURE    = "pressure";
    private static final String OWM_HUMIDITY    = "humidity";
    private static final String OWM_SYS         = "sys";
    private static final String OWM_COUNTRY     = "country";


//    public static Album getmMusic (Uri uri, @NonNull String requestMethod) {
//        String json = HttpUtils.getResponse(uri, requestMethod);
//
//        if (TextUtils.isEmpty(json)) {
//            return null;
//        }
//
//        // Here we will now parse the json response and convert it into a Weather object.
//        final String album;
//        final String artist;
//        final String music;
//        final int image;
//        final String city;
//        final String country;
//        final String icon;
//        final String description;
//        final double temperature;
//        final long humidity;
//        final long pressure;
//
//        try {
//            // 1) Convert the json string response into an actual JSON Object
//            JSONObject jsonObject = new JSONObject(json);
//
//            // 2) Get the status code
//            int statusCode = jsonObject.getInt(ALB_CODE);
//
//            // 3) Check if the HTTP Status Code if it's valid or not
//            if (statusCode == SUCCESS_CODE) {
//                // 4) Retrieve the individual bits of data that we need for our Weather model.
//                // 5) Get the city name from the base jsonObject
//                 artist = jsonObject.getString(ALB_ARTIST);
//
//                // 6) Get the country name from "sys" object
//                JSONObject sys = jsonObject.getJSONObject(ALB_SYS);
//                music = sys.getString(ALB_MUSIC);
//
//                // 7) Get temperature, humidity, and pressure under "main" object
//                JSONObject main = jsonObject.getJSONObject(ALB_MAIN);
//                image = main.getInt(ALB_IMAGE);
//
//
//                // 8) Get description and icon from "weather" object
//                JSONArray weather = jsonObject.getJSONArray(OWM_WEATHER);
//                JSONObject w0 = weather.getJSONObject(0);
//                description = w0.getString(OWM_DESCRIPTION).toUpperCase();
//                icon = w0.getString(OWM_ICON);
//
//               // 9) If there's no issue up to this point, then we are now ready to create our
//                // Weather model.
//                Album w = new Album()
//                        .setCity(city)
//                        .setCountry(country)
//                        .setIconSrc(icon)
//                        .setDescription(description)
//                        .setTemperature(temperature)
//                        .setHumidity(humidity)
//                        .setPressure(pressure);
//
//                // 10) Get the actual weather icon
//                Bitmap imageBitmap = HttpUtils.getImageBitmap(w.getIconSrc());
//                w.setWeatherIcon(imageBitmap);
//
//                // 11) Return our weather data
//                return w;
//            } else {
//                return null;
//            }
//        } catch (JSONException e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
}