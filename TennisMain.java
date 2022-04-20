
import java.util.Random;

public class TennisMain {

	public static void main(String[] args) {
		
		String player1 = "leek";
		String player2 = "lily";
		
		TennisGame1 game = new TennisGame1();
		playGame(game);
		
		test();
	}

    public static void playGame(TennisGame tennisGame) {

    	Random random = new Random();
    
    	while(!tennisGame.isEnd()) {
    	    if(random.nextBoolean()) {
    	    	tennisGame.wonPoint("player1");
    	    } else {
    	    	tennisGame.wonPoint("player2");
    	    }
    	    System.out.println(tennisGame.getLiteralScore());
    	}
	}
    
    public static void test() {
    	testCase1();
    	testCase2();
    	testCase3();
    	testCase4();
    }
    
    public static boolean testCase1() {
    	String[][] testSet = {
    			{"player1", "Fifteen-Love"},
    			{"player1", "Thirty-Love"},
    			{"player1", "Forty-Love"},
    			{"player1", "Win for player1"},
    			{"player1", "Win for player1"}
    	};
    	System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    	
    	TennisGame1 game = new TennisGame1();
    	for(int i = 0; i < testSet.length; ++i) {
    		game.wonPoint(testSet[i][0]);
    		if (!testSet[i][1].equals(game.getLiteralScore())) {
    			System.out.println("-> failed ("+ i + "-th expected : '" + testSet[i][1] + "', but '" + game.getLiteralScore() + "')");
    			return false;
    		} 
    	}
    	System.out.println("-> passed");
    	return true;
    }
    
    public static boolean testCase2() {
    	String[][] testSet = {
    			{"player2", "Love-Fifteen"},
    			{"player2", "Love-Thirty"},
    			{"player2", "Love-Forty"},
    			{"player2", "Win for player2"},
    			{"player2", "Win for player2"}
    	};
    	System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    	
    	TennisGame1 game = new TennisGame1();
    	for(int i = 0; i < testSet.length; ++i) {
    		game.wonPoint(testSet[i][0]);
    		if (!testSet[i][1].equals(game.getLiteralScore())) {
    			System.out.println("-> failed ("+ i + "-th expected : '" + testSet[i][1] + "', but '" + game.getLiteralScore() + "')");
    			return false;
    		} 
    	}
    	System.out.println("-> passed");
    	return true;
    }
    
    public static boolean testCase3() {
    	String[][] testSet = {
    			{"player1", "Fifteen-Love"},
    			{"player2", "Fifteen-All"},
    			{"player1", "Thirty-Fifteen"},
    			{"player2", "Thirty-All"},
    			{"player1", "Forty-Thirty"},
    			{"player2", "Deuce"},
    			{"player1", "Advantage player1"},
    			{"player2", "Deuce"},
    			{"player1", "Advantage player1"},
    			{"player1", "Win for player1"},
    	};
    	System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    	
    	TennisGame1 game = new TennisGame1();
    	for(int i = 0; i < testSet.length; ++i) {
    		game.wonPoint(testSet[i][0]);
    		if (!testSet[i][1].equals(game.getLiteralScore())) {
    			System.out.println("-> failed ("+ i + "-th expected : '" + testSet[i][1] + "', but '" + game.getLiteralScore() + "')");
    			return false;
    		} 
    	}
    	System.out.println("-> passed");
    	return true;
    }
    
    public static boolean testCase4() {
    	String[][] testSet = {
    			{"player2", "Love-Fifteen"},
    			{"player1", "Fifteen-All"},
    			{"player2", "Fifteen-Thirty"},
    			{"player1", "Thirty-All"},
    			{"player2", "Thirty-Forty"},
    			{"player1", "Deuce"},
    			{"player2", "Advantage player2"},
    			{"player1", "Deuce"},
    			{"player2", "Advantage player2"},
    			{"player2", "Win for player2"},
    	};
    	System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    	
    	TennisGame1 game = new TennisGame1();
    	for(int i = 0; i < testSet.length; ++i) {
    		game.wonPoint(testSet[i][0]);
    		if (!testSet[i][1].equals(game.getLiteralScore())) {
    			System.out.println("-> failed ("+ i + "-th expected : '" + testSet[i][1] + "', but '" + game.getLiteralScore() + "')");
    			return false;
    		} 
    	}
    	System.out.println("-> passed");
    	return true;
    }
}

