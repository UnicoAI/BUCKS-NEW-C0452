

import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {
        
// create album with songs to be stored and availabale to be added to the playlist
        Album album = new Album("Album1"); //create one album of songs stored

        album.addSong("Shivers","Ed Sheeran",677688);
        album.addSong("Flowers","ArrDee",662342);
        album.addSong("Seventeen Going Under","Sam Fender",65763432);
        album.addSong("Overseas","D-Block Europe",65763432);
        album.addSong("Come on home for Christmas","George Ezra",65763432);
        album.addSong("Sacrifice","The Weeknd",65763432);
        album.addSong("War","ArrDee & Aitch ",65763632);
        album.addSong("BMW","Bad Boy Chiller Crew",69763432);
        album.addSong("Starlight","Davw",654233432);
        album.addSong("Go","Cat Burns",65763432);
        album.addSong("Falling Back","Drake",65763432);
        album.addSong("Forget me","Lewis Capaldi",65763432);
       
        albums.add(album);  
//create a LinkedList of songs to behave like a playlist to who we add songs from the arraylist
        LinkedList<Song> playList = new LinkedList<>();

        albums.get(0).addToPlayList("Shivers", playList);
        albums.get(0).addToPlayList("Flowers",playList);
        albums.get(0).addToPlayList("Seventeen Going Under",playList);
        albums.get(0).addToPlayList("Overseas",playList);
        albums.get(0).addToPlayList("Come on home for Christmas",playList);
        albums.get(0).addToPlayList("Sacrifice",playList);
        albums.get(0).addToPlayList("War",playList);
        albums.get(0).addToPlayList("BMW",playList);
        albums.get(0).addToPlayList("Starlight",playList);
        albums.get(0).addToPlayList("Go",playList);
        

//using the function of Linkedlist to start from index o we initialise playing from index 0
        play(playList);

    }


    private static boolean play(LinkedList<Song> playList){
        printMenu();
        Scanner sc = new Scanner(System.in); //open scanner for user input
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator(); //create iterator object
//1st message on console and print menu
        if(playList.size() == 0){
            System.out.println("This playlist have no song");
        }else {
            System.out.println("Now playing " + listIterator.next().toString());
            
        }

        while(!quit){
            int action = sc.nextInt();
            sc.nextLine();
//using switch for creating menu options for the console
            switch (action){

                case 0:
                    System.out.println("Goodbye!");
                    quit = true;
                    break;

                case 1:  //play next song using iterator
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now playing "+listIterator.next().toString());
                    }else {
                        System.out.println("no song availble, reached to the end of the list");
                        forward = false;
                    }
                    break;
                case 2: //play previous song using iterator
                    if(forward){
                        if (listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing "+listIterator.previous().toString());
                    }else {
                        System.out.println("we are the first song");
                        forward = false;
                    }
                    break;

                case 3: //message alert when we reach the start of the linkedlist
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now playing "+listIterator.previous().toString());
                            forward = false;
                        }else {
                            System.out.println("we are at the start of the list");
                        }
                    }else { ////message alert when we reach the end of the linkedlist
                        if(listIterator.hasNext()){
                            System.out.println("now playing "+listIterator.next().toString());
                            forward = true;
                        }else {
                            System.out.println("we have reached to the end of list");
                            
                        }
                    }
                    break;

                case 4: //call method to print playlist songs
                    printList(playList);
                    
                   
                    break;
                case 5: //call method to print menu
                    printMenu();
                    break;
                    case 6: // searching for playcount number
                    Scanner newcount = new Scanner(System.in);
                    System.out.println("What number of PlayCount are you looking for?");
                     Double ssss = newcount.nextDouble();
                    

                     for(Song checkedSong : playList){
            if (checkedSong.getPlaycount().equals(ssss)){
             
                       System.out.println(ssss + "  is the Play Count number for  " + checkedSong.getTitle() + " --Arrtist Name--" + checkedSong.getArtist());
                    }
                
                  return false;
                    
                }
                    break;
                     
                
                case 7:  //remove songs from playlist using iterator
                    if (playList.size() >0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("now playing "+listIterator.next().toString());
                        }
                        else {
                            if(listIterator.hasPrevious())
                            System.out.println("now playing "+listIterator.previous().toString());
                        }
                    }
                    break;
                    case 8: //add songs to the playlist using only title of the song
                    Scanner newsong = new Scanner(System.in);
                    System.out.println("Wich song from our collection do you wanna add to a new playlist?");
                    System.out.println("Available Songs are: ");
                    System.out.println("Falling Back");
                    System.out.println("Forget me ");

                    
                    
                    albums.get(0).addToPlayList(newsong.nextLine(), playList);
                    
              
       System.out.println("Song added to the new playlist:  " + newsong.nextLine());
       printMenu();
                    
                    }

            }
        return forward;
        
        }
    

   

    private static void printMenu(){  //menu list
        System.out.println("Available options\n press");
        System.out.println("0 - to quit\n"+
                "1 - to play next song\n"+
                "2 - to play previous song\n"+
                "3 - to replay the current song\n"+
                "4 - list of all songs \n"+
                "5 - print all available options\n"+
                "6 - find by playcount song \n" +
                "7- delete current song \n" +
                "8 - add new song");
    }

    private static void printList(LinkedList<Song> playList){ //style the console
        Iterator<Song> iterator = playList.iterator();
        System.out.println("-----------------");

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("-----------------");
    }
    

}