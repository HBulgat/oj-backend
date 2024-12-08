package com.xxx.oj.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpURLConnectionExample {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://tio.1r1g.com/#java-openjdk"); // 替换为TIO的实际API端点
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");

            // 设置请求体
            String requestBody = "\""+
                    "{"+
                    "\"code\": \"你的代码\","+
                    "\"language\": \"java\","+
                "}";
            OutputStream os = conn.getOutputStream();
            os.write(requestBody.getBytes());
            os.close();

            // 读取响应
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // 打印结果
            System.out.println(response.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}