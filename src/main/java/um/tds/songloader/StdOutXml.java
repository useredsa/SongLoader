package um.tds.songloader;

public class StdOutXml {
  public static void main(String[] args) {
    Songs songs = MapperSongsXmlToJava.loadSongs("xml/canciones.xml");

    for (Song song : songs.getSongs()) {
      System.out.println("──────────────────────────────────────────────────");
      System.out.println("Titulo:     " + song.getTitle());
      System.out.println("Intérprete: " + song.getAuthor());
      System.out.println("Estilo:     " + song.getStyle());
      System.out.println("Url:        " + song.getUrl());
      System.out.println("──────────────────────────────────────────────────");
    }
  }
}
