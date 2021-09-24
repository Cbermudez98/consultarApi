/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author Auxiliar
 */
public class ConsumirController {
    public static String consumirApi(String url, String method) throws MalformedURLException, IOException{
        String line, res = "";
        URL API = new URL(url);
        HttpURLConnection http = (HttpURLConnection) API.openConnection();
        http.setRequestMethod(method);
        BufferedReader br = new BufferedReader(new InputStreamReader(http.getInputStream()));
        while((line = br.readLine()) != null){
            res += line +"\n\r";
        }
        return res;
    }
}
