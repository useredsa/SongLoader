package um.tds.songloader;

import java.util.Vector;
import um.tds.songloader.events.SongsLoadedEvent;

public class SongLoader {
  private Vector<SongLoaderListener> listeners;

  public SongLoader() {
    this.listeners = new Vector();
  }

  public synchronized void addSongLoaderListener(SongLoaderListener listener) {
    this.listeners.add(listener);
  }

  public synchronized boolean removeSongLoaderListener(SongLoaderListener listener) {
    return listeners.remove(listener);
  }

  public void loadSongs(String xmlFilePath) {
    // We do not compare with a previous value of file path
    // because the file may have changed in disk
    Songs songs = MapperSongsXmlToJava.loadSongs(xmlFilePath);
    SongsLoadedEvent event = new SongsLoadedEvent(this, songs);
    notifySongListeners(event);
  }

  private void notifySongListeners(SongsLoadedEvent event) {
    Vector<SongLoaderListener> copy;
    synchronized (this) {
      copy = (Vector) listeners.clone();
    }
    copy.forEach(l -> l.notifySongsLoaded(event));
  }
}
