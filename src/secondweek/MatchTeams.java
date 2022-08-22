package secondweek;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MatchTeams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int teamCount;
        List<String> teams = new ArrayList<>();
        List<List<String>> fixture = new ArrayList<>();

        while(true){
            System.out.print("Takım sayısını giriniz: ");
            teamCount = Integer.parseInt(sc.nextLine());

            if(teamCount <= 0 || teamCount % 2 != 0){
                System.out.println("Takım sayısı 0'dan büyük ve çift olmalıdır!");
            } else {
                break;
            }
        }

        for (int i = 0; i < teamCount; i++){
            System.out.printf("%d. takımı giriniz: ", i+1);
            teams.add(sc.nextLine());
        }

        System.out.println("Girilen takımlar: " + teams);

        while (teams.size() != 0){
            List<String> match = new ArrayList<>();

            for(int i = 0; i < 2; i++){
                int index = random.nextInt(0, teams.size());
                match.add(teams.get(index));
                teams.remove(teams.get(index));
            }

            fixture.add(match);
        }

        System.out.println("Eşleştirme sonucu: " + fixture);

    }
}
