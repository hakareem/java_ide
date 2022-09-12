class LongestName {
 public String longestName(String[] names) {
  String longest = "";

  // iterate over names list 
  for (String name : names){
   if (longest.length() < name.length()) {
    longest = name;
   }
  }
  return longest;
 }
}
