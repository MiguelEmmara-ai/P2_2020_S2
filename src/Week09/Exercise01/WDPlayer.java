package Week09.Exercise01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Miguel Emmara
 */
public class WDPlayer implements Comparable<WDPlayer> {
    private static final Scanner scanner = new Scanner(System.in);
    private String player_name;
    private int num_pieces;
    private int num_prevented;

    public WDPlayer(String player_name, int num_pieces, int num_prevented) {
        setPlayer_name(player_name);
        setNum_pieces(num_pieces);
        setNum_prevented(num_prevented);
    }

    public static ArrayList<WDPlayer> inputPlayer() {
        ArrayList<WDPlayer> wdPlayerArrayList = new ArrayList<>();
        boolean stop = false;
        int num_pieces;
        int num_prevented;

        do {
            try {
                System.out.print("What Is Your Name: ");
                String player_name = scanner.nextLine();

                if (player_name.equalsIgnoreCase("Stop")) {
                    stop = true;
                } else {
                    System.out.print("How Many Number Of Information You Have Gathered? ");
                    num_pieces = scanner.nextInt();

                    System.out.print("How Many Number Of Crime You Have Prevented? ");
                    num_prevented = scanner.nextInt();

                    scanner.nextLine();
                    wdPlayerArrayList.add(new WDPlayer(player_name, num_pieces, num_prevented));
                }


            } catch (InputMismatchException e) {
                System.err.println("Please Input Correct Answer");
                scanner.nextLine();
            }
        } while (!stop);

        wdPlayerArrayList.sort(Collections.reverseOrder());

        System.out.println("\n##### RANK #####");
        for (int i = 0; i < wdPlayerArrayList.size(); i++) {
            System.out.println(wdPlayerArrayList.get(i).getPlayer_name() + " Rank = " +
                    wdPlayerArrayList.get(i).rank());
        }

        System.out.println("\nGood Game Well Played");
        return wdPlayerArrayList;
    }

    public static void main(String[] args) {
        WDPlayer.inputPlayer();
    }

    public Double rank() {
        if (this.num_pieces == 0 || this.num_prevented == 0) {
            return 0.00;
        }

        return (1.00 - (1.00 / (this.num_pieces * this.num_prevented)));
    }

    @Override
    public int compareTo(WDPlayer o) {
        return this.rank().compareTo(o.rank());
    }

    public String getPlayer_name() {
        return player_name;
    }

    public void setPlayer_name(String player_name) {
        this.player_name = player_name;
    }

    public int getNum_pieces() {
        return num_pieces;
    }

    public void setNum_pieces(int num_pieces) {
        this.num_pieces = num_pieces;
    }

    public int getNum_prevented() {
        return num_prevented;
    }

    public void setNum_prevented(int num_prevented) {
        this.num_prevented = num_prevented;
    }
}