package it.unibo.oop.lab.enum1;

import it.unibo.oop.lab.enum1.SportSocialNetworkUserImpl;
import it.unibo.oop.lab.socialnetwork.User;

/**
 * This is going to act as a test for
 * {@link it.unibo.oop.lab.enum1.SportSocialNetworkUserImpl}
 * 
 * 1) Realize the same test as the previous exercise, this time using
 * enumeration Sport
 * 
 * 2) Run it: every test must return true.
 * 
 */
public final class TestSportByEnumeration {

    private TestSportByEnumeration() { }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String... args) {
        /*
         * [TEST DEFINITION]
         * 
         * By now, you know how to do it
         */
        // TODO
    	final SportSocialNetworkUserImpl<User> dcassani = new SportSocialNetworkUserImpl<User>("Davide","Cassani" , "dcassani", 53);
        final SportSocialNetworkUserImpl<User> becclestone = new SportSocialNetworkUserImpl<User>("Bernie","Ecclestone" , "becclestone", 83);
        
        dcassani.addSport(Sport.BIKE);
        dcassani.addSport(Sport.MOTOGP);
        System.out.println("Cassani has been a professional biker: "
                + dcassani.hasSport(Sport.BIKE));
        System.out.println("Cassani does not like soccer: " + !dcassani.hasSport(Sport.SOCCER));
    }
}
