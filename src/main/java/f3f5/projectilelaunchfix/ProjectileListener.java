package f3f5.projectilelaunchfix;

import org.bukkit.entity.Arrow;
import org.bukkit.entity.SpectralArrow;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileLaunchEvent;
public class ProjectileListener implements Listener
{
    private final ProjectileLaunchFix plugin;

    public ProjectileListener(final ProjectileLaunchFix plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onArrow(ProjectileLaunchEvent evt) {
        if (plugin.getConfig().getBoolean("PreventProjectileExploit")) {
                 if (evt.getEntity() instanceof Arrow || evt.getEntity() instanceof SpectralArrow) {
                     if (evt.getEntity().getVelocity().lengthSquared() > plugin.getConfig().getInt("MaxBowSquaredVelocity")) {
                         evt.setCancelled(true);
                     }
                 }
        }
    }
}