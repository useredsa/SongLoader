package um.tds.songloader.events;

import java.util.EventObject;
import um.tds.songloader.Songs;

public class SongsLoadedEvent extends EventObject {
  private Songs songs;

  public SongsLoadedEvent(Object source, Songs songs) {
    super(source);
    this.songs = songs;
  }

  public Songs getSongs() {
    return songs;
  }
}
