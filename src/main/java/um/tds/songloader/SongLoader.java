package um.tds.songloader;


public interface SongLoader {
  public void addSongLoaderListener(SongLoaderListener listener);

  public boolean removeSongLoaderListener(SongLoaderListener listener);

  public void loadSongs(String xmlFilePath);
}
