import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        
        List<String> electronicsList = new ArrayList<>();
        List<String> groceryList = new ArrayList<>();
        List<String> pharmacyList = new ArrayList<>();
        List<String> restaurantList = new ArrayList<>();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < code.length; i++) {
            if (!isActive[i]) continue;
            if (!code[i].isEmpty() && containsNumberAndUnderscore(code[i])) {
                if (businessLine[i].equals("electronics")) {
                    electronicsList.add(code[i]);
                } else if (businessLine[i].equals("grocery")) {
                    groceryList.add(code[i]);
                } else if (businessLine[i].equals("pharmacy")) { 
                    pharmacyList.add(code[i]);
                } else if (businessLine[i].equals("restaurant")) {
                    restaurantList.add(code[i]);
                } 
            }
        }
        Collections.sort(electronicsList);
        for (int i = 0; i < electronicsList.size(); i++) {
            list.add(electronicsList.get(i));
        }
         Collections.sort(groceryList);
        for (int i = 0; i < groceryList.size(); i++) {
            list.add(groceryList.get(i));
        }
         Collections.sort(pharmacyList);
        for (int i = 0; i < pharmacyList.size(); i++) {
            list.add(pharmacyList.get(i));
        }
         Collections.sort(restaurantList);
        for (int i = 0; i < restaurantList.size(); i++) {
            list.add(restaurantList.get(i));
        }
        return list;
    }

     public static boolean containsNumberAndUnderscore(String text) {
        String regex = "[a-zA-Z0-9_]*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }
}