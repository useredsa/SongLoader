package um.tds.songloader.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.*;
import java.util.List;
import org.junit.jupiter.api.Test;
import um.tds.songloader.MapperSongsXmlToJava;
import um.tds.songloader.Song;
import um.tds.songloader.SongLoader;
import um.tds.songloader.SongLoaderListener;
import um.tds.songloader.Songs;
import um.tds.songloader.TdsSongLoader;
import um.tds.songloader.events.SongsLoadedEvent;

class CatalogTests {
  private static final String xmlTestFile = "xml/canciones.xml";

  private Songs received;

  private void assertCollectionIsContained(List<Song> lhs, List<Song> rhs) {
    for (Song lsong : lhs) {
      if (!rhs.contains(lsong)) {
        fail("Right hand side collection does not contain " + lsong.getTitle());
      }
    }
  }

  @Test
  void listenerGetsNotified() {
    SongLoader component = new TdsSongLoader();
    SongLoaderListener listener =
        new SongLoaderListener() {
          public void notifySongsLoaded(SongsLoadedEvent event) {
            System.out.println("Notified " + event);
            assertEquals(event.getSource(), component);
            received = event.getSongs();
          }
        };
    component.addSongLoaderListener(listener);

    List<Song> expected = MapperSongsXmlToJava.loadSongs(xmlTestFile).getSongs();
    component.loadSongs(xmlTestFile);

    assertNotNull(received);
    assertCollectionIsContained(expected, received.getSongs());
    assertCollectionIsContained(received.getSongs(), expected);
  }
}
