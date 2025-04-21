package singleton;

import java.util.*;

public class Singleton {
    public Map<String, List<String>> info;
    private Map<String, String> setting;

    private static Singleton singleton;
    private Singleton() {
        System.out.println("ОБЪЕКТ СОЗДАН!");
        info = new LinkedHashMap<>();

        info.put("Тема", List.of(
                "Светлая",
                "Темная",
                "Полночь",
                "Классическая"
        ));

        info.put("Язык", List.of(
                "Русский",
                "Английский (Великобритания)",
                "Английский (США)",
                "Немецкий",
                "Французский",
                "Китайский упрощённый",
                "Китайский традиционный",
                "Испанский",
                "Мемный"
        ));
        
        info.put("Путь к файлам", List.of("C:\\Windows\\System32"));

        setting = new HashMap<>();
        setting.put("Тема", info.get("Тема").get(0));
        setting.put("Язык", info.get("Язык").get(0));
        setting.put("Путь к файлам", info.get("Путь к файлам").get(0));
    }

    public static synchronized Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public void setSetting(String key, String value) {
        if (info.containsKey(key) && info.get(key).contains(value)) {
            setting.put(key, value);
            System.out.println("Настройка изменена: " + key + " -> " + value);
            return;
        }
        System.out.println("Неизвестная настройка");
    }

    public String getSetting(String key) {
        if (info.containsKey(key)) return setting.get(key);
        else {
            System.out.println("Настройка не найдена");
            return null;
        }
    }
}
