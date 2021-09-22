package pl.oucik.welcomer.events;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import pl.oucik.welcomer.ChatHelper;
import pl.oucik.welcomer.Main;
public class QuitEvent implements Listener {
    @EventHandler
    public boolean onQuit(PlayerQuitEvent e){
        String message = Main.plugin.getConfig().getString("Quit").replace("%player%", e.getPlayer().getDisplayName());
        Bukkit.broadcastMessage(ChatHelper.color(message));
        e.setQuitMessage("");
        return true;
    }
}
