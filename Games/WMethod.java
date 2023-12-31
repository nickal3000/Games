//H.P.Compton
//This is used to store methods that are pulled from the wordle
package Games;

import java.util.Random;

public class WMethod {

	public static int wordCheck(char[] guess, char[] word) { // test guess against word
		// + = correct, ~ = char right in wrong spot, - = not

		char[] answer = { '-', '-', '-', '-', '-' }; // array to store correct
		boolean[] checked = { false, false, false, false, false }; // used to make sure repeat letter are not flagged

		int counter = 0; // counter = 5 = winner

		if (guess.length == 5) { // to check for invalid word

			for (int i = 0; i < guess.length; i++) {

				if (guess[i] == word[i]) {

					answer[i] = '+';
					checked[i] = true;

					counter = counter + 1;

				} else {

					for (int j = 0; j < guess.length; j++) {

						if (guess[i] == word[j] && !checked[j]) {

							checked[i] = true;
							answer[i] = '~';

						}
					} // end for j
				}
			} // end for i
			for (int i = 0; i < guess.length; i++) {
				// Source for how i learned to color
				// (https://www.tutorialspoint.com/how-to-print-colored-text-in-java-console)
				if (answer[i] == '+') {

					System.out.print("\u001B[32m" + guess[i] + "\u001B[0m"); // green

				} else if (answer[i] == '~') {
					System.out.print("\u001B[33m" + guess[i] + "\u001B[0m"); // yellow
				} else {
					System.out.print(guess[i]);

				}

			}
			System.out.println();
		} else {
			System.out.println("Invalid input your guess needs to be a 5 letters");

			return 2; // bad word
		}

		if (counter == 5) {

			return 1; // winner

		} else {

			return 0;// wrong

		} // end if else

	}// end check

	// Word database below (spoilers)

	public static String ranWord() {

		Random randy = new Random();

		// cheater
		String[] words = { "about", "alert", "argue", "beach", "above", "alike", "arise", "began", "abuse", "alive",
				"array", "begin", "actor", "allow", "aside", "begun", "acute", "alone", "asset", "being", "admit",
				"along", "audio", "below", "adopt", "alter", "audit", "bench", "adult", "among", "avoid", "billy",
				"after", "anger", "award", "birth", "again", "angle", "aware", "black", "agent", "angry", "badly",
				"blame", "agree", "apart", "baker", "blind", "ahead", "apple", "bases", "block", "alarm", "apply",
				"basic", "blood", "album", "arena", "basis", "board", "boost", "buyer", "china", "cover", "booth",
				"cable", "chose", "craft", "bound", "calif", "civil", "crash", "brain", "carry", "claim", "cream",
				"brand", "catch", "class", "crime", "bread", "cause", "clean", "cross", "break", "chain", "clear",
				"crowd", "breed", "chair", "click", "crown", "brief", "chart", "clock", "curve", "bring", "chase",
				"close", "cycle", "broad", "cheap", "coach", "daily", "broke", "check", "coast", "dance", "brown",
				"chest", "could", "dated", "build", "chief", "count", "dealt", "built", "child", "court", "death",
				"debut", "entry", "forth", "group", "delay", "equal", "forty", "grown", "depth", "error", "forum",
				"guard", "doing", "event", "found", "guess", "doubt", "every", "frame", "guest", "dozen", "exact",
				"frank", "guide", "draft", "exist", "fraud", "happy", "drama", "extra", "fresh", "harry", "drawn",
				"faith", "front", "heart", "dream", "false", "fruit", "heavy", "dress", "fault", "fully", "hence",
				"drill", "fibre", "funny", "night", "drink", "field", "giant", "horse", "drive", "fifth", "given",
				"hotel", "drove", "fifty", "glass", "house", "dying", "fight", "globe", "human", "eager", "final",
				"going", "ideal", "early", "first", "grace", "image", "earth", "fixed", "grade", "index", "eight",
				"flash", "grand", "inner", "elite", "fleet", "grant", "input", "empty", "floor", "grass", "issue",
				"enemy", "fluid", "great", "irony", "enjoy", "focus", "green", "juice", "enter", "force", "gross",
				"joint", "judge", "metal", "media", "newly", "known", "local", "might", "noise", "label", "logic",
				"minor", "north", "large", "loose", "minus", "noted", "laser", "lower", "mixed", "novel", "later",
				"lucky", "model", "nurse", "laugh", "lunch", "money", "occur", "layer", "lying", "month", "ocean",
				"learn", "magic", "moral", "offer", "lease", "major", "motor", "often", "least", "maker", "mount",
				"order", "leave", "march", "mouse", "other", "legal", "music", "mouth", "ought", "level", "match",
				"movie", "paint", "light", "mayor", "needs", "party", "peace", "power", "radio", "round", "panel",
				"press", "raise", "route", "phase", "price", "range", "royal", "phone", "pride", "rapid", "rural",
				"photo", "prime", "ratio", "scale", "piece", "print", "reach", "scene", "pilot", "prior", "ready",
				"scope", "pitch", "prize", "refer", "score", "place", "proof", "right", "sense", "plain", "proud",
				"rival", "serve", "plane", "prove", "river", "seven", "plant", "queen", "quick", "shall", "plate",
				"sixth", "stand", "shape", "point", "quiet", "roman", "share", "pound", "quite", "rough", "sharp",
				"sheet", "spare", "style", "times", "shelf", "speak", "sugar", "tired", "shell", "speed", "suite",
				"title", "shift", "spend", "super", "today", "shirt", "spent", "sweet", "topic", "shock", "split",
				"table", "total", "shoot", "spoke", "taken", "touch", "short", "sport", "taste", "tough", "shown",
				"staff", "taxes", "tower", "sight", "stage", "teach", "track", "since", "stake", "teeth", "trade",
				"sixty", "start", "texas", "treat", "sized", "state", "thank", "trend", "skill", "steam", "theft",
				"trial", "sleep", "steel", "their", "tried", "slide", "stick", "theme", "tries", "small", "still",
				"there", "truck", "smart", "stock", "these", "truly", "smile", "stone", "thick", "trust", "smith",
				"stood", "thing", "truth", "smoke", "store", "think", "twice", "solid", "storm", "third", "under",
				"solve", "story", "those", "undue", "strip", "three", "union", "sound", "stuck", "threw", "unity",
				"south", "study", "throw", "until", "space", "stuff", "tight", "upper", "upset", "whole", "waste",
				"wound", "urban", "whose", "watch", "write", "usage", "woman", "water", "wrong", "usual", "train",
				"wheel", "wrote", "valid", "world", "where", "yield", "value", "worry", "which", "witch" };
		// The word database source (https://byjus.com/english/5-letter-words/)
		// (used chatgbt to add "" and ,)

		// System.out.println(words.length);

		int wordNum = randy.nextInt(words.length);
		String word = words[wordNum];

		return word;

	}// end ran

}// end class
