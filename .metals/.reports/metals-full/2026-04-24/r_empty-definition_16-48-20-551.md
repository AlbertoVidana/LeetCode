error id: file://<WORKSPACE>/Daily%20Question/2833.%20Furthest%20Point%20From%20Origin/Solution.java:java/lang/String#charAt().
file://<WORKSPACE>/Daily%20Question/2833.%20Furthest%20Point%20From%20Origin/Solution.java
empty definition using pc, found symbol in pc: java/lang/String#charAt().
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 196
uri: file://<WORKSPACE>/Daily%20Question/2833.%20Furthest%20Point%20From%20Origin/Solution.java
text:
```scala
class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int r = 0, l = 0, s = 0;
        
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt@@(i) == 'R') {
                r++;
            } else if (moves.charAt(i) == 'L') {
                l++;
            } else {
                s++;
            }
        }
        return Math.abs(r - l) + s;
    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: java/lang/String#charAt().