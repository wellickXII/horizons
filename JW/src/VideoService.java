import java.util.Scanner;

public class VideoService implements Publications{

    private String name;
    private String language;
    private String type;
    private int time;

    static Scanner userInput = new Scanner(System.in);

    @Override
    public void availableToPublic() {

        System.out.println(Publications.available);
    }

    public VideoService(){

        System.out.println("Enter video name:");
        this.setName(userInput.nextLine());

        System.out.println("Enter language:");
        this.setLanguage(userInput.nextLine());

        System.out.println("Enter type of video:");
        this.setType(userInput.nextLine());

        System.out.println("Enter time:");
        this.setTime(userInput.nextInt());


        System.out.println(
                "Video name:" + name +
                        "\n Language:" + language +
                        "\n Video Type:" + type +
                        "\n Time:" + time
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

    public void setTime(int time) {
        this.time = time;
    }

    public int getTime() {
        return time;
    }

}
