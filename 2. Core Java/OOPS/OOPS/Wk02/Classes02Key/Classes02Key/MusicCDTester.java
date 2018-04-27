public class MusicCDTester
{

   public static void main(String[] args)
   {
      MusicCD dylan = new MusicCD("Love and Theft", "Bob Dylan");
      MusicCD cash = new MusicCD();

      System.out.println(dylan.getTitle());
      System.out.println(dylan.getArtist());

      System.out.println(cash.getTitle());
      System.out.println(cash.getArtist());

      cash.setTitle("American IV: The Man Comes Around");
      cash.setArtist("Johnny Cash");
      System.out.println(cash.getTitle());
      System.out.println(cash.getArtist());
   }
}
