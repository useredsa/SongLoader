package um.tds.songloader.events;

import java.util.EventObject;
import java.util.List;
import um.tds.songloader.Song;

public class SongsLoadedEvent extends EventObject {
  private List<Song> songs;

  public SongsLoadedEvent(Object source, List<Song> songs) {
    super(source);
    this.songs = songs;
  }

  public List<Song> getSongs() {
    return songs;
  }
}
