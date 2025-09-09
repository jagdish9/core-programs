package programs.modules;

import java.io.IOException;
import java.net.*;

public class CheckRedirect {

    public static void main(String[] args) {
        String licenseUrl = "http://go.microsoft.com/fwlink/?LinkId=329770";
        String host = "www-proxy-phx.oraclecorp.com";
        int port = 80;
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(host, port));
        URL url = null;
        try {
            url = new URL(licenseUrl);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        HttpURLConnection conn = null;
        try {
            conn = (HttpURLConnection) new URL(licenseUrl).openConnection(proxy);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        conn.setInstanceFollowRedirects(true);
        conn.setRequestProperty("User-Agent", "Java License Fetcher");

        int responseCode = 0;
        try {
            responseCode = conn.getResponseCode();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if (responseCode == HttpURLConnection.HTTP_MOVED_PERM ||
                responseCode == HttpURLConnection.HTTP_MOVED_TEMP) {
            // Handle redirect manually if needed
            String newUrl = conn.getHeaderField("Location");
            try {
                conn = (HttpURLConnection) new URL(newUrl).openConnection();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Redirecting to " + newUrl);
        }
    }
}
