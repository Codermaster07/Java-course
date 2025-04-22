/* what is string?
String is a sequence of characters. 
It is used to represent text rather than numbers. 
In Java, strings are objects that are immutable, meaning once created, their values cannot be changed. 
Strings can be created using string literals or the String class constructor.
*/

/*  how to create a string?
// 1. Using string literals: String str = "Hello, World!";
// 2. Using the String class constructor: String str = new String("Hello, World!");
// 3. Using char array: char[] charArray = {'H', 'e', 'l', 'l', 'o'}; String str = new String(charArray) */

// common string methods
// 1. length(): Returns the length of the string.
// 2. charAt(int index): Returns the character at the specified index. 
// 3. substring(int beginIndex, int endIndex): Returns a substring from the specified begin and end index.
// 4. indexOf(String str): Returns the index of the first occurrence of the specified substring.
// 5. lastIndexOf(String str): Returns the index of the last occurrence of the specified substring.
// 6. toUpperCase(): Converts the string to uppercase.
// 7. toLowerCase(): Converts the string to lowercase.
// 8. trim(): Removes leading and trailing whitespace from the string.
// 9. split(String regex): Splits the string into an array of substrings based on the specified regular expression.
// 10. replace(char oldChar, char newChar): Replaces all occurrences of the specified character with a new character.
// 11. equals(Object obj): Compares the string with the specified object for equality.
// 12. equalsIgnoreCase(String str): Compares the string with the specified string, ignoring case differences.
// 13. contains(CharSequence sequence): Checks if the string contains the specified sequence of characters.

// return the length of the string
// class string{
//     public static void main(String[] args) {
//         String str1 = "hello world";
//         System.out.println("length of the string is " + str1.length());
//     }
// }

// return the character at the specified index
// class string{
//     public static void main(String[] args) {
//         String str1 = "harsh chouksey";
//         System.out.println("character at index 5 is " + str1.charAt(7));

//     }
// }
// count the no. of frequency present in the string
class string{
    public static void main(String[] args) {
        String str1 = "harsh chouksey";
        int count = 0;
        char[] arr= str1.toCharArray();
        for(int i = 0; i < arr.length; i++) {
            count = 0;
            for(int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
        

            }
            System.err.println("character " + arr[i] + " is present " + count + " times in the string");
        }
        
    }
}


