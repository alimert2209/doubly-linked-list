public class MusicPlayer {
    DLNode head;
    DLNode tail;
    DLNode currentSong;

    // add song to end
    public void addSong(String songName){
        DLNode newSong = new DLNode(songName);

        // if the list is empty
        if (head == null) {
            head = newSong;
            tail = newSong;
            currentSong = newSong; // first song is gonna be the current song
        } else {
            tail.next = newSong;
            newSong.prev = tail; // to not lose old tail
            tail = newSong;
        }
    }

    public void printList(){
        DLNode temp = head;
        while (temp != null){
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public void playNext(){
        if (currentSong == null) {
            System.out.println("There is no music in Music Player!");
            return;
        }

        if (currentSong.next == null) {
            System.out.println("End of the list!");
            return;
        }

        currentSong = currentSong.next;
        System.out.println("Playing: " + currentSong.data);
    }

    public void playPrev(){
        if (currentSong == null) {
            System.out.println("There is no music in Music Player!");
            return;
        }

        if (currentSong.prev == null) {
            System.out.println("This is the first song on the list. There are no previous ones.");
            return;
        }

        currentSong = currentSong.prev;
        System.out.println("Playing: " + currentSong.data);
    }
}
