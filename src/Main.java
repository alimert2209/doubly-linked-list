public class Main {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();
        musicPlayer.playNext();
        musicPlayer.playPrev();
        musicPlayer.addSong("Tarkan - Kuzu Kuzu");
        musicPlayer.addSong("Sebnem Ferah - Yagmurlar");
        musicPlayer.addSong("Baris Manco - Donence");


        musicPlayer.playPrev();
        musicPlayer.playNext();
        musicPlayer.playPrev();
        musicPlayer.playNext();
        musicPlayer.playNext();
        musicPlayer.playNext();

        musicPlayer.printList();

//        OUTPUT
//
//        There is no music in Music Player!
//        There is no music in Music Player!
//        This is the first song on the list. There are no previous ones.
//        Playing: Sebnem Ferah - Yagmurlar
//        Playing: Tarkan - Kuzu Kuzu
//        Playing: Sebnem Ferah - Yagmurlar
//        Playing: Baris Manco - Donence
//        End of the list!
//        Tarkan - Kuzu Kuzu <-> Sebnem Ferah - Yagmurlar <-> Baris Manco - Donence <-> End

    }
}
