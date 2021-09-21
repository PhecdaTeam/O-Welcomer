package pl.oucik.welcomer.events;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import pl.oucik.welcomer.ChatHelper;
import pl.oucik.welcomer.Main;
public class JoinEvent implements Listener {
    @EventHandler
    public boolean onJoin(PlayerJoinEvent event){
        String message = Main.plugin.getConfig().getString("Join").replace("%player%", event.getPlayer().getDisplayName());
        Bukkit.broadcastMessage(ChatHelper.color(message));
        event.setJoinMessage("");
        return true;
    }
}
