package um.tds.songloader;

import java.util.EventListener;
import um.tds.songloader.events.SongsLoadedEvent;

public interface SongLoaderListener extends EventListener {
  public void notifySongsLoaded(SongsLoadedEvent event);
}
