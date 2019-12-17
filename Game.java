import java.util.Scanner;

public class Game {

    public static Story story;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        story = new Story();

        while (!story.isEnd()){

            System.out.println("============="
                    + story.current_situation.subject + "==============");

            System.out.println(story.current_situation.text);

            story.go(in.nextInt());
        }

        System.out.println("====================Зе(ленский) ЕНД!===================");
    }
}