package me.ultrusmods.everfrost.registry;

import me.ultrusmods.everfrost.Constants;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;

import java.lang.reflect.Field;

public class RegisterUtils {

    public static<T> void register(Class clazz, Registry<T> registry) {
        // Cursed but makes dev quicker, and this is a modjam mod, so speed is key
        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(RegisterId.class)) {
                try {
                    String id = field.getAnnotation(RegisterId.class).value();
                    ResourceLocation resourceLocation = Constants.id(id);
                    Registry.register(registry, resourceLocation, (T)field.get(null));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
