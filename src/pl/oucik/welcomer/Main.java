package pl.oucik.welcomer;
import org.bukkit.plugin.java.JavaPlugin;
import pl.oucik.welcomer.events.JoinEvent;
import pl.oucik.welcomer.events.QuitEvent;
public class Main extends JavaPlugin {
    public static Main plugin;
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new JoinEvent(), this);
        getServer().getPluginManager().registerEvents(new QuitEvent(), this);
        plugin = this;
        this.saveDefaultConfig();
    }
}
