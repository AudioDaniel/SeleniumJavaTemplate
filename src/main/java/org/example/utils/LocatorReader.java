package org.example.utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;

public class LocatorReader {
    private static Map<String, Map<String, String>> locators;
    private static final String LOCATOR_PATH = "src/main/java/org/example/resources/locators.json";

    static {
        try (FileReader reader = new FileReader(LOCATOR_PATH)) {
            Gson gson = new Gson();
            Type type = new TypeToken<Map<String, Map<String, String>>>() {}.getType();
            locators = gson.fromJson(reader, type);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getLocator(String page, String key) {
        return locators.getOrDefault(page, Map.of()).getOrDefault(key, "");
    }
}