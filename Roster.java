// CSE 110     : CSE 110 Online
// Assignment  : Assigment 08
// Author      : Brandon Worley -ID # 1221104768
// Description : Creating a Class for the Volleyball Players
import java.io.*;
import java.util.ArrayList;
class Roster {
    private ArrayList<Player> players;
    public Roster(){
        players = new ArrayList<>();
    }
    public Roster(String name) throws IOException {
        players = new ArrayList<>();

        // opening File with given Name
        FileInputStream fStream = new FileInputStream(name);
        DataInputStream in = new DataInputStream(fStream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String line;

        // reading lines using readLine() method
        while ((line = br.readLine()) != null)   {
            String[] data = line.split(" ");
            players.add(new Player(data[0]+" "+data[1],Double.parseDouble(data[2]),Double.parseDouble(data[3])));
        }
    }

    
    public void addPlayer(String name,double attackStat,double blockStat){
        players.add(new Player(name,attackStat,blockStat));
    }
    public int countPlayers(){
        return players.size();
    }
    public Player getPlayerByName(String name){
        for (Player player : players) {
            if ((player.getName()).equals(name))    
                return player;
        }
        return null;  
    }
    public void printTopAttackers(){
        
        Player top1 = players.get(0);
        Player top2 = players.get(0);
        for (Player player : players) {
            if (player.getAttackStat() > top1.getAttackStat()) {
                top2 = top1;
                top1 = player;
            }
            if ((player.getAttackStat() > top2.getAttackStat()) && player.getAttackStat() != top1.getAttackStat()) {
                top2 = player;
            }
        }
        top1.printPlayerInfo();
        top2.printPlayerInfo();
    }

    public void printTopBlockers() {
        Player top1 = players.get(0);
        Player top2 = players.get(0);
        for (Player player : players) {
            if (player.getBlockStat() > top1.getBlockStat()) {
                top2 = top1;
                top1 = player;
            }
            if ((player.getBlockStat() > top2.getBlockStat()) && player.getBlockStat() != top1.getBlockStat()) {
                top2 = player;
            }
        }
        top1.printPlayerInfo();
        top2.printPlayerInfo();
    }

    public void printAllPlayers(){
        for (Player player : players) {
            player.printPlayerInfo();
        }
    }
}