package org.com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.testng.annotations.Test;

public class HomeTask2 {

	@Test
	public void homeTask() {
		ArrayList<Player> playersList = new ArrayList<Player>();
		playersList.add(new Player(100, "army"));
		playersList.add(new Player(100, "david"));
		playersList.add(new Player(50, "heraldo"));
		playersList.add(new Player(75, "aakansha"));
		playersList.add(new Player(150, "aleksa"));
		Collections.sort(playersList);
		System.out.println("Original Sort" + playersList);
		Comparator<Player> comp = new Comparator<Player>() {

			public int compare(Player o1, Player o2) {
				if (o1.score < o2.score)
					return 1;
				else if (o1.score > o2.score)
					return -1;
				return 0;
			}

		};
		Collections.sort(playersList, comp);
		System.out.println("Reverse Sort" + playersList);

	}

}
