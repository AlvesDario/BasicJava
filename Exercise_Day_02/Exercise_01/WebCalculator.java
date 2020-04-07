package Exercise_Day_02.Exercise_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WebCalculator {

    // URL url = new URL("http://api.mathjs.org/v4/?expr=");
    public static void main(String[] args) {
        try {
            String expression = "";
            for (String arg : args) {
                expression += arg;
            }
            // encode operators
            expression = expression.replace("+", "%2B");
            expression = expression.replace("-", "%2D");
            expression = expression.replace("*", "%2A");
            expression = expression.replace("/", "%2F");

            // open connection
            URL url = new URL("http://api.mathjs.org/v4/?expr=" + expression);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();

            if (con.getResponseCode() == 200) { // success
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuffer response = new StringBuffer();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                // print result
                System.out.println(response.toString());
            }
        } catch (IndexOutOfBoundsException | IOException e) {
            System.out.println("Something went wrong ;-;\tTry again");
        }
    }
}