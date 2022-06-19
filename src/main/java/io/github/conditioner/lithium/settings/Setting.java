package io.github.conditioner.lithium.settings;

import java.util.HashMap;

public class Setting {

    private final HashMap<String, Object> settingsData;

    public Setting(HashMap<String, Object> settingsData) {
        this.settingsData = new HashMap<>(settingsData);
    }

    public Object getValue(String key) {
        return settingsData.get(key);
    }

    @SuppressWarnings("unchecked")
    public <T> T get(String key) {
        return (T) getValue(key);
    }

    public int getInt(String key) {
        return get(key);
    }

    public double getDouble(String key) {
        return get(key);
    }

    public boolean getBoolean(String key) {
        return get(key);
    }

    public HashMap<String, Object> getSettingsData() {
        return settingsData;
    }

    public void set(String key, Object value) {
        settingsData.replace(key, value);
    }
}
