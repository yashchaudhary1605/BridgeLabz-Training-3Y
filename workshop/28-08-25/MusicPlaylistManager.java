import java.util.Scanner;

public class MusicPlaylistManager {

 
    static String[] songs;

  
    public static void playAllSongs() {
        System.out.println("\n--- Playing All Songs ---");
        for (String song : songs) {
            System.out.println("Playing: " + song);
        }
    }

 
    public static void playSongByIndex(int index) {
        if (index >= 0 && index < songs.length) {
            System.out.println("Playing: " + songs[index]);
        } else {
            System.out.println("Invalid song index!");
        }
    }

    public static void searchSong(String name) {
        boolean found = false;
        for (String song : songs) {
            if (song.equalsIgnoreCase(name)) {
                System.out.println("Song found! Playing: " + song);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Song not found in the playlist.");
        }
    }

 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     
        System.out.print("Enter number of songs in your playlist: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        songs = new String[n];
      
        for (int i = 0; i < n; i++) {
            System.out.print("Enter song " + (i + 1) + ": ");
            songs[i] = sc.nextLine();
        }

        boolean running = true;
        while (running) {
            
            System.out.println("\n===== Music Playlist Manager =====");
            System.out.println("1. Play All Songs");
            System.out.println("2. Play Song by Index");
            System.out.println("3. Search Song by Name");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    playAllSongs();
                    break;

                case 2:
                    System.out.print("Enter song index (0 to " + (songs.length - 1) + "): ");
                    int index = sc.nextInt();
                    playSongByIndex(index);
                    break;

                case 3:
                    System.out.print("Enter song name to search: ");
                    String name = sc.nextLine();
                    searchSong(name);
                    break;

                case 4:
                    running = false;
                    System.out.println("Exiting Music Playlist Manager. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again!");
            }
        }

        sc.close();
    }
}
