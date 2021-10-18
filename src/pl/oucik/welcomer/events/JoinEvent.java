package pl.oucik.welcomer.events;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import pl.oucik.welcomer.ChatHelper;
import pl.oucik.welcomer.Main;
public class JoinEvent implements Listener {
    public final Main plugin;
    public JoinEvent(Main plugin) {
        this.plugin = plugin;
    }
    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        e.setJoinMessage(ChatHelper.color(this.plugin.welcome).replace("%player%", e.getPlayer().getDisplayName()));
    }
}
