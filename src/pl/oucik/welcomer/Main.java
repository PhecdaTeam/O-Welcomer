package pl.oucik.welcomer;
import org.bukkit.plugin.java.JavaPlugin;
import pl.oucik.welcomer.events.JoinEvent;
import pl.oucik.welcomer.events.QuitEvent;
public class Main extends JavaPlugin {
    public final JoinEvent joinEvent;
    public final QuitEvent quitEvent;
    public Main(){
        this.joinEvent = new JoinEvent(this);
        this.quitEvent = new QuitEvent(this);
    }
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new JoinEvent(this), this);
        getServer().getPluginManager().registerEvents(new QuitEvent(this), this);
        this.saveDefaultConfig();
    }
    public String welcome =  this.getConfig().getString("Join");
    public String quit = this.getConfig().getString("Quit");
}