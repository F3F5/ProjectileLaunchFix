package f3f5.projectilelaunchfix;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class ProjectileLaunchFix extends JavaPlugin
{
    public void onEnable() {
        this.saveDefaultConfig();
        Bukkit.getPluginManager().registerEvents(new ProjectileListener(this), this);
    }
}