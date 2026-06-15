class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();

        StringBuilder current = new StringBuilder();
        int m = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                m = m * 10 + (ch - '0');
            } 
            else if (ch == '[') {
                countStack.push(m);
                stringStack.push(current);

                current = new StringBuilder();
                m = 0;
            } 
            else if (ch == ']') {
                int repeat = countStack.pop();
                StringBuilder prev = stringStack.pop();

                for (int i = 0; i < repeat; i++) {
                    prev.append(current);
                }

                current = prev;
                } 
            else {
                current.append(ch);
            }
        }

        return current.toString();
    }
}
