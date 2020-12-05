package um.tds.songloader;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class MapperSongsXmlToJava {
  public static Songs loadSongs(String filePath) {
    JAXBContext jc;
    Songs songs = null;

    try {
      jc = JAXBContext.newInstance("um.tds.songloader");
      Unmarshaller u = jc.createUnmarshaller();
      File file = new File(filePath);
      songs = (Songs) u.unmarshal(file);
    } catch (JAXBException e) {
      // TODO
      e.printStackTrace();
    }

    return songs;
  }
}
