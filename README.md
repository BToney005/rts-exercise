# RTS Labs Exercise
**Author:** Brandon Toney  
**Date:** 2021-08-31  
**Language:** Java  
**To Compile:** ```javac Main.java```  
**To Run:** ```java Main.java``` 


### 1) Print the number of integers in an array that are above the given input and the number that are below, e.g. for the array [1, 5, 2, 1, 10] with input 6, print "above: 1, below: 4"
Implementation and function call can be found at:

**Main.java:8:**  

    public static void printIntegersAboveBelow(int arr[], int inputNum) { ... }


**Main.java:55:** 

    printIntegersAboveBelow(array, 6);

### 2)  Rotate the characters in a string by a given input and have the overflow appear at the beginning, e.g. "MyString" rotated by 2 is "ngMyStri"
Implementation and function calls can be found at:

**Main.java:29:** 

	public static String rotateString(String str, int dist) { ... }

**Main.java:61-64:**

	int rotateN[] = {2, -3, 12, -9, 0}; 
	for (int  n  :  rotateN) { 
		System.out.printf("Rotate(%d): %s\n",n, rotateString(str, n)); 
	}   

**Tests:**  
- *Rotate("MyString", [dist]) => "[output]"*
- Rotate(..., 2) => "ngMyStri"
- Rotate(..., -3) => "tringMyS"
- Rotate(..., 12) => "ringMySt"
- Rotate(..., -9) => "yStringM"
- Rotate(..., 0) => "MyString"

### 3)  If you could change 1 thing about your favorite framework/language/platform (pick one), what would it be?

My favorite framework is Laravel. If I could change one thing about it, I'd make the ORM more efficient for complex queries. While it's possible to query using raw SQL, additional database requests are still required to make use of Laravel's models once the data has been retrieved. That's not a big deal, but it'd be a nice quality of life upgrade.
