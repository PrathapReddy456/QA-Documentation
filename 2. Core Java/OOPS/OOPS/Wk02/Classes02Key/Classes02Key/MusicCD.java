public class MusicCD
{

   private String title;
   private String artist;

   /**
    * Constructs a music CD with the given title and artist.
    *
    * @param titleIn the title
    * @param artistIn the artist
    */
   public MusicCD(String titleIn, String artistIn)
   {
      title = titleIn;
      artist = artistIn;
   }

   /**
    * Constructs a music CD with unknown title and artist.
    */
   public MusicCD()
   {
      title = "Unknown";
      artist = "Unknown";
   }

   /**
    * Returns the artist of the CD.
    *
    * @return Returns the artist.
    */
   public String getArtist()
   {
      return artist;
   }

   /**
    * Sets the artist of the CD.
    *
    * @param artist The artist to set.
    */
   public void setArtist(String artistIn)
   {
      artist = artistIn;
   }

   /**
    * Returns the title of the CD.
    *
    * @return Returns the title.
    */
   public String getTitle()
   {
      return title;
   }

   /**
    * Sets the title of the CD.
    *
    * @param title The title to set.
    */
   public void setTitle(String titleIn)
   {
      title = titleIn;
   }
}
