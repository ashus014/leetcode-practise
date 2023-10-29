package src.interviews.walmart_senior_software.set_1;

public class Round3_Problem1 {

    // Designing Spotify/ Amazon Music/ Airtel Wynk

    /*
    * Clarifying Questions :
    *
    * - Constrain the problem to make it solvable within the hour.
    * - Share what you know about the system with the interviewer.
    * - If you're not familiar with the system, they can fill you in.
    *
    * */

    // Spotify has the following functionality :

    /*
    * 1. Songs/ Music
    * 2. Playlists
    * 3. Users
    * 4. Artists
    * 5. Podcasts
    *
    * */

    // Use cases:

    /*
    *  - Finding and playing music
    *
    * */

    // Back to the Envelop estimations

    /*
    * Specify some key metrics to help your high level decision-making
    * In this case, the number of users and songs
    * You don't need to go into details of scaling at this point
    * */

    /*
    * - Users : 1 Billion
    * - Songs : 100 Million
    * - MP3 Audio : 5 MB
    * - Total Audio : 500 TB = 0.5 PB
    * - 3x replications -> 1.5 PB of raw audio data
    * - 100 Bytes of metadata (include artist name, songs name etc.)
    * - 10 GB Songs metadata
    * - 1KB per user metadata >> 1 TB
    *
    *
    * */

    // layout the basic component of your design
}
