import java.util.Scanner;

public class BookService implements Publications{

    private String name;
    private String language;
    private String type;
    private int pages;

    static Scanner userInput = new Scanner(System.in);


    public void availableToPublic() {

        System.out.println(Publications.available);
    }


    public BookService(){

        System.out.println("Enter book name:");
        this.setName(userInput.nextLine());

        System.out.println("Enter language:");
        this.setLanguage(userInput.nextLine());

        System.out.println("Enter book type:");
        this.setType(userInput.nextLine());

        System.out.println("Enter number of pages:");
        this.setPages(userInput.nextInt());


        System.out.println(
                " Book Name:" + name +
                        "\n Language:" + language +
                        "\n Type:" + type +
                        "\n Pages:" + pages
        );

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }
}
