import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SongsExercise {
    static class Songs {
        private String typeList;
        private String name;
        private String time;

        public Songs (String typeList, String name, String time) {
            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }

        public String getTypeList() {
            return this.typeList;
        }

        public String getName() {
            return this.name;
        }

        public String getTime() {
            return this.time;
        }
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());

        List <Songs> songsList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String[] songLine = scanner.nextLine().split("_");

            Songs currentSong = new Songs(songLine[0], songLine[1], songLine[2]);
            songsList.add(currentSong);
        }


        String command = scanner.nextLine();

        if (command.equals("all")) {
            for (Songs song : songsList) {
                System.out.println(song.getName());
            }

        } else {
            for (Songs song : songsList) {
                    if (song.getTypeList().equals(command)) {
                        System.out.println(song.getName());
                    }
            }
        }


    }
}
