import java.util.Scanner;

public class Articles {

    static class Article {

        private String title;
        private String content;
        private String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] message = scanner.nextLine().split(", ");

        Article currentArticle = new Article(message[0], message[1], message[2]);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();
            String[] commandLine = command.split(": ");
            String operation = commandLine[0];

            if (operation.equals("Edit")) {
                String newContent = commandLine[1];
                currentArticle.setContent(newContent);

            } else if (operation.equals("ChangeAuthor")) {
                String newAuthor = commandLine[1];
                currentArticle.setAuthor(newAuthor);

            } else if (operation.equals("Rename")) {
                String newTitle = commandLine[1];
                currentArticle.setTitle(newTitle);
            }
        }

        System.out.printf("%s - %s: %s", currentArticle.getTitle(), currentArticle.getContent(), currentArticle.getAuthor());
    }
}
