package com.sunilbooks.selflearnjava.thread;

/**
 * Represents a player thread in a thread group that simulates playing matches.
 * 
 * <p>
 * This class extends {@code Thread} and is used to create and manage player
 * threads within a specific thread group. Each player thread outputs its match
 * progress to the console.
 * </p>
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class PlayerThread extends Thread {

	/**
	 * Constructor that initializes the player thread with a specified thread group
	 * and name.
	 * 
	 * @param tg   the {@code ThreadGroup} to which this thread belongs
	 * @param name the name of this thread
	 */
	public PlayerThread(ThreadGroup tg, String name) {
		super(tg, name);
	}

	/**
	 * Runs the thread, simulating matches played by the player.
	 * 
	 * <p>
	 * This method loops through a series of matches, printing the match number and
	 * the player's name to the console for each match played.
	 * </p>
	 */
	@Override
	public void run() {
		for (int match = 1; match < 10; match++) {
			String msg = getName();
			msg += " played match#" + match;
			System.out.println(msg);
		}
	}

	/**
	 * Creates a thread group and starts multiple player threads within this group.
	 * 
	 * <p>
	 * This method demonstrates the creation of a {@code ThreadGroup}, the
	 * instantiation of {@code PlayerThread} objects within that group, and prints
	 * information about the thread group.
	 * </p>
	 * 
	 * @param args command-line arguments (not used)
	 */
	public static void main(String[] args) {
		// Create a thread group named "Team India"
		ThreadGroup team = new ThreadGroup("Team India");

		// Create player threads within the "Team India" group
		PlayerThread p1 = new PlayerThread(team, "Jay");
		PlayerThread p2 = new PlayerThread(team, "Vijay");
		p1.start();
		p2.start();

		// Print thread group information
		System.out.println("Thread Group Info");
		System.out.println("Name: " + team.getName());
		System.out.println("Parent Group: " + team.getParent());

		// Number of active threads in the group
		System.out.println("Active Threads: " + team.activeCount());
		// Number of active subgroups in the group
		System.out.println("Active Subgroups: " + team.activeGroupCount());
	}
}
