package pl.oucik.welcomer.events;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import pl.oucik.welcomer.ChatHelper;
import pl.oucik.welcomer.Main;
public class QuitEvent implements Listener {
    public final Main plugin;
    public QuitEvent(Main plugin) {
        this.plugin = plugin;
    }
    @EventHandler
    public void onQuit(PlayerQuitEvent e){
        e.setQuitMessage(ChatHelper.color(this.plugin.quit).replace("%player%", e.getPlayer().getDisplayName()));
    }
}