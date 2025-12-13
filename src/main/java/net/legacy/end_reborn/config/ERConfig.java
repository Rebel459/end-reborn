package net.legacy.end_reborn.config;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import net.legacy.end_reborn.EndReborn;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.nio.file.Path;

@Config(name = EndReborn.MOD_ID)
public class ERConfig implements ConfigData {

  @Contract(pure = true)
  public static @NotNull Path configPath(boolean json5) {
    return Path.of("./config/" + EndReborn.MOD_ID + "." + (json5 ? "json5" : "json"));
  }

  public static ERConfig get;

  public static void initClient() {
    AutoConfig.register(ERConfig.class, JanksonConfigSerializer::new);
    get = AutoConfig.getConfigHolder(ERConfig.class).getConfig();
  }

  @ConfigEntry.Category("default")
  public boolean loot_table_injects = true;

  @ConfigEntry.Category("default")
  public boolean trailier_tales_integration = true;

  @ConfigEntry.Category("default")
  public boolean enderscape_integration = true;

}
