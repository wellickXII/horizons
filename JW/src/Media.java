public class Media {

    public static void main(String [] args){

        BookService myBooks;
        myBooks = new BookService();

        VideoService myVideos;
        myVideos = new VideoService();

        System.out.println(myBooks);
        System.out.println(myVideos);
    }
}
