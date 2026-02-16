public class MusicPlayer {
    DLNode head;
    DLNode tail;

    // add song to end
    public void addSong(String songName){
        DLNode newSong = new DLNode(songName);

        // if the list is empty
        if (head == null) {
            head = newSong;
            tail = newSong;
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
}
