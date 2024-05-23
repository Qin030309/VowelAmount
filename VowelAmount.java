import java.util.*;
import java.util.stream.Collectors;
//to convert map to comma-seperated string
class HelloWorld {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);// Create a Scanner object
        System.out.print("Enter a sentence :");
        String sentence = myObj.nextLine(); 
        EachVowelAmount1(sentence);
        //output the first sentence as the assignment required
        EachVowelAmount2(sentence);
        //output the second sentence as the assignemnt requried
        TotalVowelAmount(sentence);
        //output the total amount of vowels
    }
        public static void EachVowelAmount1(String sentence){
        /**this function outputs the sentence which represents each vowel amount in sentence by order: 'a', 'e', 'i', 'o', 'u'.
         * @param the sentence the user has input
         * @return none
         */
        Map<Character,Integer> amount1 = new LinkedHashMap<Character,Integer>();
        //create a new map which store vowels as keys and amount of vowels as values, use linkedHashMap for storing key in desired order
        int n = sentence.length();
        //initialize count number and calculate the each vowel amount in sentence through iteration
        int count1 = 0;
        for(int i = 0; i <n; i++){
            if(sentence.charAt(i)== 'a'){
               count1++;}}
        amount1.put('a',count1);
        //put each vowel and each vowel's amount into map
        int count2 = 0;
        for(int i = 0; i <n; i++){
            if(sentence.charAt(i)== 'e'){
               count2++;}}
        amount1.put('e',count2);
        int count3 = 0;
        for(int i = 0; i <n; i++){
            if(sentence.charAt(i)== 'i'){
               count3++;}}
        amount1.put('i',count3);
        int count4 = 0;
        for(int i = 0; i <n; i++){
            if(sentence.charAt(i)== 'o'){
               count4++;}}
        amount1.put('o',count4);
        int count5 = 0;
        for(int i = 0; i <n; i++){
            if(sentence.charAt(i)== 'u'){
               count5++;}}
        amount1.put('u',count5);
        //convert the map's content into stirng and outprint it
        System.out.print("{");
        String str = amount1.entrySet().stream().map(e -> "'"+e.getKey()+"'" + ":" + e.getValue())
                .collect(Collectors.joining(","));
        //this string is created by amount's key and value seperated by comma and enclosed by "}"
 
        System.out.print(str);
        System.out.print("}"+'\n');
        

        }
       
    
    public static void EachVowelAmount2(String sentence){
         /**this function outputs the sentence which represents each vowel amount in sentence by order: 'u', 'o', 'i', 'e', 'a'.
         * @param the sentence the user has input
         * @return none
         */
        Map<Character,Integer> amount = new LinkedHashMap<Character,Integer>();
        //create a new map which store vowels as keys and amount of vowels as values, use linkedHashMap for storing key in desired order
        int n = sentence.length();
        //initialize count number and calculate the each vowel amount in sentence through iteration
        int count1 = 0;
        for(int i = 0; i <n; i++){
            if(sentence.charAt(i)== 'u'){
               count1++;}}
        amount.put('u',count1);
        //put each vowel and each vowel's amount into map
        int count2 = 0;
        for(int i = 0; i <n; i++){
            if(sentence.charAt(i)== 'o'){
               count2++;}}
        amount.put('o',count2);
        int count3 = 0;
        for(int i = 0; i <n; i++){
            if(sentence.charAt(i)== 'i'){
               count3++;}}
        amount.put('i',count3);
        int count4 = 0;
        for(int i = 0; i <n; i++){
            if(sentence.charAt(i)== 'e'){
               count4++;}}
        amount.put('e',count4);
        int count5 = 0;
        for(int i = 0; i <n; i++){
            if(sentence.charAt(i)== 'a'){
               count5++;}}
       amount.put('a',count5);
       //convert the map's content into stirng and outprint it
       System.out.print("[");
       String str = amount.entrySet().stream().map(e -> "("+"'"+e.getKey()+"'" + ":" + e.getValue()+")")
                .collect(Collectors.joining(","));
       //this string is created by amount's key and value seperated by comma and enclosed by "]"
        System.out.print(str);
        System.out.print("]"+'\n');

  
    }
    
    public static void TotalVowelAmount(String sentence){
         /**this function outputs the total amount of vowels in the sentence
         * @param the sentence the user has input
         * @return none
         */
        int count = 0;
        //initialize the int count
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == 'u') {
                count++;
                //whenever the character in sentence is lowercased vowel, the count will increase by 1
            }
            if (sentence.charAt(i) == 'o') {
                count++;
            }
            if (sentence.charAt(i) == 'i') {
                count++;
            }
            if (sentence.charAt(i) == 'e') {
                count++;
            }
            if (sentence.charAt(i) == 'a') {
                count++;
            }
        }
        //outprint how many vowels in this sentence
        System.out.println("There are "+count+" vowels in this sentence");
        
        
}
}